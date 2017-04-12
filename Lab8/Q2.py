
n=int(input("Enter number of natural numbers "))

def sum(n):
     if(n<=1):
       return n
     else:
       return n+ sum(n-1)

print("Sum of {} natural numbers = {} ".format(n,sum(n)))
