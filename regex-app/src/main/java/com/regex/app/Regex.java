package com.regex.app;

public class Regex {

    // Match only and exactly strings of form: abc.def.ghi.jkx,
    // where each variable a,b,c,d,e,f,g,h,i,j,k,x can be any single character except the newline.
    public boolean matchAnyButNewLine(String input){
        return true;
    }

    // Match the pattern xxXxxXxxxx
    // Here x denotes a digit character, and X denotes a non-digit character.
    public boolean matchDigitsAndNonDigits(String input){
        return true;
    }

    // Match the pattern XXxXXxXX
    // Here, x denotes whitespace characters, and X denotes non-white space characters.
    public boolean whiteSpace(String input){
        return true;
    }

    // Match the pattern xxxXxxxxxxxxxxXxxx.
    // x denotes any word character and X denotes any non-word character
    public boolean matchingWord(String input){
        return true;
    }

    // Match the pattern Xxxxx.
    // X denotes a digit & x denotes word character.
    // String must start with a digit X and end with a .
    // String should be only 6 characters long.
    public boolean startAndEnd(String input){
        return true;
    }

    // Match the pattern with following criteria.
    // Must be length of 6.
    // First character is 1,2,3. Second character 1,2,0.
    // Third character is x,s,0. Fourth character is 3,0,A or a
    // Fifth character x,s,u. Sixth character . or ,
    public boolean matchSpecificCharacters(String input){
        return true;
    }

    // Match pattern with following criteria.
    // Must be length of 6.
    // First character shouldn't be digit 0-9
    // Second character can not be a lowercase vowel
    // Third character should not be b,c,D,F
    // Fourth character should not be white space
    // Fifth character should not be A,E,I,O,U
    // Sixth character should not be a . or a ,
    public boolean excludeSpecificCharacters(String input){
        return true;
    }

    // Match pattern with following criteria.
    // Length of string must be at least 5 or more
    // First character must be lowercase
    // Second character must be positive digit
    // Zero is not considered positive or negative
    // Third character must not be lowercase
    // Fourth character not be uppercase
    // Fifth character must be uppercase English character
    public boolean ranges(String input){
        return true;
    }

    // Pattern must have length of 10.
    // First 6 characters should consist of letters (case insensitive)
    // Or Even digits (Zero counts as even in this case)
    // Last 4 characters can be either odd digits (1 counts) or whitespace characters
    public boolean repetitions(String input){
        return true;
    }

    // Pattern should begin with 1 or 2 digits
    // After that should have 3 or more letters (case insensitive)
    // Should end with 0-3 . (periods)
    public boolean rangeRepetitions(String input){
        return true;
    }

    // Pattern should begin with 2 or more digits
    // After that sting should have 0 or more lowercase letters
    // Should end with 0 or more uppercase letters
    public boolean zeroOrMore(String input){
        return true;
    }

    // Pattern should begin with 1 or more digits
    // After that should have 1 or more uppercase letters
    // Should end with one or more lowercase letters
    public boolean oneOrMore(String input){
        return true;
    }

    // String should only contain upper and lowercase letters
    // String should end in s
    public boolean endsWith(String input){
        return true;
    }

}
