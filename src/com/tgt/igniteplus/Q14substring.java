//program to read two string user input and check if first contains the second.
package com.tgt.igniteplus;
import java.util.*;
public class Q14substring {
    public static void main(String[] args) {
        String s1, s2;
        System.out.print("enter the main string ");
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        System.out.print("enter the sub string ");
        s2 = in.nextLine();
        if (s1.contains(s2))
            System.out.print(s2 + " is present in " + s1);
        else
            System.out.print(s2 + " is not present in " + s1);
    }
}