package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.*;
import java.util.stream.Collectors;

public class a4合并k个已排序的链表 {

    /**
     * !合并 k 个升序的链表并将结果作为一个升序的链表返回其头节点。
     */

    public ListNode mergeKLists (ArrayList<ListNode> lists) {
        lists = Optional.ofNullable(lists).orElse(new ArrayList<>());

        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        lists = lists.stream().filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
        queue.addAll(lists);

        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (!queue.isEmpty()){
            ListNode temp = queue.poll();
            cur.next = temp;
            cur = cur.next;

            if(temp.next != null){
                queue.add(temp.next);
            }
        }
        return head.next;
    }


}
