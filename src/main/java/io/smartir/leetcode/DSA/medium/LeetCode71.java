package io.smartir.leetcode.DSA.medium;

import java.util.Stack;

public class LeetCode71 {
    public String simplifyPath(String path) {
        StringBuilder result = new StringBuilder("/");
        Stack<String> directories = new Stack<>();
        StringBuilder currentDirectory = new StringBuilder();

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/' ) {
                if (currentDirectory.isEmpty()) {
                    continue;
                }
                directories.push(currentDirectory.toString());
                currentDirectory = new StringBuilder();
            }
            if(path.charAt(i) != '/') currentDirectory.append(path.charAt(i));
            boolean checkNextOrLast = i == path.length() - 1 || path.charAt(i + 1) == '/';
            if (currentDirectory.toString().equals(("..")) && checkNextOrLast) {
                if (!directories.isEmpty()) {
                    directories.pop();
                }
                currentDirectory = new StringBuilder();
            } else if (currentDirectory.toString().equals((".")) && checkNextOrLast) {
                currentDirectory = new StringBuilder();
            }
        }
        if (!currentDirectory.toString().isEmpty()) {
            directories.push(currentDirectory.toString());
        }
        for (String directory : directories) {
            result.append(directory).append("/");
        }
        if (result.charAt(result.length() - 1) == '/' && result.length() > 1) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}
