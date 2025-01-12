package org.letsupgrade.tree;

public class BinaryTree {
	Node root;
	public BinaryTree() {
		this.root=null;
	}
	void inorder(Node node) {
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	void preorder(Node node) {
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	void postorder(Node node) {
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
}
