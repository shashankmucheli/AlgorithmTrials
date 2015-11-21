/*
You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:

3 2 2 6

The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).
 */
package HackerRank;

import static java.lang.System.exit;
import java.util.Scanner;
//import org.apache.commons.lang.ArrayUtils;

/**
 *
 * @author Shashank Mucheli shashank@mucheli.com
 */
public class CutTheSticks {
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n];
        if ( n > 1000 || n < 1) { exit(0);}
        for (int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Pass");
        while(n > 0){
            System.out.print("\n");
            int min = a[0];
            for (int i = 0; i<n ; i++){
                if (min > a[i]) min = a[i];
            }
            //System.out.println(min);
            for(int i = 0; i < n ; i++){
                a[i] = a[i] - min;
            }
            for(int i = 0; i < n ; i++){
                if ( a[i] <= 0) {
                    for(int j = i ; j < n-1 ; j++){
                        a[j] = a[j+1];
                    }
                    n--;
                }
            }
            for (int i = 0; i < n ; i++){
                System.out.print(a[i]+" ");
            }
        }
        //System.out.println(a.indexOf(5));
    }
}
