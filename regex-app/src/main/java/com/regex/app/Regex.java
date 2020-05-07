package com.regex.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    // Match only and exactly strings of form: abc.def.ghi.jkx,
    // where each variable a,b,c,d,e,f,g,h,i,j,k,x can be any single character except the newline.
    public boolean matchAnyButNewLine(String input){
        return input.matches("insert pattern here");
    }

    // Match the pattern xxXxxXxxxx
    // Here x denotes a digit character, and X denotes a non-digit character.
    public boolean matchDigitsAndNonDigits(String input){
        return input.matches("insert pattern here");
    }

    // Match the pattern XXxXXxXX
    // Here, x denotes whitespace characters, and X denotes non-white space characters.
    public boolean whiteSpace(String input){
        return input.matches("insert pattern here");
    }

    // Match the pattern xxxXxxxxxxxxxxXxxx.
    // x denotes any word character and X denotes any non-word character
    public boolean matchingWord(String input){
        return input.matches("insert pattern here");
    }

    // Match the pattern Xxxxx.
    // X denotes a digit & x denotes word character.
    // String must start with a digit X and end with a .
    // String should be only 6 characters long.
    public boolean startAndEnd(String input){
        return input.matches("insert pattern here");
    }

    // Match the pattern with following criteria.
    // Must be length of 6.
    // First character is 1,2,3. Second character 1,2,0.
    // Third character is x,s,0. Fourth character is 3,0,A or a
    // Fifth character x,s,u. Sixth character . or ,
    public boolean matchSpecificCharacters(String input){
        return input.matches("insert pattern here");
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
        return input.matches("insert pattern here");
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
        return input.matches("insert pattern here");
    }

    // Pattern must have length of 10.
    // First 6 characters should consist of letters (case insensitive)
    // Or Even digits (Zero counts as even in this case)
    // Last 4 characters can be either odd digits (1 counts) or whitespace characters
    public boolean repetitions(String input){
        return input.matches("insert pattern here");
    }

    // Pattern should begin with 1 or 2 digits
    // After that should have 3 or more letters (case insensitive)
    // Should end with 0-3 . (periods)
    public boolean rangeRepetitions(String input){
        return input.matches("insert pattern here");
    }

    // Pattern should begin with 2 or more digits
    // After that string should have 0 or more lowercase letters
    // Should end with 0 or more uppercase letters
    public boolean zeroOrMore(String input){
        return input.matches("insert pattern here");
    }

    // Pattern should begin with 1 or more digits
    // After that should have 1 or more uppercase letters
    // Should end with one or more lowercase letters
    public boolean oneOrMore(String input){
        return input.matches("insert pattern here");
    }

    // String should only contain upper and lowercase letters
    // String should end in s
    public boolean endsWith(String input){
        return input.matches("insert pattern here");
    }

    // String should match word starting with vowel(case insensitive)
    // Can be any length. Word should consist of only letters (case insensitive)
    // Should start and end with word boundary
    public boolean wordBoundary(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        return m.find();
    }

    // Match for 3 consecutive repetitions of ok (okokok)
    public boolean capturingGroup(String pattern){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(pattern);
        return m.find();
    }

    // Match s must start with Mr. Mrs. Ms. Dr. or Er.
    // Rest of string must contain only one or more alphabetic letters (upper and lowercase)
    public boolean alternativeMatching(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        return m.find();
    }

    // String must be length of 20
    // 1st character must be lowercase letter. 2nd character must be word character
    // 3rd character is whitespace character. 4th character is non-word character
    // 5th character is digit. 6th character is non-digit
    // 7th character uppercase letter. 8th is letter(case-insensitive)
    // 9th character is vowel. 10th character is non-whitespace character
    // 11th should match 1st. 12th should match 2nd
    // 13th should match 3rd. 14th 4th...you get the point
    public boolean matchSameText(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        return m.find();
    }

    // String consists of 8 digits
    // Must have "-" separator such that string is divided in 4 parts
    // Each part having exactly two digits 12-34-56-78
    public boolean backReferences(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        return m.find();
    }

    // String that consists of tic or tac
    // tic should not be immediate neighbor of itself
    // tic must occur only when tac has appeared at least twice before
    public boolean forwardReference(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        return m.find();
    }

    // Return number of occurrences of o followed immediately by oo
    public int positiveLookAhead(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        int counter = 0;
        while(m.find()){
            counter++;
        }
        return counter;
    }

    // Match all characters which are not immediately followed by that same character
    // Example: If string gooooo. The first g is not followed by a g
    // and last o is not followed by o
    public int negativeLookAhead(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        int counter = 0;
        while(m.find()){
            counter++;
        }
        return counter;
    }

    // Write a regex which can match all the
    // occurrences of digit which are immediately
    // preceded by odd digit.
    public int positiveLookBehind(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        int counter = 0;
        while(m.find()){
            counter++;
        }
        return counter;
    }

    // Write a regex which can match all the occurrences of characters
    // which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U)
    public int negativeLookBehind(String input){
        Pattern p = Pattern.compile("insert pattern here");
        Matcher m = p.matcher(input);
        int counter = 0;
        while(m.find()){
            counter++;
        }
        return counter;
    }
}
