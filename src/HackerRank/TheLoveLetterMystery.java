/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shashank
 */
public class TheLoveLetterMystery {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
           if (s.charAt(i) != s.charAt(n - i - 1)) {
               return false;
           }
        }
        return true;
    }    
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] countArr = new int[t];
        for (int j = 0; j<t ; j++){
            String s = in.next();
            int count = 0;
            char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            List<Character> alphabet = new ArrayList<>();
            for (char c : a) {
                alphabet.add(c);
            }
            String s1 = s.replaceAll("\\s+","");
            s1 = s1.toLowerCase();
            int n = s1.length();
            if(isPalindrome(s1)){countArr[j] = count; }
            else{
                for(int i=0;i<(n / 2) + 1;++i){
                    int f, l;
                    f = alphabet.indexOf(s1.charAt(i));
                    l = alphabet.indexOf(s1.charAt(n - i - 1));
                    //System.out.println(alphabet.get(f)+" "+alphabet.get(l));
                    if(f==l){}
                    else if(f<l){
                        count+=l-f;
                        //System.out.println(count);
                    }
                    else if(l<f){
                        count+=f-l;
                       // System.out.println(count);
                    }
                }
                countArr[j] = count;
            }
        }
        for(int i: countArr){
            System.out.println(i);
        }
    }
}
