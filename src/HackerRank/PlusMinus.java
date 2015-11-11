/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Shashank
 */
public class PlusMinus {
    public static void main(String[] args) {
        int n;
        int pc = 0, nc = 0, z = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            numbers[i] = in.nextInt();
            if(numbers[i]>0) pc++; 
            if(numbers[i]<0) nc++; 
            if(numbers[i] == 0) z++; 
        }
        DecimalFormat df = new DecimalFormat("#.000");
        Double d;
        d = ((double)pc/(double)n);
        System.out.println(df.format(d));
        d = ((double)nc/(double)n);
        System.out.println(df.format(d));
        d = ((double)z/(double)n);
        System.out.println(df.format(d));
        
    }
}
