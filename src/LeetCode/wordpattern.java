/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author Shashank
 */
public class wordpattern {
    public static boolean wordPattern(String pattern, String str) {
        boolean solution = true;
        String[] str_arr = str.split("\\s+"); 
        char[] p = new char[pattern.length()];
        p = pattern.toCharArray();
        if (p.length != str_arr.length) return false;
        Hashtable <Character, String> res = new Hashtable<>();
        Hashtable <String, Character> res1 = new Hashtable<>();
        for(int i=0;i<p.length;i++){
                if (res.containsKey(p[i])){
                    String tmp = res.get(p[i]);
                    if (!tmp.equals(str_arr[i])) solution=false;
                }
                else{
                    res.put(p[i],str_arr[i]);
                }            
        }
        for(int i=0;i<p.length;i++){
            if (res1.containsKey(str_arr[i])){
                    Character tmp = res1.get(str_arr[i]);
                    if (!tmp.equals(p[i])) solution=false;
                }
                else{
                    res1.put(str_arr[i],p[i]);
                }
        }
        
        return solution;
    }
    public static void main(String args[]){
        String pattern = "abab";
        String str = "dog cat dog cat";
        boolean flag = wordPattern(pattern,str);
        System.out.println("Checks out to be "+flag);        
    }
}
