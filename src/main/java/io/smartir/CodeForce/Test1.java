package io.smartir.CodeForce;


import java.util.*;
import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int a = Integer.parseInt(firstLine[1]);

            String[] marbles = br.readLine().split(" ");
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = Integer.parseInt(marbles[i]);
            }

            // Count marbles less than a and greater than a
            int countLess = 0;
            int countGreater = 0;

            for (int i = 0; i < n; i++) {
                if (v[i] < a) {
                    countLess++;
                } else if (v[i] > a) {
                    countGreater++;
                }
            }

            // Bob should choose b based on which side has more marbles
            int b;
            if (countLess > countGreater) {
                // Choose b > a to win marbles with v < a
                b = a + 1;
            } else if (countGreater > countLess) {
                // Choose b < a to win marbles with v > a
                b = a - 1;
            } else {
                // Equal count or all marbles equal to a, doesn't matter
                // Choose any valid b, let's say a + 1
                b = a + 1;
            }

            pw.println(b);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}