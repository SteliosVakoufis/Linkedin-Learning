import random
import requests

def giveMeRandomWords(amount):
    ourWords = requests.get("https://www.mit.edu/~ecprice/wordlist.10000")
    words = []
    randomWords = []
    wordBuffer = ""

    for i in ourWords.text:
        if i == "\n":
            words.append(wordBuffer)
            wordBuffer = ""
            continue
        wordBuffer += i

    if amount > len(words):
        amount = len(words)

    for i in range(0, amount):
        rwIndex = int(random.random() * len(words))
        randomWords.append([rwIndex, words[rwIndex]])

    return randomWords

print(giveMeRandomWords(5))
