import sqlite3, cgi, cgitb, os

conn = sqlite3.connect('login.db')
c = conn.cursor()
c.execute("CREATE TABLE login (user text,pwd text)")
c.execute("INSERT INTO login VALUES ('prahlad','12345678')")
conn.commit()


form = cgi.FieldStorage()

usern = form.getvalue('username')
pwd  = form.getvalue('password')

user=c.execute("SELECT id FROM login")
print user
passw= c.execute("SELECT pwd FROM login")
print passw
if user==usern and passw==pwd:
    print "<p> success </p>"
    
