/* program to replace ‘a’ with ‘$’ in the following String
“I am always ready to learn although I do not always like being taught.” */
package com.tgt.igniteplus;
public class Q20replace {
    public static void main(String[] args){
        String str ="I am always ready to learn although I do not always like being taught";
        System.out.println("the initial string is :"+str);
        String s=str.replace('a','$');
        System.out.println("the replaced string is :"+s);
    }
}
