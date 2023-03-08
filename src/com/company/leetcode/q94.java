package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class q94 {


    public static void main(String[] args) {
        TreeNode tr = new TreeNode(3);
        TreeNode tl = new TreeNode(6);
        TreeNode t = new TreeNode(4,tl, tr);
        inorder(t);
        System.out.println(list);

    }
    private static List<Integer> list = new ArrayList<>();
     private static void inorder(TreeNode t) {
         if(t.left!=null){
             inorder(t.left);
         }
         list.add(t.val);
         if(t.right!=null){
             inorder(t.right);
         }
    }

}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }