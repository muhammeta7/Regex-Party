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
`\\s` matches any whitespace &  non-whitespace character.
`\\S` matches any non-white space character.
`\\t` matches any tab.
`\\T` matches any character that isn't a tab.
`\\n` matches line separator.
`\\N` matches one character that isn't a line break.
`r` matches line separator.
`R` matches one line break.


#### Matching Word & Non-Word Character
The expression `\\w` will match any word character.
Word characters include alphanumeric characters `a-z, A-Z, 0-9, (_)`.
`\\W` matches any non-word character.
Non-word characters include characters other than alphanumeric characters.


#### Matching Start & End
The `^` symbol matches the position at the start of a string.
The `$` symbol matches the position at the end of the string.

#### Quantifiers
The `{3}` quantifier means exactly 3 times.
The `{3,}` quantifier means 3 or more times.
The `{2,4}` quantifier means 2 to 4 times.
The `+` means one or more times.
The `*` means 0 or more times.
The `?` means once or none.

#### Matching Specific Characters
The `[ ]` matches only one out of the characters inside square brackets.

#### Excluding Specific Characters
`[^]` negated class matches any character that is not in square brackets.

#### Matching Character Ranges
`[a-z] [A-Z] [0-9]` indicates a range

#### Matching repetitions
`+` matches one or more repetitions of character, class, or group
