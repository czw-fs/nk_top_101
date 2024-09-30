package org.example.e哈希;

import java.util.Arrays;

public class e3缺失的第一个正整数 {

    /**
     * ! 给定一个无重复元素的整数数组nums，请你找出其中没有出现的最小的正整数
     */

    public int minNumberDisappeared (int[] nums) {
        int[] array = Arrays.stream(nums).sorted().toArray();
        int temp = 1;
        for (int i : array) {
            if(i < 0){
                continue;
            }
            if(i >  temp){
                return temp;
            }
            temp = i;//防止重复数据
            temp++;
        }
        return array[array.length - 1] + 1;
    }



}
