package com.greatlearning.bst;
import java.io.*;


class Node
{
	int val;
	Node left, right;
	
	Node(int item)
	{
		val = item;
		left = right = null;
	}
}
class Skewded_BST
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;


	static void flattenBTToSkewed(Node root)
	{
	
		if(root == null)
		{
			return;
		}
	
		
		flattenBTToSkewed(root.left);
		
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		// Condition to check if the root Node
		// of the skewed tree is not defined
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		
	}


	static void RightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		RightSkewed(root.right);	
	}

	public static void main (String[] args)
	{
	
		Skewded_BST tree = new Skewded_BST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.right=new Node(70);
		tree.node.left.left=new Node(2);
		
	

		
		tree.flattenBTToSkewed(node);
		tree.RightSkewed(headNode);
	}
}


