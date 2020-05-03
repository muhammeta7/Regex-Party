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
}
