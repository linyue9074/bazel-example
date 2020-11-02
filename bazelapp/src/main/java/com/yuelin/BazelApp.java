package com.yuelin;

import com.yuelin.Greetings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class BazelApp {

    public static void main(String ... args) {
        Greetings greetings = new Greetings();

        System.out.println(greetings.greet("Bazel"));

        System.out.println(StringUtils.lowerCase("Bazel"));

        System.err.print(String.format("Hello: %s\n", Arrays.toString(args)));

        // Set<Short> s = new HashSet<>();
        // for (short i = 0; i < 100; i++) {
        //     s.add(i);
        //     s.remove(i - 1);
        // }
        // System.out.println(s.size());
    }
}
