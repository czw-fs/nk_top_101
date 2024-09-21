package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.HashMap;
import java.util.Optional;

public class a14删除有序链表中重复的元素2 {

    /**
     * ! 给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
     */

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        HashMap<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            Integer exitNum = map.getOrDefault(head.val, 0);
            map.put(head.val, exitNum + 1);
            head = head.next;
        }

        ListNode cur = dummy;
        while (cur.next != null) {
            if (map.get(cur.next.val).equals(1)) {
                cur = cur.next;
            }else {
                cur.next = cur.next.next;
            }
        }

        return dummy.next;
    }

}
