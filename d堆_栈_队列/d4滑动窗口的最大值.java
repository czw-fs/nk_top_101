package org.example.d堆_栈_队列;

import java.util.*;

public class d4滑动窗口的最大值 {

    /**
     * !给定一个长度为 n 的数组 num 和滑动窗口的大小 size ，找出所有滑动窗口里数值的最大值。
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ints = Arrays.copyOf(arr, 2);
        System.out.println(Arrays.toString(ints));
    }

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (num == null || num.length == 0 || size == 0 || size > num.length) {
            return new ArrayList<>();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            maxHeap.add(num[i]);

            if (i >= size - 1) {
                res.add(maxHeap.peek());
                maxHeap.remove(num[i - size + 1]);
            }
        }
        return res;
    }
}
