a=int(input("Enter no of terms:"))

def fib(a):
    if a<=1:
        return a
    else:
        return(fib(a-1)+fib(a-2))
    

if a==1:
    print("1")
elif a==2:
    print("1,2")
else:
    for k in range(a):
        print(fib(k))
