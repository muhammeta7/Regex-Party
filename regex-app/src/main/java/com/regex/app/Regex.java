package com.regex.app;

public class Regex {

    // You have a test string. Your task is to write a regular expression
    // that matches only and exactly strings of form: abc.def.ghi.jkx,
    // where each variable a,b,c,d,e,f,g,h,i,j,k,x can be any single character except the newline.
    public boolean matchAnyButNewLine(String input){
        return true;
    }

    // You have a test string. Your task is to match the pattern xxXxxXxxxx
    // Here x denotes a digit character, and X denotes a non-digit character.
    public boolean matchDigitsAndNonDigits(String input){
        return true;
    }

    // You have a test string. Your task is to match the pattern XXxXXxXX
    // Here, x denotes whitespace characters, and X denotes non-white space characters.
    public boolean whiteSpace(String input){
        return true;
    }

    // You have a test string. Match the pattern.
    // xxxXxxxxxxxxxxXxxx
    // x denotes any word character and X denotes any non-word character
    public boolean matchingWord(String input){
        return true;
    }

}
