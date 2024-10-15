package org.example.g动态规划;

public class g2跳台阶 {

    /**
     * !一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */
    public int jumpFloor (int number) {
        if(number == 1){
            return 1;
        }
        if(number == 2){
            return 2;
        }
        int sum = 0;
        int pre1 = 1;
        int pre2 = 2;
        for(int i = 2;i < number;i++){
            sum = pre1 + pre2;
            pre1 = pre2;
            pre2 = sum;
        }
        return sum;
    }
}
