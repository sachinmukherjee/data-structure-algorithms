package com.sachinmukherjee.tree.binary.tree;

import com.sachinmukherjee.tree.binary.Node;

import java.util.Stack;

/*
Iterative Method
PreOrderTraversal
Root Left Right
 */
public class PreOrderTraversal {


    public void traverse(Node root){
        Stack<Node> stack = new Stack<>();

        if(null == root){
            return;
        }

        stack.push(root);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            System.out.println(current.data);

            if(null != current.right){
                stack.push(current.right);
            }

            if(null != current.left){
                stack.push(current.left);
            }
        }

    }
}
