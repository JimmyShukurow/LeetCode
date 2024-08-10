package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class LeetCode6 {
    public String convert(String s, int numRows) {
        if (s.length() < numRows || s.length() <=2 || numRows ==1) return s;
        int columns = 0;
        boolean colOrDiagonal = true;
        columns = getColumns(s, numRows, columns);
        Character[][] zigzag = new Character[numRows][columns];
        for (Character[] characters : zigzag) {
            Arrays.fill(characters, '0');
        }
        convertToMatrix(s, numRows, zigzag, colOrDiagonal);
//        displayMatrix(zigzag);
        return getResult(zigzag);
    }

    private static String getResult(Character[][] zigzag) {
        AtomicReference<String> result = new AtomicReference<>("");

        for (Character[] characters : zigzag) {
            Arrays.stream(characters).forEach(el -> {
                if (el != '0') {
                    result.updateAndGet(v -> v + el);
                }

            });
        }
//        System.out.println(result.get());
        return result.get();
    }

    private static void convertToMatrix(String s, int numRows, Character[][] zigzag, boolean colOrDiagonal) {
        int length = 0, i = 0, j = 0;
        while (length < s.length()) {
            zigzag[i][j] = s.charAt(length);

            if (colOrDiagonal) {
                i++;
            } else {
                i--;
                j++;
            }
            if (i == numRows - 1) colOrDiagonal = false;
            if (i == 0) colOrDiagonal = true;
            length++;
        }
    }

    private static int getColumns(String s, int numRows, int columns) {
        boolean colOrDiagonal = true;
        int stringLength = s.length();
        if (stringLength == numRows) return 1;
        while (stringLength >= 0) {
            if (colOrDiagonal) {
                columns++;
                stringLength -= numRows;
                colOrDiagonal = false;
            } else {
                columns += numRows - 2;
                stringLength -= (numRows - 2);
                colOrDiagonal = true;
            }
        }
        return columns;
    }
//
//    public void displayMatrix(Character[][] given) {
//        for (Character[] strings : given) {
//            System.out.println(Arrays.toString(strings));
//        }
//    }
}
