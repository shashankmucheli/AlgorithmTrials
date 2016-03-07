/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Shashank
 */
public class NumArray {
    public NumArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(nums));
    }

    public static  int sumRange(int i, int j) {
        //ArrayList<Integer> sublist = ;
        //this.
        return 0;
        
    }
    public static void main(String args[]){
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++){
            nums[i] = i;
        }
        NumArray numArray = new NumArray(nums); 
    }
}
