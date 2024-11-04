package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.SquareRootWhile;

public class SquareRootWhileTest {
    @Test
    public void countUpLoopTest01(){
        String expected = "The square root of 11 is 3.166";
        String actual = SquareRootWhile.squareRoot();
        Assertions.assertEquals(expected, actual);
    }

}
