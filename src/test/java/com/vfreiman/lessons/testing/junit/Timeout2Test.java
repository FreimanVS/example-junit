package com.vfreiman.lessons.testing.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class Timeout2Test {
    @Rule
    public Timeout timeout = new Timeout(5, TimeUnit.SECONDS); //timeout for all tests

    @Test
    public void test1() throws Exception {

    }

    @Test
    public void test2() throws Exception {
        while(true);
    }
}
