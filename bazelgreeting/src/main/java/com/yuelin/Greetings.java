package com.yuelin;

import java.util.ArrayList;
import java.util.Arrays;

public class Greetings {

    public String greet(String name) {

        // String[] args = new String[1];
        // System.err.print(String.format("Hello: %s\n", Arrays.toString(args)));
        return "Hello ".concat(name);
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
