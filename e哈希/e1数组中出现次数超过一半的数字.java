package org.example.e哈希;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class e1数组中出现次数超过一半的数字 {

    /**
     * ! 给一个长度为 n 的数组，数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     */

    public int MoreThanHalfNum_Solution(int[] numbers) {
        int[] array = Arrays.stream(numbers).sorted().toArray();
        return array[array.length / 2];
    }

    /**
     * 解法2
     */
    public int MoreThanHalfNum_Solution2(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.put(number, map.get(number) == null ? 0 : map.get(number) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= numbers.length / 2) {
                res = entry.getKey();;
            }
        }
        return res;
    }
}
