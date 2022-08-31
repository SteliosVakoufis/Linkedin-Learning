"""
Python Data Structures - A Game-Based Approach
BFS maze solver.
Robin Andrews - https://compucademy.net/
The queue contains positions as (row, column) tuples. Predecessors are kept in a dictionary.
"""

from helpers import get_path, offsets, is_legal_pos, read_maze
from queue_ll import Queue


def bfs(maze, start, goal):
    q = Queue()
    q.enqueue(start)

    predecessors = {start: None}
    while not q.is_empty():
        current_cell = q.dequeue()
        if current_cell == goal:
            return get_path(predecessors, start, goal)
        else:
            for direction in offsets.keys():
                neighbour = (current_cell[0] + offsets[direction][0],
                             current_cell[1] + offsets[direction][1])
                if is_legal_pos(maze, neighbour) and neighbour not in predecessors:
                    q.enqueue(neighbour)
                    predecessors[neighbour] = current_cell
    return None



if __name__ == "__main__":
    # Test 1
    maze = [[0] * 3 for row in range(3)]
    start_pos = (0, 0)
    goal_pos = (2, 2)
    result = bfs(maze, start_pos, goal_pos)
    assert result == [(0, 0), (0, 1), (0, 2), (1, 2), (2, 2)]
    print("Test 1 succesful!")

    # Test 2
    maze = read_maze("mazes/mini_maze_bfs.txt")
    # for row in maze:
    #     print(row)
    start_pos = (0, 0)
    goal_pos = (2, 2)
    result = bfs(maze, start_pos, goal_pos)
    assert result == [(0, 0), (1, 0), (1, 1), (1, 2), (2, 2)]
    print("Test 2 succesful!")

    # Test 3
    maze = read_maze("mazes/mini_maze_bfs.txt")
    start_pos = (0, 0)
    goal_pos = (3, 3)
    result = bfs(maze, start_pos, goal_pos)
    assert result is None
    print("Test 3 succesful!")

    # Test 4
    maze = read_maze("mazes/challenge_maze.txt")
    start_pos = (0, 0)
    goal_pos = (3, 3)
    result = bfs(maze, start_pos, goal_pos)
    for path in result:
        maze[path[0]][path[1]] = "@"
    for row in maze:
        print(row)
    assert result == [(0, 0), (0, 1), (1, 1), (1, 2), (2, 2), (3, 2), (3, 3)]
    print("Challenge succesful!")
