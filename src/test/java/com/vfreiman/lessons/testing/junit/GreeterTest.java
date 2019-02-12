package com.vfreiman.lessons.testing.junit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GreeterTest {

    private Greeter greeter;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BEFORE ALL TESTS");
    }

    @Before
    public void before() {
        System.out.println("Before each test");
        greeter = new Greeter();
    }

    @Test
    public void nameExists() {
        final String name = "John";
        String expected ="Hello, " + name + "!" ;
        String actual = greeter.greet("John");
        assertEquals(expected, actual);
    }

    @Test
    public void nameNotEixsts() {
        final String name= null;
        String expected = "Hello, Anonymous!";
        String actual = greeter.greet(name);
        assertEquals(expected, actual);
    }

    /** just examples of possible asserts */
    @Test
    public void otherTests() {
        assertTrue(true);
        assertFalse(false);
        assertNull(null);

        Object obj = new Object();
        assertSame(obj, obj);

        assertArrayEquals(new int[] {1, 2, 3}, new int[] {1, 2, 3});

        assertThat("abc", is("abc"));

        assertThat(new int[] { 1, 2, 3}, is(new int[] { 1, 2, 3}));
    }
    @Test(expected = NullPointerException.class)
    public void exception() {
        throw new NullPointerException();
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void exceptionWithRule() {
        exception.expect(NullPointerException.class);
        exception.expectMessage(containsString("test exception"));
        throw new NullPointerException("test exception");

    }

    @Ignore("ignored test")
    @Test
    public void ignore() {
        System.out.println("an inogred test");
    }

    @After
    public void after() {
        System.out.println("after each test");
        greeter = null;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AFTER ALL TESTS");
    }
}