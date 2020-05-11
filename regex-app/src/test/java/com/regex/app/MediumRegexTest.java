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

    @Test
    public void subWordCount(){
        assertEquals(mediumRegex.subWordCount("existing pessimist optimist this is", "is"), 3);
        assertEquals(mediumRegex.subWordCount("rational professionalism uncontroversial on conventional", "on"), 5);
        assertEquals(mediumRegex.subWordCount("don't tell me what is on", "on"), 0);
        assertEquals(mediumRegex.subWordCount("I wish for a fish in a dish. Hiss kiss disc diss.", "is"), 7);
    }

    @Test
    public void alienUserNameTest(){
        assertTrue(mediumRegex.alienUserName("_0898989811abced_"));
        assertTrue(mediumRegex.alienUserName(".551001777yBnuSHKYiHVZXRfmU_"));
        assertFalse(mediumRegex.alienUserName("_abce"));
        assertFalse(mediumRegex.alienUserName("_09090909abcD0"));
    }
}
