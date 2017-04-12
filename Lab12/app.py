#!C:\Python27\python.exe
import cgi, cgitb, sqlite3
form = cgi.FieldStorage()
user_name = form.getvalue('username')
password  = form.getvalue('password')
conn=sqlite3.connect('test.db')
login='Unsuccessful'
x='a'
y='b'
z='c'

conn.execute('''CREATE TABLE IF NOT EXISTS PASSDATA
			  (USERNAME TEXT NOT NULL,
			  PASSWORD TEXT);''')
conn.execute('''CREATE TABLE IF NOT EXISTS DETAILS
			  (NAME TEXT NOT NULL,
			  COURSE TEXT,
			  MARKS TEXT);''')
conn.close()

conn=sqlite3.connect('test.db')
conn.execute("INSERT INTO PASSDATA(USERNAME,PASSWORD) \
			VALUES('Prahlad','12345678')");
conn.execute("INSERT INTO DETAILS(NAME,COURSE,MARKS) \
			VALUES('Prahlad','Maths','39')");
		
conn.commit()
conn.close()

conn=sqlite3.connect('test.db')
cursor=conn.execute("SELECT username,password from PASSDATA")

for row in cursor:
    if(user_name==row[0]):
        if(password==row[1]):
            login='Successful'
cursor=conn.execute("SELECT NAME,COURSE,MARKS from DETAILS")
if login == 'Successful':
	for row in cursor:
		if(user_name==row[0]):
			x=row[0]
			y=row[1]
			z=row[2]
			
conn.close()
print "Content-type:text/html\r\n\r\n"
print "<html>"
print "<title>Lab 12</title>"
print "<h1>Login is:%s </h1>" % (login)
print "<h1>Name is:%s </h1>" % (x)
print "<h1>Course is:%s </h1>" % (y)
print "<h1>Marks is:%s </h1>" % (z)
print "</html>"