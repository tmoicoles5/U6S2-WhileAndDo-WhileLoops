package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex01.DoWhileLoop1;
import partB.ex01.DoWhileLoop2;

public class DoWhileLoop2Test {
    @Test
    public void doWhileTest01(){
        String expected = "1 3 5 7 9 11 13 15 17 19";
        String actual = DoWhileLoop2.doWhileLoopTwo();
        Assertions.assertEquals(expected, actual);
    }
}
