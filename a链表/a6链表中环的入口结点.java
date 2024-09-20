package org.example.a链表;

import org.example.zCommonClass.ListNode;

import java.util.HashSet;

public class a6链表中环的入口结点 {

    /**
     * !给一个长度为n链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null。
     */

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null){
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();
        while (pHead != null){
            if(set.contains(pHead)){
                return pHead;
            }else {
                set.add(pHead);
            }
            pHead = pHead.next;
        }
        return null;
    }

}
