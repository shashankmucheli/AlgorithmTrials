/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Shashank
 */
public class CutTheSticks {
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(i, in.nextInt());
        }
        
        System.out.println(a.size());
        while(a.size() > 1){
            int min = Integer.MAX_VALUE;
            for (Integer a1 : a) {
                if (a1 <= min) {
                    min = a1;
                }
            }
            for(int i = 0 ; i < a.size() ; i++){
                int tmp = a.get(i);
                tmp = tmp - min;
                if(tmp <= 0) { a.remove(i); i--;}
                else a.set(i, tmp);
            }
            if(!a.isEmpty()){
                System.out.println(a.size());
            }            
        }
    }
}
