package com.vfreiman.lessons.testing.junit;

import org.junit.Test;

public class TimeoutTest {

    @Test(timeout = 5000L)
    public void timeoutTest() {
        while (true);
    }
}
