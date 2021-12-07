package com.tracy.practice.hot.tracy20211206;

/**
 * created by huangyating
 *
 * @Date 2021/12/7
 */
public class MergeTree {

    public TreeNode mergeTrees(TreeNode t1,TreeNode t2){
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        TreeNode merge = new TreeNode(t1.val + t2.val);
        merge.left = mergeTrees(t1.left,t2.left);
        merge.right = mergeTrees(t1.right,t2.right);
        return merge;
    }
}
