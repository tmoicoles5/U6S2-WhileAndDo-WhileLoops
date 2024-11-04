package com.codedifferently.labs.partA.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.SquareRootWhile;
import partA.ex02.SumOfNums;

public class SumOfNumsTest {
    @Test
    public void sumOfNumsTest01(){
        String expected = "The square root of 11 is 3.166";
        String actual = SumOfNums.sum();
        Assertions.assertEquals(expected, actual);
    }
}
