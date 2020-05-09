package com.regex.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MediumRegex {

    // Get the links and Text inside link tags
    // <a href="http://www.hackerrank.com"><h1><b>HackerRank</b></h1></a>
    // Format should return http://www.hackerrank.com, HackerRank
    public String detectLinksAndText(String input){
        String regex = "<a href=\"([^\"]+)\"(?:[^>]*)?>(?:<[^>]+>)*([^<]*)(?:</[^>]+>)*</a>";
        Pattern p = Pattern.compile(regex);
        String result = "";
        Matcher m = p.matcher(input);

        while(m.find()){
            String url = m.group(1);
            String text = m.group(2);
            result += url + "," + text;
        }

        return result;
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
        Pattern p = Pattern.compile("(?<=\\w)" + subWord + "(?=\\w)");
        Matcher m = p.matcher(sentence);
        int counter = 0;
        while(m.find()){
            counter++;
        }
        return counter;
    }
}
