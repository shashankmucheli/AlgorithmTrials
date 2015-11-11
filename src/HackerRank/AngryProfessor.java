/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Shashank
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int T = in.nextInt();
        if(T < 1 && T > 10) { System.out.println("T out of range"); exit(0);}
        int [] n = new int[T];
        int [] k = new int[T];
        String [] result = new String[T];
        for (int i = 0; i < T; i++){
            n[i] = in.nextInt();
            k[i] = in.nextInt();
            int [] time = new int[n[i]];
            int j = 0; 
            int ontime = 0;
            while (j < n[i]){
                int  tmp = in.nextInt();
                if(tmp >= -100 && tmp <= 100){
                    time[j] = tmp;
                    if(tmp <= 0) ontime+=1;
                    j++;
                }
                else{
                    System.out.println("Number out of acceptable range");
                }
            }
            if(ontime >= k[i]) result[i] = "NO";
            if(ontime < k[i]) result[i] = "YES";
        }
        for(String t: result){
            System.out.println(t);
        }
    }
}
