package org.example.b二分查找_排序;

public class b1二分查找1 {

    /**
     * !请实现无重复数字的升序数组的二分查找
     * !给定一个 元素升序的、无重复数字的整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标（下标从 0 开始），否则返回 -1
     */

    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] < target) {
                l = m + 1;
            }else if(nums[m] > target){
                r = m -1;
            }else {
                return m;
            }
        }
        return -1;
    }

}
