package org.example.d堆_栈_队列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class d5最小的K个数 {

    /**
     * ! 给定一个长度为 n 的可能有重复值的数组，找出其中不去重的最小的 k 个数。
     * ! 例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4(任意顺序皆可)。
     */

    public ArrayList<Integer> GetLeastNumbers_Solution (int[] input, int k) {
        if(input == null || input.length == 0 || k == 0){
            return new ArrayList<>();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : input) {
            if(maxHeap.size() < k){
                maxHeap.offer(i);
            }else if (i < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.offer(i);
            }
        }

        return new ArrayList<>(maxHeap);
    }

}
