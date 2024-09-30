package org.example.d堆_栈_队列;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class d7数据流中的中位数 {

    /**
     * !如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
     * !如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
     */

    private List<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        if (list.isEmpty()) {
            list.add(num);
        } else {
            int i = 0;
            while (i < list.size() && num <= list.get(i)){
                i++;
            }
            list.add(i ,num);
        }
    }

    public Double GetMedian() {
        int key = list.size() % 2;
        int mid = list.size() / 2;
        if (key == 1) {
            return list.get(mid).doubleValue();
        } else {
            return (list.get(mid) + list.get(mid - 1)) /2.0;
        }
    }

    public static void main(String[] args) {
        d7数据流中的中位数 instance = new d7数据流中的中位数();

        // 测试数据
        int[] testArray = {5, 2, 3, 4, 1, 6, 7, 0, 8};

        // 依次插入并打印当前中位数
        for (int num : testArray) {
            instance.Insert(num);
            System.out.println("插入 " + num + " 后的有序列表：" + instance.list);
            System.out.println("当前中位数：" + instance.GetMedian());
        }
    }

}
