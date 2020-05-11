package com.regex.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MediumRegex {
    // TODO Use Pattern and Matcher in these exercises to achieve desired result;

    // Get the links and Text inside link tags
    // <a href="http://www.hackerrank.com"><h1><b>HackerRank</b></h1></a>
    // Format should return http://www.hackerrank.com, HackerRank
    public String detectLinksAndText(String input){
        return input;
    }

    // Given a sentence return the count of the subWord
    // Only count the instances where "is" is not followed or preceded by non-word character
    // Example in sentence "existing pessimist optimist this is" and the subWord = "is"
    // subWord occurs in "existing" once
    // subWord occurs in "pessimist" once
    // subWord occurs in "optimist" once
    // subWord occurs in "this" but is followed by a space
    // subWord occurs at end of sentence but is preceded by space
    public int subWordCount(String sentence, String subWord){
        return 0;
    }

    // It must begin with either an underscore or a period
    // The first character must be immediately followed by one or more digits in the range 0-9
    // After some number of digits, there must be 0 or more English letters (uppercase and/or lowercase).
    // It may be terminated with an optional _
    // Note that if it's not terminated with an underscore,
    // then there should be no characters after the sequence of 0 or more English letters.
    public boolean alienUserName(String input){
        return input.matches("username here");
    }
}
