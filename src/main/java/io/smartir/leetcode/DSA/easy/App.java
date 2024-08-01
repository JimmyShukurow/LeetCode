package io.smartir.leetcode.DSA.easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

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
        Integer[] jimi = new Integer[5];
        System.out.println(Arrays.toString(jimi));
    }

}
