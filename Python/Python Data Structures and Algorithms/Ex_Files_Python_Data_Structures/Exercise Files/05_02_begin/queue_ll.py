"""
Python Data Structures - A Game-Based Approach
Queue class
Robin Andrews - https://compucademy.net/
"""

from collections import deque


class Queue:
    def __init__(self) -> None:
        self.items = deque()

    def is_empty(self) -> bool:
        return not self.items

    def enqueue(self, item) -> None:
        self.items.append(item)

    def dequeue(self) -> deque:
        return self.items.popleft()

    def size(self) -> int:
        return len(self.items)
    
    def peek(self):
        return self.items[0]

    def __str__(self) -> str:
        return str(self.items)


if __name__ == "__main__":

    # Test 1
    q = Queue()
    q.enqueue("A")
    q.enqueue("B")
    q.enqueue("C")
    print(q.items)
    print(q.dequeue())
    print(q.items)
    print(q.size())
    print(q.peek())

    # Test 2
    q = Queue()
    q.enqueue("Learning")
    q.enqueue("with")
    q.dequeue()
    q.enqueue("Linked")
    q.enqueue("In")
    q.dequeue
    print(q)
    