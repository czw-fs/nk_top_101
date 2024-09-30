package org.example.d堆_栈_队列;

import java.util.*;

public class d8表达式求值 {

    /**
     * ! 请写一个整数计算器，支持加减乘三种运算和括号。
     */

    public static void main(String[] args) {
        int solve = solve("1 + 1 + (2*(3-4))+ 2*5");
        System.out.println(solve);
    }
    public static int solve (String s) {
        s = s.replaceAll(" ", "");// 去空格

        Map<Character,Integer> map = new HashMap<>();    //存优先级的map
        map.put('-', 1);
        map.put('+', 1);
        map.put('*', 2);

        Deque<Integer> nums = new ArrayDeque<>();    // 数字栈
        Deque<Character> opts = new ArrayDeque<>();    // 操作符栈
        char[] chs = s.toCharArray();
        int n = chs.length;

        for(int i = 0; i < n; i++){
            char c = chs[i];
            if(isNumber(c)){    // 情况1
                int num = 0;
                int j = i;
                // 读取连续数字符号
                while(j < n && isNumber(chs[j])){
                    num = 10*num + chs[j++] - '0';
                }
                nums.push(num);
                i = j - 1;
            }else if (c == '('){    // 情况2
                opts.push(c);
            }else if (c == ')' ){    // 情况3
                while(opts.peek() != '('){
                    cal(nums, opts);
                }
                opts.pop();
            }else{    // 情况4
                while(!opts.isEmpty()){
                    char top = opts.peek(); // 获取栈顶操作符
                    if (top == '(' || map.get(top) < map.get(c)) break; // 遇到左括号或当前操作符优先级更高时停止
                    cal(nums, opts); // 计算栈顶操作符
                }
                opts.push(c);
            }
        }
        while(!opts.isEmpty()) {    // 计算栈中剩余操作符
            cal(nums, opts);
        }
        return nums.pop();
    }

    public static boolean isNumber(Character c){
        return Character.isDigit(c);
    }
    public static void cal(Deque<Integer> nums, Deque<Character> opts){
        int num2 = nums.pop();
        int num1 = nums.pop();
        char opt = opts.pop();
        if(opt == '+'){
            nums.push(num1 + num2);
        }else if(opt == '-'){
            nums.push(num1 - num2);
        }else if(opt == '*'){
            nums.push(num1 * num2);
        }
    }

}
