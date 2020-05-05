# Regex-Party
Regex practice

## Notes

#### Match Anything but New Line
The dot `.` matches anything (except for a newline).
Note: If you want to match `.` in the test string, 
you need to escape the dot by using a slash `\..`

#### Match Digits & Non-Digit Characters
* The expression `\\d` matches any digit `0-9`
* The expression `\\D` matches any character that is not a digit

#### Matching Whitespace & Non-Whitespace Character
* `\\s` matches any whitespace
* `\\S` matches any non-white space character
* `\\t` matches any tab
* `\\T` matches any character that isn't a tab
* `\\n` matches line separator
* `\\N` matches one character that isn't a line break
* `r` matches line separator
* `R` matches one line break


#### Matching Word & Non-Word Character
* The expression `\\w` will match any word character
* Word characters include alphanumeric characters `a-z, A-Z, 0-9, (_)`
* `\\W` matches any non-word character
* Non-word characters include characters other than alphanumeric characters


#### Matching Start & End
* The `^` symbol matches the position at the start of a string
* The `$` symbol matches the position at the end of the string

#### Quantifiers
* The `+` means one or more times
* The `*` means 0 or more times
* The `?` means once or none

#### Matching Specific Characters
* The `[ ]` matches only one out of the characters inside square brackets

#### Excluding Specific Characters
* `[^]` negated class matches any character that is not in square brackets

#### Matching Character Ranges
* `[a-z] [A-Z] [0-9]` indicates a range

#### Matching Repetitions
###### {x} repetitions
* The `{x}` will match the pattern exactly x repetitions
* `w{3}` will match character w exactly 3 times
* `[xyz]{3}` will match a string of length 5 with characters x,y, or z
* `\\d{4}` will match any digit exactly 4 times

###### {x,y} repetitions
* `{x,y}` will match between x and y (both inclusive)
* `w{3,5}` will match w 3,4, or 5 times
* `[xyz]{5,]` will match character x,y, or z 5 or more times
* `\\d{1,4}` will match any digit 1,2,3, or 4 times

###### 0 or more occurrences
* `*` matches zero or more repetitions
* `w*` will match w 0 or more times
* `[xyz]*` wil match x,y, or z 0 or more times
* `\\d*` will match any digit 0 or more times

###### 1 or more occurrences
* `+` matches one or more repetitions of character, class, or group

#### Match ending items
* `$` matches an occurrence of that character at end of line

#### Matching Word Boundaries
* `\\b` assert position at a word boundary
* Do not need to use `^` or `$` in word boundaries
* Three different positions qualify for word boundaries:
    * Before 1st character in a string, if 1st character is word char
    * Before 2 characters in a string, where one is a word character and the other is not a word character
    * After the last character in the string, if the last character is a word character

####  Capturing & Non-Capturing Groups
* Parenthesis `( )` around a regular expression can group that part of regex together.
    * This allows us to apply different quantifiers to that group.
    * These parenthesis also create a numbered capturing.
    * It stores the part of string matched by the part of regex inside parentheses.
    * These numbered capturing can be used for back references. 
* `(?:)`  can be used to create a non-capturing group. Useful if we do not need the group to capture its match.

    
#### Alternative Matching
* Alternations, denoted by the | character, match a single item out of several possible items separated by the vertical bar. 
* When used inside a character class, it will match characters; when used inside a group,<br /> it will match entire expressions (i.e., everything to the left or everything to the right of the vertical bar).
* We must use parentheses to limit the use of alternations.
##### Examples
* `(Bob|Kevin|Stuart)` will match either Bob or Kevin or Stuart
* `([a-f]|[A-F])` will match any of the following characters: a, b, c, d, e, f, A, B, C, D, E, or F.

#### Matching Same Text Again & Again
* Tool (\\1 references first capturing group) matches same text as previously matches by capturing group
* `(\\d)\\1` can match 00,11,22,333,44,55,66,77,88,99

#### Back References to Failed Groups
Backreference to a capturing group that match nothing is different  <br />
from back reference to a capturing group that did not participate in the match at all
* `(b?)o\\1` 
    * where `b?` is optional and matches nothing
    * `(b?)` is successfully matched and capture nothing
    * o is matched with o and \\1 
* `(b)?o\\1`
    * Here `(b)` fails to match at all. Since whole group is optional it does proceed to match o
    * Enginer now arrives `\\1` which references a group that did not participate in match attempt at all
    * Thus backreference fails to match
    
#### Forward References
Forward references creates a back reference to a regex that will appear later
<br />Forward references are only useful if they're inside a repeated group
* `(\\2amigo|(go!))+` will match `go!go!amigo`

#### Positive Lookahead
`regex_1(?=regex_2)` <br />
The positive lookahead `(?=)` asserts regex_1 to be immediately followed by regex_2.<br /> 
The lookahead is excluded from the match. It does not return matches of regex_2.<br />  
The lookahead only asserts whether a match is possible or not.

#### Negative Lookahead
`regex_1(?!regex_2)`
The negative lookahead `(?!)` asserts regex_1 not to be immediately followed by regex_2.
<br />Lookahead is excluded from match(do not consume matches of regex_2)
<br />but only assert whether a match is possible or not.
 
#### Positive Lookbehind
`(?<=regex_2)regex_1`
The positive lookbehind `(?<=)` asserts regex_1 to be immediately<br />
preceded by regex_2. Lookbehind is excluded from the match<br /> 
(do not consume matches of regex_2)<br />
but only assert whether a match is possible or not.
