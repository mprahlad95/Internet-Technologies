s=input("Enter a string ")
n=len(s)
s1=""
for i in range(n-1,-1,-1):
        s1=s1+s[i]
if(s==s1):
        print("Ofcourse %s is a %s Palindrome -__-" %(s,s))
else:
        print("LOL NOOB. {} is not a palindrome.".format(s))
        

    
