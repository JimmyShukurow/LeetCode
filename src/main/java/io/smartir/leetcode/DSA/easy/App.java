package io.smartir.leetcode.DSA.easy;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public interface App {
    ConcurrentHashMap<String, Long> list = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
//
//        var script = """
//                #!/bin/sh
//                echo 'jimmy salam'
//                """;
//        var path = Files.writeString(Path.of("hello.sh"), script);
//        Files.setPosixFilePermissions(path, Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_EXECUTE));

        IntStream.range(1, 11)
                .mapToObj(i -> CompletableFuture.runAsync(() -> System.out.println(i)))
                .forEach(CompletableFuture::join);
        Stack<Character> paras = new Stack<>();
        paras.push('}');
        System.out.println(paras);

        Map<String, String> test = new HashMap<>();
        test.put("1", "test");
        test.put("2", "jimi");
        test.put("3", "keloglan");
        test.put("4", "shukurov");
        System.out.println(test);
        if (test.get("1").equals("testw")) test.remove("1");
        for (Map.Entry<String, String> entry : test.entrySet()) {
            entry.getValue();
        }
        System.out.println(test);
        Stack<Integer> jimi = new Stack<>();

        System.out.println("max is=>"+Math.max(2,2));
    }
}
