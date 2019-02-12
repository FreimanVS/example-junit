package com.vfreiman.lessons.testing.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SomeTest {

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {2, 2}
        });
    }

    private int a;
    private int b;

    public SomeTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Test
    public void test() {
        assertEquals(a, b);
    }
}


