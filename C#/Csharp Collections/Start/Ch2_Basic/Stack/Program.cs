using System;
using System.Collections.Generic;

namespace StackExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // TODO: Create an empty stack
            Stack<string> myStack = new Stack<string>();

            // TODO: The Push function pushes new elements onto the stack
            myStack.Push("one");
            myStack.Push("two");
            myStack.Push("three");
            myStack.Push("four");
            myStack.Push("five");

            // TODO: The Count property indicates how many elements are on the stack
            Console.WriteLine($"Item count is: {myStack.Count}");

            // TODO: Stacks can be enumerated in place without changing the content
            foreach(string str in myStack){
                Console.WriteLine($"{str}");
            }

            // TODO: The Peek function examines the current top element but does not remove it
            Console.WriteLine($"Peek returns: {myStack.Peek()}");

            // TODO: The Pop function removes an element from the top
            Console.WriteLine($"Pop returns: {myStack.Pop()} and new item count is: {myStack.Count}");

            // TODO: Search for an element using Contains
            Console.WriteLine($"Does the stack contain \"five\"? Bool: {myStack.Contains("five")}");
            Console.WriteLine($"Does the stack contain \"one\"? Bool: {myStack.Contains("one")}");
        }
    }
}
