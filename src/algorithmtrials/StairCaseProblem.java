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
public class StairCaseProblem {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        //System.out.println(n);
        for (int k = 1;k <= n; k++){
            for (int i = n;i >= k+1; i--){
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
        int a=3 , b=5;
        System.out.println((double)a/(double)b);
    }
}
