/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmtrials;

import java.util.Scanner;

/**
 *
 * @author Shashank
 */
public class reverseStr {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x = in.next();
        char[] tmp = new char[50];
        tmp = x.toCharArray();
        for(int i=x.length()-1;i>=0;i--){
            System.out.print(tmp[i]);
        }
        System.out.println();
    }
}
