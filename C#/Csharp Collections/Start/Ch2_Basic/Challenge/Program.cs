using System;
using System.Collections.Generic;

namespace Challenge
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, (double, int)> sList = new Dictionary<string, (double, int)>();

            sList.Add("Apples", (0.95d, 6));
            sList.Add("Milk", (2.25d, 1));
            sList.Add("Sugar", (1.75d, 2));
            sList.Add("Bread", (3.25d, 1));
            sList.Add("Butter", (4.95d, 1));
            sList.Add("Cookies", (0.50d, 4));
            sList.Add("Oranges", (0.65d, 5));
            sList.Add("Chicken", (8.95d, 1));
            
            foreach((string key, (double, int) data) in sList){
                Console.WriteLine($"Item:  {key}, Price:  ${data.Item1}, Quantity: {data.Item2}");
            }
        }
    }
}
