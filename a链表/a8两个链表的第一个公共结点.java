package org.example.a链表;

import org.example.zCommonClass.ListNode;

public class a8两个链表的第一个公共结点 {

    /**
     * !输入两个无环的单向链表，找出它们的第一个公共结点，如果没有公共节点则返回空。
     * !（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
     */

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }

        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (pHead1 != pHead2){
            pHead1 = pHead1 == null ? l2 : pHead1.next;
            pHead2 = pHead2 == null ? l1 : pHead2.next;
        }

        return pHead1;
    }

}
