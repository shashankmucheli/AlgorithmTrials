/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.io.IOException;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author shashank
 */
public class ReverseInt {
    public static void main(String args[]){
        try{
            Scanner in = new Scanner(System.in);
            int n;
            n = in.nextInt();
            int result;
            result = reverse(n);
            System.out.println(result);
        }
        catch(Exception e){
      }
    }
    public static int reverse(int n) {
        String tmp = "";
        if (n >= Integer.MAX_VALUE || n <= Integer.MIN_VALUE) { return 0;}
        if (n == 0) return 0;
        if (n > 0){
            int length = (int) Math.log10(n) + 1;
            for(int i=0; i< length; i++){
                int tmp1 = n%10;
                n = n/10;
                tmp+= tmp1;
            }
        }
        if (n < 0) {
            int n1 = Math.abs(n);
            int length = (int) Math.log10(n1) + 1;
            for(int i=0; i< length; i++){
                int tmp1 = n1%10;
                n1 = n1/10;
                tmp+= tmp1;
            }
            long tmp1 = Long.parseLong(tmp);
            if(tmp1 > Integer.MAX_VALUE) return 0;
            tmp1 = tmp1 - (tmp1*2); 
            tmp = Long.toString(tmp1);
        }
        if(Long.parseLong(tmp) > Integer.MAX_VALUE) return 0;
        String pattern ="-?\\d+";
        if(tmp.matches("-?\\d+")){
            int result = Integer.parseInt(tmp);
            return result;
        }
        else return 0;
    }
}
