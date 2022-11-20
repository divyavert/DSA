package com.company.DataStructure.tree.treeImplementaion;

import java.util.*;

public class bst {
    public static void main(String[] args) {

        tree root = new tree(50);
        root.left = new tree(20);


        root.right = new tree(70);
        root.right.left =new tree(60);
        root.right.right = new tree(80);
        vertical(root);







    }

    private static int floor(tree root,  int x) {
      int possible = -1;

        while (root != null){
            if(root.key == x){
                return x;
            }else {
                if(root.key < x){
                    possible = root.key;
                    root = root.right;
                }else {
                    root = root.left;
                }
            }
        }
        return possible;
    }

    static tree deleteBst(tree root,tree head, int i) {
        if(root.key == i){
            if(root.left ==null && root.right ==null){
                return null;
            }
            if(root.left != null && root.right != null){
              tree succ = inorder(root);
              root.key = succ.key;
              root.right = deleteBst(root.right,head,succ.key);
              return root;
            }
            if(root.left != null){
                return root.left;
            }else {
                return root.right;
            }

        }else if (root.key > i){
             root.left = deleteBst(root.left,head,i);
        }else {
            root.right = deleteBst(root.right,head,i);
        }
        return root;
    }
    public static void preorder(tree root) {
        if (root != null) {

            preorder(root.left);
            list.add(root);
            preorder(root.right);
        }
    }
    static ArrayList<tree> list = new ArrayList<>();
    public static tree inorder(tree root) {
        tree curr = root.right;
        while (curr !=null && curr.left !=null){
            curr = curr.left;
        }
        return curr;
    }
    static void vertical(tree root){
        Queue<pair> q = new LinkedList<>();
        pair x = new pair(root,0);
        q.add(x);
        Map<Integer,Integer> m = new TreeMap<>();
        while (!q.isEmpty()){
           pair curr = q.poll();
           tree node = curr.node;
           int hd = curr.hd;
           if(!m.containsKey(hd)){
               m.put(hd,node.key);
           }
           if(node.left!=null){
               pair left = new pair(node.left,hd-1);
               q.add(left);
           }
           if(node.left!=null){
               pair right = new pair(node.right,hd+1);
               q.add(right);

           }




        }
        for (Map.Entry<Integer,Integer> e :m.entrySet()) {
            System.out.println(e.getValue());
        }

    }



}
class pair {
    tree node;
    int hd;

    public pair(tree node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}