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
public class AnagramPalindrome {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s.length() <= 1 || s.length() >= Math.pow(10, 5)){
            System.exit(0);
        }
        String s1 = s.replaceAll("\\s+","");
        s1 = s1.toLowerCase();
        List<Character> charlist = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            charlist.add(c);
        }
        int[] count = new int[charlist.size()];
        for(int i = 0; i < charlist.size(); i++){ count[i] = 0;}
        for(int j = 0; j < charlist.size(); j++){
            char c = charlist.get(j);
            for(int i = 0; i < charlist.size(); i++){
                if (charlist.get(i) == c){
                    count[i]++;
                    charlist.remove(i);
                    
                }
            }
        }
        int odd = 0;
        for(int i: count){
            if(i%2 != 0) odd++; 
        }
        if(odd > 1) {System.out.println("N0");}
        else System.out.println("YES");
    }
}
