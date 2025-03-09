package io.smartir.leetcode.DSA.medium;

import java.util.*;

class Pair{
    double qt;
    String dvd;

    public Pair(double qt, String dvd){
        this.qt = qt;
        this.dvd = dvd;
    }

}
class LeetCode399 {
    public double[] calcEquation(List<List<String>> eq, double[] val, List<List<String>> q) {
        HashMap<String, List<Pair>> map = new HashMap<>();
        double[] res = new double[q.size()];
        for(int i=0;i<eq.size();i++){
            String s1 = eq.get(i).get(0);
            String s2 = eq.get(i).get(1);

            if(!map.containsKey(s1))
                map.put(s1, new ArrayList<>());
            if(!map.containsKey(s2))
                map.put(s2, new ArrayList<>());
            map.get(s2).add(new Pair(val[i], s1));
            map.get(s1).add(new Pair(1/val[i], s2));
        }
        for(int i = 0;i<q.size(); i++){

            String s1 = q.get(i).get(0);
            String s2 = q.get(i).get(1);

            if(!map.containsKey(s1) || !map.containsKey(s2)){
                res[i] = -1;
                continue;
            }

            HashSet<String> set = new HashSet<>();
            Queue<Pair> pq = new LinkedList<>();
            pq.offer(new Pair(1, s2));

            while(!pq.isEmpty()){
                Pair p = pq.poll();
                if(p.dvd.equals(s1)){
                    res[i] = p.qt;
                    break;
                }
                for(Pair nb : map.get(p.dvd)){
                    if(!set.contains(nb.dvd)){
                        set.add(nb.dvd);
                        pq.offer(new Pair(nb.qt*p.qt, nb.dvd));
                    }
                }
            }
            res[i] = res[i]!=0?res[i]:-1.0;
        }
        return res;
    }
}
