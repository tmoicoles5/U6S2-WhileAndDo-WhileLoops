package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex01.DoWhileLoop2;
import partB.ex02.WhileLoop1;

public class WhileLoop1Test {
    @Test
    public void whileLoopTest01(){
        String expected = "2 is even\n" +
                "4 is even\n" +
                "6 is even\n" +
                "8 is even\n" +
                "10 is even\n" +
                "...\n" +
                "...\n" +
                "...\n" +
                "992 is even\n" +
                "994 is even\n" +
                "996 is even\n" +
                "998 is even\n" +
                "1000 is even";



        String actual = WhileLoop1.whileLoopOne();
        Assertions.assertEquals(expected, actual);
    }
}
