/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Shashank
 */
public class oddEvenLinkedlist {
    public static ListNode oddEvenList(ListNode head) {
        ListNode tail = head;
        ListNode subtail = head.next.next;
        while(tail.next != null){
            ListNode tmp = null;
            tmp = tail;
            tail = subtail;
            subtail = tail;
            tail = tail.next;
            subtail=subtail.next;            
        }
        return head;        
    }
    public static void main(String args[]){
        ListNode[] list = new ListNode[5];
        for (int x = 0; x < 5; x++){
            list[x].val = 0;
            list[x].next = null;
        }
        list[0].val = 1;
        list[1].val = 2;
        list[2].val = 3;
        list[3].val = 4;
        list[4].val = 5;
        list[0].next = list[1];
        list[1].next = list[2];
        list[2].next = list[3];
        list[3].next = list[4];
        list[4].next = null;
        list[0] = oddEvenList(list[0]);
        for(ListNode x: list){
            System.out.print(x.val+" ");
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}