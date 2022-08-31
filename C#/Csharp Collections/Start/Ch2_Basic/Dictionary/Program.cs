using System;
using System.Collections.Generic;

namespace DictionaryExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // Dictionaries map keys to values. Keys must be unique
            Dictionary<string, string> myDictionary = new Dictionary<string, string>();

            // add some keys and values to the dictionary
            myDictionary.Add(".bmp", "Bitmap File");
            myDictionary.Add(".txt", "Text File");
            myDictionary.Add(".html", "HTML Document");
            myDictionary.Add(".jpg", "JPEG Image");

            // use the Count property to see how many items there are
            Console.WriteLine($"Item count: {myDictionary.Count}");
            
            // Trying to add an existing key will throw an exception
            // myDictionary.Add(".txt", "Just plain text");

            // The TryAdd function makes it convenient to see if there's a duplicate
            Console.WriteLine($"Trying to add \".txt\" key, Success: {myDictionary.TryAdd(".txt", "Just plain text")}");
            
            // Dictionaries are also like associative arrays
            Console.WriteLine($"Value of \".bmp\": {myDictionary[".bmp"]}");

            // This way, setting an existing key just overwrites the value


            // See if the Dictionary contains an key or a value


            // Remove items

            // BORED ALREADY KNOW ALL THIS LOL 
        }
    }
}
