import sqlite3
def selectionSort(list1):
   for i in range(len(list1)-1,0,-1):
       pos=0
       for j in range(1,i+1):
           if list1[j]>list1[pos]:
               pos = j

       temp = list1[i]
       list1[i] = list1[pos]
       list1[pos] = temp

conn = sqlite3.connect('test.db')
print("Student DB")
conn.execute("DROP TABLE STUDENT")
conn.execute('''CREATE TABLE IF NOT EXISTS STUDENT (ID INT NOT NULL,NAME TEXT NOT NULL);''')
print("Table created");
conn.execute("INSERT INTO STUDENT (ID,NAME) VALUES (1,'Prahlad')");
conn.execute("INSERT INTO STUDENT (ID,NAME) VALUES (2,'Shubhi')");
conn.execute("INSERT INTO STUDENT (ID,NAME) VALUES (3,'Akshat')");
conn.execute("INSERT INTO STUDENT (ID,NAME) VALUES (4,'Karthik')");
conn.execute("INSERT INTO STUDENT (ID,NAME) VALUES (5,'Amith')");
conn.commit()
print("Records created!")
print("Data stored in DB - ")
cursor = conn.execute("SELECT ID,NAME FROM STUDENT")
list1=[]

for row in cursor:
    list1.append(row[1])
    print ("ID = ",row[0])
    print ("NAME = ",row[1],"\n")
    
print(list1)
print("Sorting according to name")
selectionSort(list1)
print(list1)
conn.close()
