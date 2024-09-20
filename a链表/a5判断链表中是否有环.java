package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.ArrayList;
import java.util.HashSet;

public class a5判断链表中是否有环 {
    /**
     * !判断给定的链表中是否有环。如果有环则返回true，否则返回false。
     */

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        HashSet<ListNode> set = new HashSet<>();
        while (head != null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
