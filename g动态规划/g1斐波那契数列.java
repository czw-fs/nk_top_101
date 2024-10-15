package org.example.g动态规划;

import java.util.ArrayList;

public class g1斐波那契数列 {

    public static void main(String[] args) {
        g1斐波那契数列 ge = new g1斐波那契数列();
        int fibonacci = ge.Fibonacci(3);
        System.out.println(fibonacci);
    }

    public int Fibonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }

        int sum = 0;
        int pre1 = 1;
        int pre2 = 1;
        for (int i = 2; i < n; i++) {
            sum = pre1 + pre2;
            pre1 = pre2;
            pre2 = sum;
        }
        return sum;
    }
}
