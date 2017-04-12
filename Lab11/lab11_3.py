import sqlite3
import re
def namevalid(name):
    if((len(name)<=0)):
        print("Enter name")
        return False
    if "[.,@$!/]" in name:
        print("No special characters in the name")
        return False
    else:
        print("Valid name")
        return True
def agevalid(age):
    if int(age)<0 :
        print("Invalid age")
        return False
    else:
        print("Valid age")
        return True
def emailvalid(email):
    if len(email) > 7:
        if re.match("^.+\\@(\\[?)[a-zA-Z0-9\\-\\.]+\\.([a-zA-Z]{2,3}|[0-9]{1,3})(\\]?)$", email) != None:
            print("Valid email")
            return True
    else:
        print("Invalid email")
        return False
def numbervalid(number):
    if len(number) == 10:
        if re.match("^[789]{1}[0-9]{9}",number) != None:
            print("Valid number")
            return True
    else:
        print("Invalid number")
        return False
    
print("Enter details")
name = input("Enter name");
age=input("Enter age")
email=input("Enter email-id")
number = input("Enter mobile number")
a=namevalid(name)
b=agevalid(age)
c=emailvalid(email)
d=numbervalid(number)
if a==True and b==True and c==True and d==True: 
    conn = sqlite3.connect('test.db')
    print("Form DB")
    conn.execute("DROP TABLE FORM")
    conn.execute('''CREATE TABLE IF NOT EXISTS FORM (NAME TEXT NOT NULL,AGE INT NOT NULL,EMAIL TEXT NOT NULL, PHONE TEXT NOT NULL);''')
    print("Table created");
    conn.execute("INSERT INTO FORM (NAME,AGE,EMAIL,PHONE) VALUES ('"+name+"','"+age+"','"+email+"','"+number+"')");

    conn.commit()
    print("Record created")
    print("Data in DB- ")
    cursor = conn.execute("SELECT NAME,AGE,EMAIL,PHONE FROM FORM")
    for row in cursor:
        print ("NAME = ",row[0])
        print ("AGE = ",row[1])
        print ("EMAIL = ",row[2])
        print ("PHONE = ",row[3])
    conn.close()
else:
    print("Values haven't been entered in DB")
