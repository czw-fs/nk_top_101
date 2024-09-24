package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class c5二叉搜索树与双向链表 {
    /**
     * !输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     */

    public static void main(String[] args) {
        Integer[] arr = {1,1,2,2};
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);

    }

    public TreeNode head = null;
    public TreeNode preRoot = null;

    public TreeNode Convert(TreeNode root) {
        if (root == null) {
            return null;
        }
        Convert(root.left);

        if (preRoot == null) {
            preRoot = root;
            head = root;
        } else {
            preRoot.right = root;
            root.left = preRoot;
            preRoot = root;
        }
        Convert(root.right);
        return head;
    }

}
