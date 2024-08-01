package io.smartir.leetcode.DSA.medium;

//LeetCode380
public class RandomizedSet {
    private Integer[] datas;

    public RandomizedSet() {
        int random = 0;
        while (random == 0) {
            random = (int) (Math.random() * 10);
        }
        this.datas = new Integer[random];
    }

    public boolean insert(int val) {
        for (int i = 0; i < this.datas.length; i++) {
            if (datas[i] != null && datas[i] == val) return false;
            else if (datas[i] == null) {
                datas[i] = val;
                return true;
            }
        }
        int length = 2 * datas.length;
        Integer[] temp = new Integer[length];
        for (int i = 0; i < length; i++) {
            if (i > datas.length - 1) {
                temp[i] = val;
                break;
            }
            temp[i] = datas[i];
        }
        datas = temp;
        return true;
    }

    public boolean remove(int val) {
        boolean check = false;
        for (int i = 0; i < this.datas.length; i++) {
            if (datas[i] != null && datas[i] == val) check = true;
        }
        if (check) {
            Integer[] temp = new Integer[datas.length - 1];
            int counter = 0;
            for (int i = 0; i < this.datas.length; i++) {
                if (datas[i] != null && datas[i] == val) continue;
                temp[counter] = datas[i];
                counter++;
            }
            datas = temp;
        }
        return check;
    }

    public Integer[] getDatas() {
        return datas;
    }

    public int getRandom() {
        int counter = 0;
        for (int i = 0; i < this.datas.length; i++) {
            if (datas[i] != null) counter++;
        }
        int random = (int) (Math.random() * counter);

        return this.datas[random];
    }
}
