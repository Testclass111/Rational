package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class RationalTest
{
   
public class RationalTest
{ 
    @Test
    public void thirdplus()
    {
        Rational rational1 = new Rational(1, 3);
        Rational rational2 = new Rational(1, 3);
        Rational rational3 = new Rational(2, 3);
        assertEquals(rational3, rational1.add(rational2));
    }

    @Test
    public void halfminusthird()
    {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational answer = new Rational(1, 6);
        assertEquals(answer, rational1.subtract(rational2));
    }

    @Test
    public void twoThirdTimesOneHalf()
    {
        Rational rational1 = new Rational(2, 3);
        Rational rational2 = new Rational(1, 2);
        Rational rational3 = new Rational(1, 3);
        assertEquals(rational3, rational1.multiply(rational2));
    }

    @Test
    public void halfDividethird()
    {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational answer = new Rational(3, 2);
        assertEquals(answer, rational1.divide(rational2));
    }
}
