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

    }
}
