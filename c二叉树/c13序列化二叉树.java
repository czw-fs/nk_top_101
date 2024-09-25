package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class c13序列化二叉树 {

    String Serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        preOrderToString(root,res);
        return res.toString();
    }

    private void preOrderToString(TreeNode root, StringBuilder res) {
        if(root == null){
            res.append("#,");
            return;
        }
        res.append(root.val).append(",");
        preOrderToString(root.left,res);
        preOrderToString(root.right,res);
    }

    public TreeNode deserialize(String data) {
        if(data == null || data.isEmpty()){
            return null;
        }
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        TreeNode treeNode = preOrderToTree(queue);
        return treeNode;
    }

    private TreeNode preOrderToTree(Queue<String> queue) {
        String val = queue.poll();
        if("#".equals(val)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = preOrderToTree(queue);
        root.right = preOrderToTree(queue);
        return root;
    }


}
