package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.List;

public class a2链表内指定区间反转 {

    /**
     * ! 将一个节点数为 size 链表 m 位置到 n 位置之间的区间反转
     * {1,2,3,4,5},2,4
     */

    public static void main(String[] args) {
        // 手动创建链表：1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("反转前: " + listToString(head));
        head = reverseBetween(head, 2, 4);
        System.out.println("反转后: " + listToString(head));
    }


    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;

        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        //获取到第一个反转结点
        ListNode cur = pre.next;

        for (int i = 0; i < n - m; i++) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }

        return dummyNode.next;
    }
    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(" -> ");
            }
            head = head.next;
        }
        return sb.toString();
    }

}
