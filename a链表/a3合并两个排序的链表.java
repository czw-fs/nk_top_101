package org.example.a链表;

import org.example.zCommonClass.ListNode;

public class a3合并两个排序的链表 {

    /**
     * ! 输入两个递增的链表，单个链表的长度为n，合并这两个链表并使新链表中的节点仍然是递增排序的
     */

    public ListNode Merge (ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return pHead1 != null ? pHead1 : pHead2;
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (pHead1 != null && pHead2 != null){
            if(pHead1.val < pHead2.val){
                cur.next = pHead1;
                pHead1 = pHead1.next;
            }else {
                cur.next = pHead2;
                pHead2 = pHead2.next;
            }
            cur = cur.next;
        }
        cur.next = pHead1 != null ? pHead1 : pHead2;
        return head.next;
    }
}
