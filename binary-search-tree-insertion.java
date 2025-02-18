// https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem?isFullScreen=true
// https://programs.programmingoneonone.com/2021/05/hackerrank-binary-search-tree-insertion-solution.html

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
   
    public static void preOrder( Node root ) {
      
        if( root == null)
            return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

public static Node insert(Node root,int value)
{
    if(root == null) {
        root = new Node(value);
    } else if(value < root.data){
        root.left = insert(root.left,value);
    } else if(value > root.data) {
        root.right = insert(root.right,value);
    }
    
    return root;
    
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }   
}