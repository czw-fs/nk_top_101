package org.example.d堆_栈_队列;

import java.util.Stack;

public class d2包含min函数的栈 {

    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的 min 函数，
     * 输入操作时保证 pop、top 和 min 函数操作时，栈中一定有元素。
     */

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        if(minstack.isEmpty() || minstack.peek() > node){
            minstack.push(node);
        }else {
            minstack.push(minstack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}
