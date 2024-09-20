package org.example.a链表;

import org.example.zCommonClass.ListNode;

public class a7链表中倒数最后k个结点 {

    /**
     * !输入一个长度为 n 的链表，设链表中的元素的值为 ai ，返回该链表中倒数第k个节点。
     * !如果该链表长度小于k，请返回一个长度为 0 的链表。
     */

    public ListNode FindKthToTail (ListNode pHead, int k) {
        if(pHead == null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        for(int i = 0 ;i < k ;i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
