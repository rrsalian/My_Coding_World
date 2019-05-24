n=int(input("Enter a number :"))

if(n%3==0 and n%5==0):
    print("Fuzz-Buzz")
elif (n%3==0):
    print("Fuzz")
elif (n%5==0):
    print("Buzz")