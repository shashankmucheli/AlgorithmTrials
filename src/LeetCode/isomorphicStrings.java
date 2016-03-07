/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Hashtable;

/**
 *
 * @author Shashank
 */
public class isomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        char[] f,l = new char[s.length()];
        if(s.length() != t.length()) return false;
        boolean sol = true; 
        f = s.toCharArray();
        l = t.toCharArray();
        Hashtable<Character,Character> iso= new Hashtable<>();
        Hashtable<Character,Character> isor= new Hashtable<>();
        for(int i = 0; i < s.length(); i++){
            if(iso.containsKey(f[i])){
                Character tmp = iso.get(f[i]);
                if(!tmp.equals(l[i])) sol = false;
            }
            else{
                iso.put(f[i],l[i]);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(isor.containsKey(l[i])){
                Character tmp = isor.get(l[i]);
                if(!tmp.equals(f[i])) sol = false;
            }
            else{
                isor.put(l[i],f[i]);
            }
        }        
        return sol;
        
    }
    
    public static void main(String args[]){
        String s = "ab";
        String t = "aa";
        boolean flag = isIsomorphic(s,t);
        System.out.println("The two strings are Isomorphic? "+flag);
    }
}
