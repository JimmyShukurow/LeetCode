package io.smartir.leetcode.DSA.medium;

import java.io.*;
import java.util.*;

public class YandexA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine().trim();
            int at = s.indexOf('@');
            String login = s.substring(0, at);
            String domain = s.substring(at + 1);

            int dash = login.indexOf('-');
            if (dash != -1) login = login.substring(0, dash);
            login = login.replace(".", "");

            domain = domain.substring(0, domain.lastIndexOf('.'));

            set.add(login + "@" + domain);
        }
        System.out.println(set.size());
    }

}

class YandexB {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String given = br.readLine().trim();
        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String target = br.readLine().trim();
            if (isSubs(given, target)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static boolean isSubs(String given, String target) {
        int p1 = 0, p2 = 0;
        while (p1 < given.length() && p2 < target.length()) {
            if (given.charAt(p1) == target.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p1++;

            }
            if (p2 == target.length()) {
                return true;
            }
        }
        return false;
    }
}

class YandexC {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int laughTime = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());
        String time = br.readLine().trim();
        String[] times = time.split(" ");

        int max = (n + 1) * laughTime;
        int last = Integer.parseInt(times[times.length - 1]);
        for (int i = times.length - 1; i >= 0; i--) {
            int curr = (last) + (i+1) * laughTime;
            max = Math.max(max, curr);
            if(i-1>=0) last = last + Integer.parseInt(times[i-1]);
        }
        System.out.println(max);
    }
}
class YandexD {
    static int[] p;
    static int find(int x) {
        while (p[x] != x) { p[x] = p[p[x]]; x = p[x]; }
        return x;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int n = (int) in.nval;
        long[] x1 = new long[n], x2 = new long[n], y1 = new long[n], y2 = new long[n];
        for (int i = 0; i < n; i++) {
            in.nextToken(); long x = (long) in.nval;
            in.nextToken(); long y = (long) in.nval;
            in.nextToken(); long r = (long) in.nval;
            x1[i] = x - r; x2[i] = x + r;
            y1[i] = y - r; y2[i] = y + r;
        }
        in.nextToken(); long xs = (long) in.nval;
        in.nextToken(); long ys = (long) in.nval;
        in.nextToken(); long xf = (long) in.nval;
        in.nextToken(); long yf = (long) in.nval;

        p = new int[n];
        for (int i = 0; i < n; i++) p[i] = i;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x1[j] <= x2[i] + 1 && x1[i] <= x2[j] + 1
                        && y1[j] <= y2[i] + 1 && y1[i] <= y2[j] + 1) {
                    p[find(i)] = find(j);
                }
            }
        }

        int s = -1, f = -1;
        for (int i = 0; i < n; i++) {
            if (s == -1 && xs >= x1[i] && xs <= x2[i] && ys >= y1[i] && ys <= y2[i]) s = i;
            if (f == -1 && xf >= x1[i] && xf <= x2[i] && yf >= y1[i] && yf <= y2[i]) f = i;
        }

        System.out.println(s != -1 && f != -1 && find(s) == find(f) ? "1" : "0");
    }


}
class YandexE {
    static DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));

    static int nextInt() throws IOException {
        int ret = 0, b = in.read();
        while (b != '-' && (b < '0' || b > '9')) b = in.read();
        boolean neg = false;
        if (b == '-') { neg = true; b = in.read(); }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();

        final long OFFSET = 2_000_000_000_000L; // |P| <= 2e12
        long[] keys = new long[n + 1];
        long p = 0;
        keys[0] = (p + OFFSET) << 20;
        for (int i = 0; i < n; i++) {
            p += a[i] - nextInt();
            keys[i + 1] = ((p + OFFSET) << 20) | (i + 1);
        }

        Arrays.sort(keys);

        long mask = (1L << 20) - 1;
        int best = -1;
        int i = 0, m = n + 1;
        while (i < m) {
            int j = i;
            long val = keys[i] >> 20;
            while (j + 1 < m && (keys[j + 1] >> 20) == val) j++;
            int first = (int) (keys[i] & mask);
            int last = (int) (keys[j] & mask);
            if (last > first) best = Math.max(best, last - first - 1);
            i = j + 1;
        }
        System.out.println(best);
    }
}
