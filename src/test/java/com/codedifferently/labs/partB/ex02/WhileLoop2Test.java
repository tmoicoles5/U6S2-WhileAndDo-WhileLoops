package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex02.WhileLoop1;
import partB.ex02.WhileLoop2;

public class WhileLoop2Test {
    @Test
    public void whileLoopTest02(){
        String expected = "The Current Number is :0\n" +
                "The Current Number is :1\n" +
                "The Current Number is :2\n" +
                "The Current Number is :3\n" +
                "The Current Number is :4\n" +
                "The Current Number is :5\n" +
                "The Current Number is :6\n" +
                "The Current Number is :7\n" +
                "We are done";
        String actual = WhileLoop2.whileLoopTwo();
        Assertions.assertEquals(expected, actual);
    }
}
