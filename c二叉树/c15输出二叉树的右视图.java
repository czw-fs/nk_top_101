package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class c15输出二叉树的右视图 {

    public Map<Integer, Integer> map = new HashMap<>();

    public int[] solve(int[] preOrder, int[] inOrder) {
        map = IntStream.range(0, inOrder.length).boxed().collect(Collectors.toMap(i -> inOrder[i], i -> i));
        TreeNode treeNode = generateTree(preOrder, 0, 0, inOrder.length);
        int[] rightView = getRightSideView(treeNode);
        return rightView;
    }

    private TreeNode generateTree(int[] preOrder, int preRootIndex, int inOrderStart, int inOrderEnd) {
        if(inOrderStart >= inOrderEnd){
            return null;
        }

        int rootValue = preOrder[preRootIndex];
        TreeNode root = new TreeNode(rootValue);
        Integer inRootIndex  = map.get(rootValue);

        root.left = generateTree(preOrder,preRootIndex + 1,inOrderStart,inRootIndex);
        root.right = generateTree(preOrder,preRootIndex + (inRootIndex -inOrderStart) + 1,inRootIndex + 1,inOrderEnd);
        return root;
    }

    public int[] getRightSideView(TreeNode treeNode){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        List<Integer> rightView = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (i == size - 1) {
                    rightView.add(cur.val);
                }

                Optional.ofNullable(cur.left).ifPresent(queue::add);
                Optional.ofNullable(cur.right).ifPresent(queue::add);
            }


        }
        return rightView.stream().mapToInt(item -> item).toArray();
    }

}
