#!C:\Perl\bin\perl.exe
print "Content-type: text/html\n\n";
print "<font size=+1>Environment Variables<br></font>\n";

print "<b>SERVER NAME</b>         : $ENV{'SERVER_NAME'}<br>\n";
print "<b>SERVER SOFTWARE</b>     : $ENV{'SERVER_SOFTWARE'}<br>\n";
print "<b>SERVER PROTOCOL</b>     : $ENV{'SERVER_PROTOCOL'}<br>\n";
print "<b>CGI REVISION</b>        : $ENV{'GATEWAY_INTERFACE'}<br>\n";

1;