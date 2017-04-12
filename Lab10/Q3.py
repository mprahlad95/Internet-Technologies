#!C:\Python27\python.exe
# -*- coding: UTF-8 -*-

import cgi,cgitb,os


print "Content-type:text/html\r\n\r\n"
print "<html>"
print "<title>Q3</title>"
print "Client IP Address: %s" % (os.environ["REMOTE_ADDR"])
print "</html>"
