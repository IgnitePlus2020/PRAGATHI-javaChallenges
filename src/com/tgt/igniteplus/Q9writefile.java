//to write a data to the file using FileOutputStream where example.txt file is already created/present
package com.tgt.igniteplus;
import java.io.*;
public class Q9writefile {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("example.txt");
            fout.write(75);
            fout.close();
            System.out.println("done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}