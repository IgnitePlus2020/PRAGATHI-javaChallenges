// program to convert the string totally to uppercase
package com.tgt.igniteplus;
import java .util.*;
public class Q11toupper {
    public static void main(String[] args){
        String s;
        System.out.print("enter the string to be converted ");
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        String upper=s.toUpperCase();
        System.out.print("the converted string is "+upper);
    }
}