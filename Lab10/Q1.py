states="Mississippi Alabama Texas Massachusetts Kansas"
stateslist = [""] * 10
state=states.split(" ")
for i in state:
     if(i[len(i)-3:] == "xas"):
         stateslist[0]=i
     
   
for i in state:
    if((i[0:1:] == 'K' or i[0:1:]=='k') and i[len(i)-1:len(i):] == 's'):
         stateslist[1]=i
    if(i[0:1:] == 'M' and i[len(i)-1:len(i):] == 's'):
         stateslist[2]=i
    if(i[len(i)-1:len(i):] == 'a'):
         stateslist[3]=i
    if(states[0] == 'M'):
         stateslist[4]=state[0]

print (stateslist[0:5])

