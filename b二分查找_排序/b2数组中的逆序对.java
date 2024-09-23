package org.example.b二分查找_排序;

import java.util.Arrays;

public class b2数组中的逆序对 {

    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组，求出这个数组中的逆序对的总数P，并将P对1000000007取模的结果输出，即输出P mod 1000000007。
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(countInversePairs(array));
        System.out.println(Arrays.toString(array));
    }

    // 常量 MOD，用于取模运算，避免结果溢出
    public static final int MOD = 1000000007;

    /**
     * 使用归并排序的思想来计算数组中的逆序对数量
     * @param left 左边界
     * @param right 右边界
     * @param array 原数组
     * @param tempArray 临时数组，用于合并时存储数据
     * @return 返回该范围内的逆序对数量
     */
    public static int mergeAndCount(int left, int right, int[] array, int[] tempArray) {
        // 递归终止条件，当左右边界相等时，只有一个元素，没有逆序对
        if (left >= right) {
            return 0;
        }

        // 计算中间位置，分治的基础
        int mid = (left + right) / 2;
        int inverseCount = mergeAndCount(left, mid, array, tempArray) + mergeAndCount(mid + 1, right, array, tempArray);
        inverseCount %= MOD;

        System.arraycopy(array, left, tempArray, left, right - left + 1);

        int leftPointer = left;
        int rightPointer = mid + 1;
        for (int i = left; i <= right; i++) {
            if (leftPointer == mid + 1) {
                array[i] = tempArray[rightPointer++];
            }
            else if (rightPointer == right + 1 || tempArray[leftPointer] <= tempArray[rightPointer]  ) {
                array[i] = tempArray[leftPointer++];
            }
            else if(tempArray[leftPointer] > tempArray[rightPointer]){
                array[i] = tempArray[rightPointer++];
                inverseCount += mid - leftPointer + 1;
            }
        }

        return inverseCount % MOD;
    }

    /**
     * 主函数，计算给定数组中的逆序对数量
     * @param array 输入的数组
     * @return 逆序对的数量
     */
    public static int countInversePairs(int[] array) {
        int[] tempArray = new int[array.length]; // 临时数组，用于辅助合并
        return mergeAndCount(0, array.length - 1, array, tempArray);
    }
}
