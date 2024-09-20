package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class a9链表相加2 {

    /**
     * 假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
     * 给定两个这种链表，请生成代表两个整数相加值的结果链表。
     *
     * <img src="../z-img/img1.png" alt="图片描述" width="300" height="200">
     */

    public ListNode addInList (ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null){
            return head1 != null ? head1 : head2;
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (head1 != null) {
            stack1.push(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            stack2.push(head2.val);
            head2 = head2.next;
        }

        //进位
        int carry = 0;
        ListNode result = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }
}
