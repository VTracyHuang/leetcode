package com.tracy.practice.hot.tracy20211201;

import com.tracy.practice.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by huangyating
 * 二叉树的最大深度
 * @Date 2021/12/1
 */
public class maxDepth {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 0;
        TreeNode leftTreeNode = new TreeNode();
        leftTreeNode.val = 1;
        TreeNode rightTreeNode = new TreeNode();
        rightTreeNode.val = 2;
        treeNode.left = leftTreeNode;
        treeNode.right = rightTreeNode;
        TreeNode leftTreeNode2 = new TreeNode();
        leftTreeNode2.val = 11;
        TreeNode rightTreeNode2 = new TreeNode();
        rightTreeNode2.val = 12;
        leftTreeNode.left =leftTreeNode2;
        leftTreeNode.right=rightTreeNode2;
        System.out.println(maxDepth(treeNode));
    }


    //深度优先算法
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }

    //广度优先算法
    public static int maxDepth2(TreeNode root){
        if(root ==  null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                size--;
            }
            ans ++;
        }
        return ans;
    }
}
