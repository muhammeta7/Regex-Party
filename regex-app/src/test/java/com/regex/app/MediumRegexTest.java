package com.regex.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MediumRegexTest {
    private MediumRegex mediumRegex;

    @Before
    public void setup(){
        this.mediumRegex = new MediumRegex();
    }

    @Test
    public void detectLinksAndTextTest(){
        String input = "<a href=\"http://www.hackerrank.com\"><h1><b>HackerRank</b></h1></a>";
        String expected = "http://www.hackerrank.com,HackerRank";
        String actual = mediumRegex.detectLinksAndText(input);
        assertEquals(expected, actual);

        String input1 = "<li id=\"n-sitesupport\"><a href=\"donate.wikimedia.org/wiki/Special:FundraiserRedirector\">Donate to Wikipedia</a></li>";
        String expected1 = "donate.wikimedia.org/wiki/Special:FundraiserRedirector,Donate to Wikipedia";
        String actual1 = mediumRegex.detectLinksAndText(input1);
        assertEquals(expected1, actual1);
    }
}
