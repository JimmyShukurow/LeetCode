package io.smartir.leetcode.DSA.medium;

public class LeetCode97 {
    Boolean [][]dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        dp=new Boolean[s1.length()+1][s2.length()+1];
        return backtrack(s1,s2,s3,0,0,0);
    }
    private boolean backtrack(String s1, String s2, String s3,int i,int o,int s){
        if(i>=s3.length()){
            return o==s1.length()&&s==s2.length();
        }
        if(dp[o][s]!=null)return dp[o][s];
        boolean check=false;
        char c=s3.charAt(i);
        if(o<s1.length()&&s1.charAt(o)==c){
            check=backtrack(s1,s2,s3,i+1,o+1,s);
        }
        if(!check&&s<s2.length()&&s2.charAt(s)==c){
            check=backtrack(s1,s2,s3,i+1,o,s+1);
        }
        return dp[o][s]=check;
    }
}
