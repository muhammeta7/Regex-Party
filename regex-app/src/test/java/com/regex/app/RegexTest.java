package com.regex.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegexTest {
    Regex regex;
    @Before
    public void setup(){
         regex = new Regex();
    }

    @Test
    public void matchAnyButNewLineTest(){
        String input1 = "123.456.abc.def";
        String input2 = "abc.def.ghi.jkx";
        String input3 = "abchsjdldjt.sjsksl.dssfg";
        String input4 = "///flgk{[]968";
        String input5 = "123456789.2.2.2";

        assertTrue(regex.matchAnyButNewLine(input1));
        assertTrue(regex.matchAnyButNewLine(input2));
        assertFalse(regex.matchAnyButNewLine(input3));
        assertFalse(regex.matchAnyButNewLine(input4));
        assertFalse(regex.matchAnyButNewLine(input5));
    }

    @Test
    public void matchDigitsAndNonDigitTest(){
        String input1 = "06-11-2012";
        String input2 = "01-25-1990";
        String input3 = "03-11-2012";
        String input4 = "MM-DD-YYYY";
        String input5 = "This is not gonna work";
        String input6 = "10a10.2015452254";
        String input7 = "11..11.2015";

        assertTrue(regex.matchAnyButNewLine(input1));
        assertTrue(regex.matchAnyButNewLine(input2));
        assertTrue(regex.matchAnyButNewLine(input3));
        assertFalse(regex.matchAnyButNewLine(input4));
        assertFalse(regex.matchAnyButNewLine(input5));
        assertTrue(regex.matchDigitsAndNonDigits(input6));
    }

    @Test
    public void whiteSpaceTest(){
        String input1 = "12 11 15";
        String input2 = "Ey Yo Man";
        String input3 = "123 123 123";
        String input4 = "hey dude no";

        assertTrue(regex.whiteSpace(input1));
        assertTrue(regex.whiteSpace(input2));
        assertFalse(regex.whiteSpace(input3));
        assertFalse(regex.whiteSpace(input4));
    }

    @Test
    public void matchingWordTest(){
        String input1 = "www.hackerrank.com";
        String input2 = "www.plainpizza.com";
        String input3 = "www.sharktanks.com";
        String input4 = "ay.gopro.thing";
        String input5 = "12.12345.5678";

        assertTrue(regex.matchingWord(input1));
        assertTrue(regex.matchingWord(input2));
        assertTrue(regex.matchingWord(input3));
        assertFalse(regex.matchingWord(input4));
        assertFalse(regex.matchingWord(input5));
    }

    @Test
    public void startAndEndTest(){
        String input1 = "1some.";
        String input2 = "0qwer.";
        String input3 = "a4758?";
        String input4 = "abcdef";

        String[] strings = {input1, input2, input3, input4};
        int expected = 6;
        for(String s: strings){
            assertEquals(expected, s.length());
        }

        assertTrue(regex.startAndEnd(input1));
        assertTrue(regex.startAndEnd(input2));
        assertFalse(regex.startAndEnd(input3));
        assertFalse(regex.startAndEnd(input4));
    }

    @Test
    public void matchSpecificCharactersTest(){
        String input1 = "1203x.";
        String input2 = "20x3s,";
        String input3 = "11xAu.";
        String input4 = "abcdefg";
        String input5 = "AB356.";

        String[] strings = {input1, input2, input3, input4, input5};
        int expected = 6;
        for(String s: strings){
            assertEquals(expected, s.length());
        }

        assertTrue(regex.matchSpecificCharacters(input1));
        assertTrue(regex.matchSpecificCharacters(input2));
        assertTrue(regex.matchSpecificCharacters(input3));
        assertFalse(regex.matchSpecificCharacters(input4));
        assertFalse(regex.matchSpecificCharacters(input5));
    }

    @Test
    public void excludeSpecificCharactersTest(){
        String input1 = "think?";
        String input2 = "stink!";
        String input3 = "0ab A.";
        String input4 = "2eD I,";

        String[] strings = {input1, input2, input3, input4};
        int expected = 6;
        for(String s: strings){
            assertEquals(expected, s.length());
        }

        assertTrue(regex.excludeSpecificCharacters(input1));
        assertTrue(regex.excludeSpecificCharacters(input2));
        assertFalse(regex.excludeSpecificCharacters(input3));
        assertFalse(regex.excludeSpecificCharacters(input4));
    }

    @Test
    public void rangesTest(){
        String input1 = "h4CkR";
        String input2 = "a3AbC";
        String input3 ="t7QdTabc";
        String input4 = "abcdef";
        String input5 = "1h4kk529";

        assertTrue(regex.ranges(input1));
        assertTrue(regex.ranges(input2));
        assertFalse(regex.ranges(input3));
        assertFalse(regex.ranges(input4));
        assertFalse(regex.ranges(input5));
    }

    @Test
    public void repetitionsTest(){
        String input1 = "aA24Bz1 3 ";
        String input2 = "2Bzxy67 59";
        String input3 = "3b hsQ8462";
        String input4 = "ABC793    ";

        assertTrue(regex.repetitions(input1));
        assertTrue(regex.repetitions(input2));
        assertFalse(regex.repetitions(input3));
        assertFalse(regex.repetitions(input4));
    }

    @Test
    public void rangeRepetitionsTest(){
        String input1 = "22aBc.";
        String input2 = "12abCDeFGhij...";
        String input3 = "3threeormorealphabets8";
        String input4 = "43hahahhahaha...........";

        assertTrue(regex.rangeRepetitions(input1));
        assertTrue(regex.rangeRepetitions(input2));
        assertFalse(regex.rangeRepetitions(input3));
        assertFalse(regex.rangeRepetitions(input4));
    }

    @Test
    public void zeroOrMoreTest(){
        String input1 = "27";
        String input2 = "12345a";
        String input3 = "12A";
        String input4 = "1absA";
        String input5 = "23Aa";

        assertTrue(regex.zeroOrMore(input1));
        assertTrue(regex.zeroOrMore(input2));
        assertTrue(regex.zeroOrMore(input3));
        assertFalse(regex.zeroOrMore(input4));
        assertFalse(regex.zeroOrMore(input5));
    }

    @Test
    public void oneOrMoreTest(){
        String input1 = "1234ABCSabc";
        String input2 = "1Qa";
        String input3 ="23Qaaa";
        String input4 = "abcdef";
        String input5 = "1h4kk529";

        assertTrue(regex.oneOrMore(input1));
        assertTrue(regex.oneOrMore(input2));
        assertTrue(regex.oneOrMore(input3));
        assertFalse(regex.oneOrMore(input4));
        assertFalse(regex.oneOrMore(input5));
    }

    @Test
    public void endsWithTest(){
        String input1 = "Kites";
        String input2 = "zipCoDERs";
        String input3 = "234556s";
        String input4 = "abcDEFghz";

        assertTrue(regex.endsWith(input1));
        assertTrue(regex.endsWith(input2));
        assertFalse(regex.endsWith(input3));
        assertFalse(regex.endsWith(input4));
    }
}
