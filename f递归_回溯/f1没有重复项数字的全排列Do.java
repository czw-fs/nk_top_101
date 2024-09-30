package org.example.f递归_回溯;

import java.util.ArrayList;
import java.util.LinkedList;

public class f1没有重复项数字的全排列Do {

    /**
     * ! 给出一组数字，返回该组数字的所有排列
     */

    public static void main(String[] args) {
        f1没有重复项数字的全排列Do permutations = new f1没有重复项数字的全排列Do();
        int[] nums = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = permutations.permute(nums);
        System.out.println(result);
    }


    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        LinkedList<Integer> list = new LinkedList<>();
        backTrack(num,list);
        return res;
    }

    public void backTrack(int[] num, LinkedList<Integer> list){
        if(list.size() == num.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int j : num) {
            if (list.contains(j)) {
                continue;
            }
            list.add(j);
            backTrack(num, list);
            list.removeLast();
        }
    }

}
