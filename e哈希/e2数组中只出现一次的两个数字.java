package org.example.e哈希;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class e2数组中只出现一次的两个数字 {

    /**
     * ! 一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。
     * ! 请写程序找出这两个只出现一次的数字。
     */

    public int[] FindNumsAppearOnce (int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num,map.get(num) == null ? 1 : map.get(num) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        res.sort(Integer::compareTo);
        int[] array = res.stream().mapToInt(Integer::intValue).sorted().toArray();
        return array;
    }

}
