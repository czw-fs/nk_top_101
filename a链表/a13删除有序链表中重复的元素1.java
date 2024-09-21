package org.example.a链表;

import org.example.zCommonClass.ListNode;

public class a13删除有序链表中重复的元素1 {

    /**
     * ! 删除给出链表中的重复元素（链表中元素从小到大有序），使链表中的所有元素都只出现一次
     */
    public ListNode deleteDuplicates (ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        while (cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
