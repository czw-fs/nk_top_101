package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class c9判断是不是完全二叉树 {

    public boolean isCompleteTree (TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftIsNull = false;
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();

            if(cur == null){
                leftIsNull = true;
                continue;
            }

            if(leftIsNull){
                return false;
            }
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return true;
    }
}
