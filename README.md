# Regex-Party
Regex practice

## Notes

#### Match Anything but New Line
The dot (.) matches anything (except for a newline).
Note: If you want to match (.) in the test string, 
you need to escape the dot by using a slash \..

#### Match Digits & Non-Digit Characters
* The expression `\\d` matches any digit `0-9`.
* The expression `\\D` matches any character that is not a digit.

#### Matching Whitespace & Non-Whitespace Character
* `\\s` matches any whitespace.
* `\\S` matches any non-white space character.
* `\\t` matches any tab.
* `\\T` matches any character that isn't a tab.
* `\\n` matches line separator.
* `\\N` matches one character that isn't a line break.
* `r` matches line separator.
* `R` matches one line break.


#### Matching Word & Non-Word Character
* The expression `\\w` will match any word character.
* Word characters include alphanumeric characters `a-z, A-Z, 0-9, (_)`.
* `\\W` matches any non-word character.
* Non-word characters include characters other than alphanumeric characters.


#### Matching Start & End
* The `^` symbol matches the position at the start of a string.
* The `$` symbol matches the position at the end of the string.

#### Quantifiers
* The `+` means one or more times.
* The `*` means 0 or more times.
* The `?` means once or none.

#### Matching Specific Characters
* The `[ ]` matches only one out of the characters inside square brackets.

#### Excluding Specific Characters
* `[^]` negated class matches any character that is not in square brackets.

#### Matching Character Ranges
* `[a-z] [A-Z] [0-9]` indicates a range

#### Matching Repetitions
###### {x} repetitions
* The `{x}` will match the pattern exactly x repetitions.
* `w{3}` will match character w exactly 3 times.
* `[xyz]{3}` will match a string of length 5 with characters x,y, or z.
* `\\d{4}` will match any digit exactly 4 times.

###### {x,y} repetitions
* `{x,y}` will match between x and y (both inclusive).
* `w{3,5}` will match w 3,4, or 5 times.
* `[xyz]{5,]` will match character x,y, or z 5 or more times.
* `\\d{1,4}` will match any digit 1,2,3, or 4 times.

###### 0 or more occurrences
* `*` matches zero or more repetitions
* `w*` will match w 0 or more times
* `[xyz]*` wil match x,y, or z 0 or more times
* `\\d*` will match any digit 0 or more times

###### 1 or more occurrences
* `+` matches one or more repetitions of character, class, or group

#### Match ending items
* `$` matches an occurrence of that character at end of line.
