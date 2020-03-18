//a java program to print all the permutations of String(GOD)
package com.tgt.igniteplus;
public class Q15permutation {
    public static void permutation(String str, String ans) {

        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        for (int i=0; i<str.length();i++)
        {
            char ch=str.charAt(i);
            String restOfTheString=str.substring(0,i)+str.substring(i+1);
            permutation(restOfTheString,ans+ch);
        }
    }
    public static void main(String[] args) {
        String s="GOD";
        permutation(s,"");
    }
}