/*
 * <p>You are given an integer N. Print the factorial of this number. 
 * Input consists of a single integer N, where 1≤N≤100.
 * <p>Note: Factorials of N>20 can't be stored even in a 64−bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.
 * We recommend solving this challenge using BigIntegers. 
 */
package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Shashank Mucheli shashank@mucheli.com
 */
public class ExtraLongFactorials {
    public static void main(String args[]){
        BigInteger n;
        Scanner in = new Scanner(System.in);
        n = in.nextBigInteger();
        BigInteger fact;
        /*for(int i = n; i>=0;i++){
            //if(i == 0) fact*= BigInteger.valueOf(myInteger.intValue(1));
        }*/
    }
}
