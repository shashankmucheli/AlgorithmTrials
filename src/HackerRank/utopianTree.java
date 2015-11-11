/*
Problem Statement

<p>The Utopian Tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter.

<p>Now, a new Utopian Tree sapling is planted at the onset of spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?

Input Format

The first line contains an integer, T, the number of test cases.
T lines follow; each line contains an integer, N, that denotes the number of cycles for that test case.

Constraints
1≤T≤10
0≤N≤60
@param T: Number of test cases; N: The number of cycles the tree goes through.
@return stdout: the height of the tree after N cycles.
 */
package HackerRank;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Shashank Mucheli shashank@mucheli.com
 */
public class utopianTree {
    public static void main(String args[]){
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        if(t > 10 || t < 1) {exit(0);}
        long[] l = new long[t];
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            if(n > 60 || n < 0) {exit(0);}
            if(n == 0) {l[i] = 1; continue;} 
            if(n == 1) {l[i] = 2; continue;} 
            long sum = 2, length = 2;
            long spring=0 , summer=0;
            if(n >= 2){
                for (int j = 2; j <= n; j++){
                    if(j%2 == 1) {
                        spring = length*2;
                        length = spring;
                    }
                    if(j%2 == 0){
                        summer = length+1;
                        length = summer;
                    }
                }
            }
            l[i] = length;
        }
        for(long j: l){
            System.out.println(j);
        }
    }
}
