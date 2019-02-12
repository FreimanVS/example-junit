package com.vfreiman.lessons.testing.junit;

public class Greeter {

    public Greeter() {}

    public final String greet(final String name) {
        if (name == null) {
            return "Hello, Anonymous!";
        }
        return "Hello, " + name + "!";
    }
}