package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex02.SumOfNums;
import partB.ex01.DoWhileLoop1;

public class DoWhileLoop1Test {
    @Test
    public void doWhileTest01(){
        String expected = "43\n" +
                "55\n" +
                "68\n" +
                "91\n" +
                "105";
        String actual = DoWhileLoop1.doWhileLoopOne();
        Assertions.assertEquals(expected, actual);
    }
}
