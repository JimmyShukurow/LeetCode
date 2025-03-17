package io.smartir.leetcode.DSA.medium;

import java.util.*;

public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int counter = 0;
        if (digits.isEmpty()) return result;
        Map<Integer, String> buttons = Map.of(
                2, "abc",
                3, "def",
                4, "ghi",
                5, "jkl",
                6, "mno",
                7, "pqrs",
                8, "tuv",
                9, "wxyz"
        );
        int currDigit = Integer.parseInt(digits.substring(counter, counter+1));
        String currDigitLetters = buttons.get(currDigit);
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < currDigitLetters.length(); i++) {
            queue.offer(currDigitLetters.substring(i, i + 1));
        }
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (curr.length() > counter + 1) {
                counter++;
            }
            if (curr.length() == digits.length()) {
                result.add(curr);
                continue;
            }
            if (curr.length() == counter+1) {
                int tempCounter = counter + 1;
                currDigit = Integer.parseInt(digits.substring(tempCounter, tempCounter+1));
                currDigitLetters = buttons.get(currDigit);
                for (int i = 0; i < currDigitLetters.length(); i++) {
                    queue.offer(curr + currDigitLetters.charAt(i));
                }
            }

        }
        return result;
    }

    class SolutionFromInternet {
        //Not mine solution, but better than mine
        private List<String> combinations = new ArrayList<>();
        private Map<Character, String> letters = Map.of(
                '2',
                "abc",
                '3',
                "def",
                '4',
                "ghi",
                '5',
                "jkl",
                '6',
                "mno",
                '7',
                "pqrs",
                '8',
                "tuv",
                '9',
                "wxyz"
        );
        private String phoneDigits;

        public List<String> letterCombinations(String digits) {
            // If the input is empty, immediately return an empty answer array
            if (digits.length() == 0) {
                return combinations;
            }

            // Initiate backtracking with an empty path and starting index of 0
            phoneDigits = digits;
            backtrack(0, new StringBuilder());
            return combinations;
        }

        private void backtrack(int index, StringBuilder path) {
            // If the path is the same length as digits, we have a complete combination
            if (path.length() == phoneDigits.length()) {
                combinations.add(path.toString());
                return; // Backtrack
            }

            // Get the letters that the current digit maps to, and loop through them
            String possibleLetters = letters.get(phoneDigits.charAt(index));
            for (char letter : possibleLetters.toCharArray()) {
                // Add the letter to our current path
                path.append(letter);
                // Move on to the next digit
                backtrack(index + 1, path);
                // Backtrack by removing the letter before moving onto the next
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

}
