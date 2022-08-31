using System;
using System.Collections.Generic;

namespace ListExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // Define some strings to add to the list
            string[] comedians = {"Leo Gallagher", "Rodney Dangerfield",
                                "George Carlin", "Lenny Bruce",
                                "Eddie Murphy", "Louie Anderson"};
            // TODO: Create the list
            List<string> strList = new List<string>(10);

            // TODO: Add some elements to the list from an existing array
            strList.AddRange(comedians);

            // TODO: Add individual items
            strList.Add("Tina Fey");
            strList.Add("John Xina");

            // TODO: Examine the Count and Capacity
            Console.WriteLine($"Count and capacity: {strList.Count}, {strList.Capacity}");
            
            // TODO: Enumerate the items in the list with a foreach loop
            PrintList(strList);

            // TODO: Access any item by its index
            Console.WriteLine($"Item value: {strList[4]}");
            
            // TODO: Remove items from the list
            strList.RemoveAt(2);
            strList.Remove("Tina Fey");

            // TODO: Sort the list content
            strList.Sort();
            PrintList(strList);

            // ** Searching List Content **/

            // TODO: Determine if a list contains a given item
            Console.WriteLine($"Is John Xina in there? {strList.Contains("John Xina")}");
            
            // TODO: The Exists function gives us a more customizable way to search
            // by using a predicate function to examine each element in the list
            Console.WriteLine($"Name longer than 10 characters? Bool: {strList.Exists(x => x.Length > 10)}");
            
            // TODO: Use the Find function to search through items
            Console.WriteLine($"Find first element on the list that start with the letter L");
            Console.WriteLine($"{strList.Find(x => x.StartsWith("L"))}");

            // TODO: The FindAll function can find multiple items
            PrintList(strList.FindAll(x => x.StartsWith("L")));

            // TODO: Use TrueForAll to see if a given condition is true for all elements
            Console.WriteLine($"is each item length > 20? Bool: {strList.TrueForAll(x => x.Length > 20)}");
            
        }

        static void PrintList(List<string> theList)
        {
            foreach (string str in theList)
            {
                Console.WriteLine(str);
            }
        }
    }
}
