/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author shashank
 */
public class bDayGifts {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int T = 0;
        T = in.nextInt();
        long[] bResult = new long[T];
        long[] wResult = new long[T];
        for (int i = 0; i < T;i++){
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            long bCost = x*b;
            long wCost = y*w;
            if((x*b) > ((y+z)*b)){ x = y+z; bCost = x*b;}
            if((y*w) > ((x+z)*w)){y = x+z; wCost = y*w;}
            if(bCost < 0) bCost = x*b;
            if(wCost < 0) wCost = y*w;
            bResult[i] = bCost; 
            wResult[i] = wCost;             
        }
        for (int i = 0; i < T;i++){
            long sum = bResult[i] + wResult[i];
            System.out.println(sum);
        }
    }
}
