package com.company.DataStructure.tree.treeImplementaion;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class treemain {


    public static void main(String[] args) {

        tree root = new tree(50);
        root.left = new tree(30);
        root.left.left = new tree(20);
        root.left.right = new tree(40);
        root.right = new tree(70);
        root.right.left =new tree(60);
        root.right.right = new tree(80);



//            tree root = new tree(10);
//            root.right = new tree(30);
//         root.right.right = new tree(60);
//            root.left = new tree(20);
//            root.left.left = new tree(30);
//            root.left.left.right = new tree(50);
//        root.left.left.left = new tree(40);

//        System.out.println(count(root));

//        root.right.left.right.left =new tree(90);
//        System.out.println(hb(root));
//        int in [] ={40,20,60,50,70,10,80,100,30};
//        int pre []={10,20,40,50,60,70,30,80,100};
//        tree node = preToBtree(pre,in,0,in.length-1);
//        inorder(node);
//        int h = height(root);
//        bfsSpiral(root);
//      int h =  diameter(root);
//            System.out.println(max1+" "+h);

//        tree ans = lcaEff(root,60,70);
//        System.out.println(ans.key);

//        burn(root,60);
//        System.out.println(count);

//serialization(root);
//
//tree ans = decentralization(list);
//inorder(root);
//        System.out.println();
inorder(root);
        System.out.println();
itpreorder(root);




    }

    // different traversal base case is root == null
    public static void inorder(tree root) {
        if (root != null) {
            System.out.print(root.key + " ");
            inorder(root.left);

            inorder(root.right);
        }
    }

    // height of the tree it's a recursive function
// base case root == null
   static int max = Integer.MIN_VALUE;
    static int height(tree root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right =height(root.right);
        max = Math.max(max,right+left+1);
        return Math.max(left,right)+1;
    }

    //printing kth level
    static void k(tree root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.key + " ");
            return;
        }

        k(root.left, k - 1);
        k(root.right, k - 1);

    }

    // level order (bfs) traversal brute force
    static void level(int h, tree root) {
        int i = 0;
        while (h > i) {
            k(root, i);
            System.out.println();
            i++;
        }

    }

    // bfs using queue
// add root in queue when u poll an item add its child in it
    static void bfs(tree root) {
        if (root == null)
            return;
        Queue<tree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            tree curr = queue.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

    }
// add null every time you hit null
    static void bfsLine(tree root) {
        if (root == null)
            return;
        Queue<tree> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        while (queue.size()>1) {
            tree curr = queue.poll();
            if (curr == null) {
                System.out.println();
                queue.add(null);
                continue;
            }
//            System.out.print(curr.key + " ");
            if (curr.left != null) {
                queue.add(curr.left);

            }
            if (curr.right != null) {
                queue.add(curr.right);

            }


        }

    }
//spiral bsf
static void bfsSpiral(tree root) {
    if (root == null)
        return;
    Queue<tree> queue = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();
    int flag =0;
    boolean reverse = false;
    queue.add(root);
    queue.add(null);
    while (queue.size()>1) {
        if(reverse && flag==1){

            for (tree r:queue) {
                if(r!=null)
                stack.add(r.key);
            }

            while (!stack.isEmpty()){
                System.out.print(stack.pop()+" ");

            }

            flag = 0;
//
        }
        tree curr = queue.poll();
        if (curr == null) {
            System.out.println();
            queue.add(null);
            reverse = !reverse;
            flag = 1;
            continue;
        }
        if (!reverse){
            System.out.print(curr.key + " ");
        }

        if (curr.left != null) {
            queue.add(curr.left);

        }
        if (curr.right != null) {
            queue.add(curr.right);

        }


    }

}

// get max of bst
// go to null return min java number (base condition)
// else return max of current or max of root left and rigth that means any max number from down of the tree
static int getmax(tree root){
        if (root == null){
            return Integer.MIN_VALUE; // remember new concept
        }

        return Math.max(root.key,Math.max(getmax(root.left),getmax(root.right)));
}
//print left view of bst
// view is print every node first node of leve in pre-order traversa
// maintain a level and maxlevel when ever you move next level update level
// check if maxlevel is less than level than print else move head;
 static int maxlevel = 0;
static void left(tree root, int level){
    if(root==null){
        return;
    }

        if(maxlevel<level){
            System.out.println(root.key);
            maxlevel = level;

        }

         left(root.left,level+1);
         left(root.right,level+1);

}
// child sum property
 // for e
    static boolean childProp(tree root){
    if(root==null){
        return true;
    }
    int sum = 0;
    if(root.right == null && root.left == null){
     return true;
    }
    if (root.right==null){
        return root.key == root.left.key;
    }

    if (root.left==null){
            return root.key == root.right.key;
    }

  sum = root.left.key + root.right.key;
  if(sum != root.key){
      return false;
  }
  return childProp(root.left)&&childProp(root.right);




}
    // height balaced in bst
    static boolean hb (tree root){
        if (root == null){
            return true;
        }
        int right = 0;
        int left = 0;
        if(root.right!=null){
           right = height(root.right);
        }
        if(root.left!=null){
            left = height(root.left);
        }


        return Math.abs(right-left) <=1 && hb(root.right)&& hb(root.left);
    }
   // pre and inorder to binary tree
static int preorder = 0;
    static tree preToBtree(int pre [],int in[],int s,int e){
        //  int in [] ={40,20,60,50,70,10,80,100,30}; int pre []={10,20,40,50,60,70,30,80,100};
       if(e<s)
           return null;
       tree root = new tree(pre[preorder++]);
       int index = binary(in,root.key);

       root.left = preToBtree(pre,in,s,index-1);
       root.right = preToBtree(pre,in,index+1,e);
        return root;
    }
    static int binary(int[]arr,int t){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==t){
                return i;
            }
        }
        return -1;
    }
// diameter of tree
// main logic is lh + rh +1 max of all node in tree is diameter
// it uses height function only just when we call left and right height function we store there hegiht
// and max = max of max and new lh+rh+1
// we return height i.e max of lh and rh +1
    static int max1 = Integer.MIN_VALUE;
   static int diameter (tree root){
       if(root == null)
           return 0;
      int left = height(root.left);
      int right = height(root.right);
       max1 = Math.max(max1,left+right+1);
       diameter(root.left);
       diameter(root.right);
      return Math.max(left,right)+1;
    }
//lca the lowest common ancestor that means where they first meet
// logic here is make two list path1 and path2 root to two end
// then check which is last common element in list and return that
    static boolean findpath(ArrayList<tree> list, tree root,int x){
       if(root==null)
           return false;
       if(root.key==x){
           list.add(root);
           return true;}
        list.add(root);
       if (findpath(list,root.right,x)||findpath(list,root.left,x))
           return true;
       list.remove(list.size()-1);  // very smart
       return false;
    }

    static int lca (tree root,int a, int b){
        ArrayList<tree> path1 = new ArrayList<>();
        ArrayList<tree> path2 = new ArrayList<>();
        boolean b1 = findpath(path1,root,a);
        boolean b2 = findpath(path2,root,b);

        if(!b1&&b2){
            return -1;
        }
        int i =0;
        while (i<path1.size()-1&&i<path2.size()-1) {

         if(path1.get(i+1)==path2.get(i+1)){
             i++;
         }else {
             return path1.get(i).key;
         }
        }
        return path1.get(i).key;
    }
// effiecnt way for lca
// there are four case for every node
// 1 curr node = n1 or n2   return curr node
// 2 curr node has n1 n2 opposite side  return curr node
// 3 curr node has n1 and both n2 on same side return which ever call is not null
// 4 curr node does not have n1 or n2 as child return null
static tree lcaEff (tree root,int a, int b){
       if(root == null)
           return null;
       if(root.key==a||root.key==b)
           return root;
       tree left = lcaEff(root.left,a,b);
       tree right = lcaEff(root.right,a,b);
       if (left!=null&&right!=null)
           return root;
       if (left!=null){
           return left;
       }else {
           return right;
       }
   }


//static int count = 0;
//static ArrayList<tree> currlist = new ArrayList<>();
//   static void burn(tree root,int x){
//       ArrayList<tree> list = new ArrayList<>();
//       findpath(list,root,x);
//       if(list.isEmpty()){
//           return ;
//       }
//       Queue<tree> q = new LinkedList<>();
//       q.add(list.get(list.size()-1));
//
//       while (!q.isEmpty()){
//           tree curr = q.poll();
//           currlist.add(curr);
//           if(curr==null){
//               count++;
//               continue;
//           }
//           if(list.contains(curr)){
//               list.remove(list.size()-1);
//               if(!list.isEmpty())
//                  q.add(list.get(list.size()-1));
//           }
//           if (curr.left!=null&&(!currlist.contains(curr.left)))
//              q.add(curr.left);
//           if (curr.right!=null&&(!currlist.contains(curr.right)))
//              q.add(curr.right);
//           if ( (curr.left!=null||(!currlist.contains(curr.left))) &&  (curr.right!=null||(!currlist.contains(curr.right))))
//              q.add(null);
//           curr = null;
//
//       }
//
//
//   }
// have to this question time complexity
  static int count (tree root){
//       if(root==null)
//           return 0;
       int lh =0;
       int rh = 0;
       tree curr = root;
       while (curr!=null){
           lh++;
           curr=curr.left;
       }
       curr = root;
      while (curr!=null){
          rh++;
          curr=curr.right;
      }

      if(rh==lh)
          return (int) Math.pow(2,lh)-1;
      else {
          return count(root.left) + count(root.left) +1;
      }
  }
// serialization
static ArrayList<Integer>list =new ArrayList<>();
   static void serialization(tree root){
       if (root==null){
           list.add(-1);
           return;
       }
       list.add(root.key);
       serialization(root.left);
       serialization(root.right);

   }
// decentralization
static int x = 0;
static tree decentralization(ArrayList<Integer> list){
    if (list.get(x)==-1){
        x++;
        return null;

    }

    tree root = new tree(list.get(x));
    x++;
    root.left = decentralization(list);
    root.right= decentralization(list);
    return root;
}
//iterative inorder
static void itinorder(tree root){
    tree curr = root;
    Stack<tree> stack = new Stack<>();

    while (curr!=null||(!stack.isEmpty())){
        while (curr != null){
            stack.push(curr);
            curr = curr.left;

        }
        curr = stack.pop();
        System.out.print(curr.key+" ");
        curr = curr.right;

    }
}

    static void itpreorder(tree root){
        tree curr = root;
        Stack<tree> stack = new Stack<>();

        while (curr!=null||(!stack.isEmpty())){
            while (curr != null){
                System.out.print(curr.key+" ");
                stack.push(curr);
                curr = curr.left;

            }
            curr = stack.pop();

            curr = curr.right;

        }
    }

    static void itpostorder(tree root){
        tree curr = root;
        Stack<tree> stack = new Stack<>();

        while (curr!=null||(!stack.isEmpty())){
            while (curr != null){
                System.out.print(curr.key+" ");
                stack.push(curr);
                curr = curr.left;

            }
            curr = stack.pop();

            curr = curr.right;

        }
    }
}