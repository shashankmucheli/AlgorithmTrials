/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author shashank
 */
public class nimGame {
    public static boolean canWinNim(int n) {
        if (n == 3 || n == 2 || n == 1) {
            return true;
        }
        else{
            while(n>3){
                
            }
        }
        
        
        return false;        
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean answer = canWinNim(n);
        System.out.println(answer);
    }
    
}
