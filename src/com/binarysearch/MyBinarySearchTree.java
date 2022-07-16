package com.binarysearch;

	public class MyBinarySearchTree<T extends Comparable<T>> {
		static MyBinaryNode root;

		
		public void add(T data) {
			this.root = insertElementRecursive(root, data);
		}

		
		public MyBinaryNode<T> insertElementRecursive(MyBinaryNode<T> root, T data) {
			if (root == null) {
				root = new MyBinaryNode(data);
				return root;
			}

			if (data.compareTo(root.data) < 0) { 
				root.left = insertElementRecursive(root.left, data);
			} else if (data.compareTo(root.data) > 0) { 
				root.right = insertElementRecursive(root.right, data);
			}
			return root;
		}

		
		public void preOrderTraversal(MyBinaryNode<T> node) {
			if (node == null) {
				return;
			}
			System.out.print(node.data + "  ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}

		
		public void inOrderTraversal(MyBinaryNode<T> node) {
			if (node == null) {
				return;
			}
			inOrderTraversal(node.left);
			System.out.print(node.data + "  ");
			inOrderTraversal(node.right);
		}

		
		public void postOrderTraversal(MyBinaryNode<T> node) {
			if (node == null) {
				return;
			}
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.data + "  ");
		}
		
		
		public int size() {
			return this.getSizeRecursive(root);
		}
		
		public int getSizeRecursive(MyBinaryNode<T> root) {
			
			return (root == null) ? 0 : this.getSizeRecursive(root.left) + 1 + this.getSizeRecursive(root.right); 
		}
		
		
		
		public static void main(String[] args) {
			System.out.println(" Welcome to Binary Search Tree ");

			
			MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<Integer>();

			bst.add(56);
			bst.add(30);
			bst.add(70);
			bst.add(22);		 
			bst.add(40);          
			bst.add(11);
			bst.add(3);
			bst.add(16);
			bst.add(60);
			bst.add(95);
			bst.add(63);
			bst.add(65);
			bst.add(67);

		System.out.print(" Ordered Binary tree ");
			bst.preOrderTraversal(root);              

			
			System.out.println("\n\nSize of the Binary-Search-Tree :- " + bst.size());

}
}