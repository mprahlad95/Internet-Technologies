
print("Input the matrix 2x2")
matrix1 = [[0]*2 for i in range(2)]
matrix2 = [[0]*2 for i in range(2)]
result= [[0]*2 for i in range(2)]
for i in range(0,2):
    for j in range(0,2):
        matrix1[i][j]=int(input("Enter row {} column {} ".format(i,j)))
        
for i in range(0,2):
    for j in range(0,2):
        matrix2[i][j]=int(input("Enter row {} column {} ".format(i,j)))

for i in range(0,2):
    for j in range(0,2):
        for k in range(0,2):
          result[i][j]+=matrix1[i][k]*matrix2[k][j]
    print "\n"

print "Multiplied matrix is"
i=0
for i in result:
   print(i)
