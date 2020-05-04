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
}
