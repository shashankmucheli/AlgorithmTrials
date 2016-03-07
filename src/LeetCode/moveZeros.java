/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Shashank
 */
public class moveZeros {
    public static void moveZeroes(int[] nums) {
       int n = nums.length;
       int count = 0;
       boolean flag = false;
       for (int i = 0 ; i < n ; i++){
            if(i < n-1 && nums[i] == 0 && nums[i+1] == 0){
                flag = true;
            }
           if(nums[i] == 0){
               count++;
               for (int j = i; j < n-1; j++){
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
               }
           }
           if(flag){
                for (int k = 0; k < i ; k++){
                    if(nums[k] == 0){
                         for (int j = k; j < n-1; j++){
                             nums[j] = nums[j+1];
                             nums[j+1] = 0;
                         }
                     }
                }
           }
       }
       for(int t: nums){
            System.out.print(t+",");
       }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        int n;
        System.out.println("Enter the length: ");
        n = in.nextInt();
        System.out.println("Enter a list of numbers: ");
        for (int i = 0; i < n ; i++) nums[i] = in.nextInt();
        moveZeroes(nums);
    }
}
