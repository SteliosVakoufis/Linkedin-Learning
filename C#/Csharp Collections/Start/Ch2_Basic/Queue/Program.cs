using System;
using System.Collections.Generic;

namespace QueueExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // Create an empty Queue that holds strings
            Queue<string> myQ = new Queue<string>();

            // Add items to the end of the queue
            myQ.Enqueue("one");
            myQ.Enqueue("two");
            myQ.Enqueue("three");
            myQ.Enqueue("four");
            myQ.Enqueue("five");

            // use the count property to see how many items there are
            Console.WriteLine($"Queue size: {myQ.Count}");

            // Queues can be iterated without changing the structure
            foreach(string str in myQ){
                Console.WriteLine($"{str}");
            }

            // peek at the front of the queue
            Console.WriteLine($"Peek fucntion returns: {myQ.Peek()}");
            
            // remove items from the front of the queue
            Console.WriteLine($"Dequeue function returns: {myQ.Dequeue()}, new item count is {myQ.Count}");

            // see if the queue contains an item
            Console.WriteLine($"Does myQ contain \"one\"? Bool: {myQ.Contains("one")}");
            Console.WriteLine($"Does myQ contain \"two\"? Bool: {myQ.Contains("two")}");

            // Remove all the items
            myQ.Clear();
            Console.WriteLine($"myQ has been cleared via the Clear function, new item count is {myQ.Count}");
        }
    }
}
