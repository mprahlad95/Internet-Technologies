#!C:\Perl\bin\perl.exe
use CGI qw(:standard);
print "Content-type:text/html\r\n\r\n";
print '<html>';
print '<body>';
$name=param("username");
print "welcome $name";
@greetings=("good morning","good afternoon","hello","good bye");
my $x = int(rand(4));
print "\n";
print "$greetings[$x]";

print '</body>';
print '</html>';