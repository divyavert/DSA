//package com.company.DataStructure.LLImplementation;
//
//public class ll2 {
// // with node it has these three variable
//    private node head;
//    private node tail;
//    private int size;
//
//// so this linkedlist contain a node which has a value and next node pointer (not c pointer)
//    class node {
//        int val ;
//       private node next;
//
//       public node(){
//
//       }
//
//       public node(int val) {
//           this.val = val;
//       }
//
//       public node(int val, node next) {
//           this.val = val;
//           this.next = next;
//       }
//   }
//
//// now to add new element
//    void addFirst (int val){
//       node temp = new node(val);
//       temp.next = head;
//       head =  temp;
//       if(tail== null) {
//           tail = head;
//       }
//
//       size++;
//
//    }
//
//    // to display create temp vairable which is euqal to head and then do temp = temp.next
//    void dispaly (){
//       node temp = head;
//       while (temp !=null){
//           System.out.print(temp.val+" -> ");
//
//           temp = temp.next;
//       }
//        System.out.println("End");
//    }
//// adding element to last without head
//void addLast (int val){
//    node add = new node(val);
//    node temp = head;
//       if(temp== null){
//          this.addFirst(val);
//       }else {
//           while (temp.next!=null){
//               temp = temp.next;
//           }
//
//           temp.next = add;
//           tail = add;
//           size++;
//       }
//
//
//
//    }
//
// // adding element to given index
// void addAtIndex(int val, int index){
//       node div = new node(val);
//       node temp = head;
//
//       if(index == 0){
//           addFirst(val);
//       }else if(index == size){
//           addLast(val);
//     }else {
//           for (int i = 0; i <index-1 ; i++) {
//               temp = temp.next;
//           }
//
//           div.next = temp.next;
//           temp.next= div;
//
//       }
// }
//// delete first just move head
//   int deleteFirst(){
//       int val = head.val;
//       head = head.next;
//       return val;
//   }
//
//   // to delete last index find last second index and make it tail and point it to null
//   int deleteLast(){
//       int val = tail.val;
//       if(size<=1){
//          return deleteFirst();
//
//       }
//       node sceondLastNode = getindex(size-2);
//
//       tail = sceondLastNode;
//       sceondLastNode.next = null;
//       return val;
//   }
//
//   int deleteIndex(int index){
//       if(index==0){
//           return deleteFirst();
//       }
//       if (index==size-1){
//           return deleteLast();
//       }
//       node previous = getindex(index-1);
//       node nodeAtIndex = getindex(index);
//       int val = nodeAtIndex.val;
//       previous.next = nodeAtIndex.next;
//       return val;
//
//
//   }
//    node getHead(){
//       return head;
//    }
//    private node getindex(int index) {
//        node temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//
//        }
//
//        return temp;
//    }
//    // Q1 insertion using recursion
//    // see if the current is index-1 if yes add new node else call for next node
//    // and see head and tail edge case
//    void insertRE(int val,int index){
//       insertRE(val,index,head,0);
//    }
//
//    void insertRE (int val,int index, node currentNode,int current){
//        if(index == 0){
//            addFirst(val);
//            return;
//        }
//       if(index-1==current){
//
//           node addd = new node(val);
//           addd.next=currentNode.next;
//           currentNode.next=addd;
//           if(addd.next==null){
//               tail=addd;
//           }
//
//           return;
//
//       }
//
//       insertRE(val,index,currentNode.next,current+1);
//    }
//    //Q2 delete duplicate
//    void deleteDuplicate(){
//       node temp = head;
//
//       while (temp!=null||temp.next!=null){
//           if(temp.next.val==temp.val){
//               temp.next=temp.next.next;
//           }
//
//           temp = temp.next;
//           if(temp==null){
//               break;
//           }
//       }
//    }
//// Q3 duplicate remove
//    void deleteduplicate(){
//        node temp = head;
//        node temp2 = head.next;
//        while(temp2!=null){
//            if(temp.val==temp2.val){
//                temp.next=temp2.next;
//                temp2 = temp2.next;
//
//            }else{
//                temp=temp.next;
//            }
//        }
//
//    }
////Q4 merge two sorted list this was my approch but use dummy approch ( see leet code )
//    node mergeTwoSortedList(node node1,node node2){
//        node fode = new node(-101);
//        node fhead = new node(-101);//
//        node temp1 = node1;
//        node temp2 = node2;
//
//
//        while (temp1.next!=null&&temp2.next!=null){
//            if(temp1.val<= temp2.val){
//                if(fode.val==-101){
//                    fode=temp1;
//                    fhead=fode; //
//                }else {
//                    fode.next=temp1;
//                    fode=fode.next;
//                }
//                temp1=temp1.next;
//            }else {
//                if(fode.val==-101){
//                    fode=temp2;
//                }else {
//                    fode.next=temp2;
//                    fode=fode.next;
//                }
//
//                temp2= temp2.next;
//            }
//        }
//
//        while (temp2.next!=null){
//            fode.next= temp2;
//            temp2=temp2.next;
//        }
//
//        while (temp1.next!=null){
//            fode.next=temp1;
//            temp1=temp1.next;
//
//        }
//
//        return fhead;//
//
//    }
//
//
// // q6 find start of the cycle
// public boolean detectCycle(ListNode head) {
//     ListNode  fast = head;
//     ListNode slow = head;
//     int lenght = 0;
//     while(fast!=null&&fast.next!=null){
//         fast = fast.next.next;
//         slow = slow.next;
//         if(slow==fast){
//             lenght = findLenght(slow);
//             break;
//         }
//
//     }
//     ListNode s = head;
//     ListNode f= head;
//     for (int i = 0; i < lenght; i++) {
//         s = s.next;
//     }
//
//     while (f!=s){
//         f=f.next;
//         s=s.next;
//     }
//     return s;
// }
//
//    int findLenght(ListNode slow) {
//     ListNode  fast = slow;
//    int count = 0;
//    do{
//        slow = slow.next;
//        count ++;
//    }while (slow==fast);
//     return count;
//
//    }
//
//
// // q7 happy number it's not a linked list problem but two pointer proble which use concept of cycle detection
// // at first i was thinking of making a link for each which was not needed
// public boolean isHappy(int n) {
//int slow = n ;
//int fast =  n;
//do{
//    slow = sumofsquare(slow);
//    fast = sumofsquare(sumofsquare(fast));
//} while (slow!=fast);
//if(slow==1){
//    return true;
//
//}else {
//    return flase;
//}
// }
//
//    int sumofsquare(int slow) {
//        int sum = 0;
//        while (slow>0){
//            int rem = slow%10;
//            sum += rem*rem;
//            slow /= 10;
//        }
//        return sum;
//
//    }
//
// // bubble sort on linked list
// void bubbleSort(int row , int col){
//        if(row==0){
//            return;
//        }
//        if (row>col){
//            node first = getNoode(col);
//            node second = getNode(col+1);
//            if(first.val> second.val){
//                if(first== head){  // case 1
//                    first.next=second.next;
//                    second.next=first;
//                    head= second;
//                }else if (second==tail){ // case 2
//                    node prev = getNode(col-1);
//                    first.next= null;
//                    second.next=first;
//                    prev.next= second;
//                    tail=first;
//
//                }else {// case 3
//                    node prev = getNode(col-1);
//                    first.next=second.next;
//                    second.next=first;
//                    prev.next= second;
//                }
//                for (int i = 0; i < ; i++) {
//
//                }
//
//            }
//
//            bubbleSort(row,col+1);
//
//        }else{
//            bubbleSort(row-1,0);
//        }
//    }
//}
