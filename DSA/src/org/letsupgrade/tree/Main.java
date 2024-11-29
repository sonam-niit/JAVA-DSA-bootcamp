package org.letsupgrade.tree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree tree= new BinaryTree();
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);
		tree.root.right.left= new Node(6);
		tree.root.right.right= new Node(7);
		System.out.println("InOrder Traversal started");
		tree.inorder(tree.root);
		System.out.println("InOrder Traversal Completed");
		System.out.println("PreOrder Traversal started");
		tree.preorder(tree.root);
		System.out.println("PreOrder Traversal Completed");
		System.out.println("PostOrder Traversal started");
		tree.postorder(tree.root);
		System.out.println("PostOrder Traversal Completed");
	}
}
