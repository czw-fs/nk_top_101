package org.example.f递归_回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class f2有重复项数字的全排列Do {

    boolean []mark;
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        LinkedList<Integer> track = new LinkedList<>();
        mark = new boolean[num.length];

        Arrays.sort(num);
        backtrack(num,track);
        return res;
    }

    public void backtrack(int[] num, LinkedList<Integer> track){
        if(track.size() == num.length){
            res.add(new ArrayList<Integer>(track));
            return;
        }
        for(int i = 0; i < num.length; i++){
            if(mark[i] || i>0 && num[i] == num[i-1] && !mark[i-1]){
                continue;
            }

            track.add(num[i]);
            mark[i] = true;

            backtrack(num,track);
            track.removeLast();

            mark[i] = false;
        }
    }
}
