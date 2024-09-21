package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class a11判断一个链表是否为回文结构 {

    /**
     * ! 给定一个链表，请判断该链表是否为回文结构。
     * ! 回文是指该字符串正序逆序完全一致。
     */

    public boolean isPail (ListNode head) {
        if(head == null){
            return true;
        }

        List<Integer> list1 = new ArrayList<>();
        while (head != null){
            list1.add(head.val);
            head = head.next;
        }

        List<Integer> list2 = new ArrayList<>(list1);
        Collections.reverse(list2);
        return list1.equals(list2);
    }

}
