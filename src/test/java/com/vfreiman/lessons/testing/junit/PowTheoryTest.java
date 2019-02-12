package com.vfreiman.lessons.testing.junit;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import static org.junit.Assume.assumeTrue;

/** at least one is true */
@RunWith(Theories.class)
public class PowTheoryTest {
    @DataPoint public static int A = 4;
    @DataPoint public static double B = 5.0d;
    @DataPoint public static int C = 7;

    @Theory
    public void isEven(int exponent) {
        System.out.println(exponent);
        assumeTrue(exponent%2 == 0);
    }
}