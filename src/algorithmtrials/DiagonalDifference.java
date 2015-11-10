/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmtrials;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Shashank
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        int n, left=0, right=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the Matrix elements of size "+n+" X "+n);
        for (int i = 0; i < n; i++ ){
            for (int j = 0; j < n; j++ ){
                 matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++ ){
            left+=matrix[i][i];
        }
        
        for (int i = 0; i < n; i++ ){
            for (int j = 0; j < n; j++ ){
                if((i+j) == n-1){
                    right+=matrix[i][j];
                }
            }
        }
        int diagonal = left-right;
        System.out.println(Math.abs(diagonal));
    }    
}
