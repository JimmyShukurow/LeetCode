package io.smartir;

import java.time.Clock;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var clock = Clock.systemUTC();
        Instant instant = clock.instant();
        System.out.println(instant);
        long millis = clock.millis();
        System.out.println(millis);
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        return climbStairs(n-2) +climbStairs(n-1);
    }

}