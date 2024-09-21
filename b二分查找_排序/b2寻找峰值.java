package org.example.b二分查找_排序;

public class b2寻找峰值 {

    /**
     * 给定一个长度为n的数组nums，请你找到峰值并返回其索引。数组可能包含多个峰值，在这种情况下，返回任何一个所在位置即可。
     * 峰值元素是指其值严格大于左右相邻值的元素。严格大于即不能有等于
     *
     * <img src="../z-img/img2.png" alt="图片描述" width="300" height="200">
     */
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if(nums[m] < nums[m + 1]){
                l = m + 1;
            }else{
                r = m;
            }
        }
        return l;
    }

}
