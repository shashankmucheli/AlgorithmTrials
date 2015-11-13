/*
 * <p>You are given an integer N. Find the digits in this number that exactly divide N (division that leaves 0 as remainder) and display their count. For N=24, there are 2 digits (2 & 4). Both of these digits exactly divide 24. So our answer is 2.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author Shashank Mucheli shashank@mucheli.com
 */
public class findDigits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t;
        long n;
        t = in.nextInt();
        for( int j = 0; j < t; j++){
            n = in.nextLong();
            String str = String.valueOf(n);
            int len = str.length();
            long k = n, count = 0;
            while( len > 0){
                long i = k%10;
                k = k/10;
                len-=1;
                if(i == 0) continue;
                if(n%i == 0){ count +=1;}
            }
            System.out.println(count);
        }
    }
}
