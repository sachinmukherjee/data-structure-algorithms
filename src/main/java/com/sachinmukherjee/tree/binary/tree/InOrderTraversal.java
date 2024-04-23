package com.sachinmukherjee.tree.binary.tree;

import com.sachinmukherjee.tree.binary.Node;

import java.util.Stack;

/*
InOrder Iterative Traversal
 */
public class InOrderTraversal {


    public void traverse(Node root){
        Stack<Node> stack = new Stack<>();

        if(null == root)
            return;

        Node current = root;

        while(null != current){
            stack.push(current);
           current = current.left;
        }
         current = stack.pop();
    System.out.println(current.data);
    }
}
