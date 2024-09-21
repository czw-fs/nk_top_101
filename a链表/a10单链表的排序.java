package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.sql.Array;
import java.util.ArrayList;

public class a10单链表的排序 {
    /**
     * ! 给定一个节点数为n的无序单链表，对其按升序排序。
     */
    public ListNode sortInList (ListNode head) {
        if(head == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode res = head;
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        head = res;
        list.sort((o1, o2) -> o1 - o2);
        for (Integer i : list) {
            head.val = i;
            head = head.next;
        }
        return res;
    }
}
