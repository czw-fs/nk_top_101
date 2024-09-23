package org.example.b二分查找_排序;

public class b4旋转数组的最小数字 {

    /**
     * 有一个长度为 n 的非降序数组，比如[1,2,3,4,5]，将它进行旋转，
     * 即把一个数组最开始的若干个元素搬到数组的末尾，变成一个旋转数组，比如变成了[3,4,5,1,2]，或者[4,5,1,2,3]这样的。请问，给定这样一个旋转数组，求数组中的最小值。
     */

    public int minNumberInRotateArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] == nums[right]) {
                right--;
            } else {
                right = mid;
            }

        }
        return nums[left];
    }

}
