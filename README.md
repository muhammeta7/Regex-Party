# Regex-Party
Regex practice

## Notes

#### Match Anything but New Line
The dot (.) matches anything (except for a newline).
Note: If you want to match (.) in the test string, 
you need to escape the dot by using a slash \..

#### Match Digits & Non-Digit Characters
The expression `\\d` matches any digit `0-9`.
The expression `\\D` matches any character that is not a digit.

#### Matching Whitespace & Non-Whitespace Character
`\\s` matches any whitespace &  non-whitespace character
`\\S` matches any non-white space character

#### Matching Word & Non-Word Character
The expression `\\w` will match any word character.
Word characters include alphanumeric characters `a-z, A-Z, 0-9, (_)`.
`\\W` matches any non-word character.
Non-word characters include characters other than alphanumeric characters.


