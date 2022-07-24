package com.greatlearninglab3.bstreesum;


import java.util.Scanner;

import java.util.*;


public class SumPairBST {
	
static Scanner sc=new Scanner(System.in);
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
			
		}
	}
	public static  Node insert(Node root,int key) {
		
		Node newNode=new Node(key);
		if(root==null) 
			root=newNode;
			
			
			
			
		if(root.data>key)
			root.left=insert(root.left,key);
			
		
		if (root.data < key)
			root.right=insert(root.right,key);
		
		return root;
		
	}
static boolean findpairUtil(Node root, int sum,HashSet<Integer> set){
	if (root == null) {
		return false;
	}
	else {
	
	if (findpairUtil(root.left,sum,set))
		return true;
	}
		
		
	if (set.contains(sum - root.data)) {
		System.out.println("Pair is found ("+ (sum - root.data) + ", "+ root.data + ")");
		return true;
}
else
set.add(root.data);
System.out.println(set);

return findpairUtil(root.right, sum, set);
}

static void findPair(Node root, int sum)
{
    HashSet<Integer> set = new HashSet<Integer>();
    if (!findpairUtil(root, sum, set))
        System.out.print("Pairs do not exit"
                         + "\n");
}
	public void leveByLevel(Node root) {
		Queue<Node> queue1 = new LinkedList<Node>();
		queue1.add(root);
		System.out.println("root value is :"+root.data);
		while (!queue1.isEmpty()) {
			Node tempNode = queue1.poll();
			System.out.print(tempNode.data + " ");

			// enqueue left node
			if (tempNode.left != null) {
				queue1.add(tempNode.left); 
				
			}

			// enqueue right node
			if (tempNode.right != null) {
				queue1.add(tempNode.right);
				
			}
		}
	}
	
	public static void main(String[] args) {
		SumPairBST obj=new SumPairBST();
		Node root=null;
		root=insert(root,5);
		root=insert(root,9);
		root=insert(root,10);
		root=insert(root,14);
		root=insert(root,7);
		
		System.out.println(root.data);
		obj.leveByLevel(root);
		int sum=19;
		findPair(root,sum);
		
		
	}

}
