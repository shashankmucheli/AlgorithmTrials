/*
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * @param i,j
 * @return int:sum
 * Note: 
 *
 *  1. You may assume that the array does not change.
 *  2. There are many calls to sumRange function.
 */
package LeetCode;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 * @author Shashank Mucheli shashank@mucheli.com
 */
public class NumArray {

   private int[] nums = new int[6];
    public NumArray(int[] nums) {
        this.nums = new int[]{-2, 0, 3, -5, 2, -1};
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k=i ; k <= j; k++){
            sum += nums[k];
        }
        return sum;
    }
    public static void main(String args[]){
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        NumArray numarray = new NumArray(nums);
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        if (i > j){System.out.println("i greater than j"); exit(0);}
        int b = numarray.sumRange(i, j);
        System.out.println(b);
    }
}
