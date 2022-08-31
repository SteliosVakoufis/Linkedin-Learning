def doFancyStuff(myString):
    result = ""
    for i in myString:
        result += i
    
    return result.upper()

#👇🏼 Main program 👇🏼
myString = "Hello World!"

for i in range(0, 10, 1):
    print(f"Message: {myString} | repeat: {i.numerator + 1}")
    if myString == "Hello World":
        break

notMyString = doFancyStuff(myString)
print(notMyString)
