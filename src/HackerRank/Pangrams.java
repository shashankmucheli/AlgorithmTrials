/*
Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shashank Mucheli shashank@mucheli.com
 */
public class Pangrams {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        List<Character> alphabet = new ArrayList<>();
        for (char c : a) {
            alphabet.add(c);
        }
        String s1 = s.replaceAll("\\s+","");
        String[] c = s1.split("");
        for (String b : c){
            b = b.toLowerCase();
            char tmp = b.charAt(0);  
            int x = alphabet.indexOf(tmp);
            if(alphabet.contains(tmp)){
                alphabet.remove(x);
            }
        }
        if(alphabet.isEmpty()) { System.out.println("pangram");}
        else if(alphabet.size() > 0){ System.out.println("not pangram");}
    }
}
