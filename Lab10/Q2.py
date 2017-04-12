import cgi, cgitb
form = cgi.FieldStorage()
user = form.getvalue('username')
pwd  = form.getvalue('password')

if username=='prahlad':
    print "<html>"
    print "%s" % user
    print "</html>"
