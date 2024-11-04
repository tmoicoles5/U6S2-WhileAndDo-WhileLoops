package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 14
    @Test
    public void checkPosOrNegTest01(){

        // Given
        int a = 1;
        int b = -1;
        Boolean neg = false;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.checkPosOrNeg(a, b, neg);
    }

    @Test
    public void checkPosOrNegTest02(){

        // Given
        int a = -1;
        int b = 1;
        Boolean neg = false;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.checkPosOrNeg(a, b, neg);
    }

    @Test
    public void checkPosOrNegTest03(){

        // Given
        int a = -4;
        int b = -5;
        Boolean neg = true;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.checkPosOrNeg(a, b, neg);
    }


    // Problem 15
    @Test
    public void exchangeTest01() {

        // Given
        String str = "code";

        // When
        String expected = "eodc";
        String actual = AlgoChallenge.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exchangeTest02() {

        // Given
        String str = "a";

        // When
        String expected = "a";
        String actual = AlgoChallenge.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exchangeTest03() {

        // Given
        String str = "ab";

        // When
        String expected = "ba";
        String actual = AlgoChallenge.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
