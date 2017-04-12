import re
s=raw_input("Enter the regular expression ")
newline= re.sub("<\/?\[[0-9]+>", "", s)
print newline
