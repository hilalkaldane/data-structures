package nonlinear;

public class Tree<T> {
	Node<T> root;

	class Node<T> implements Comparable<T> {
		T data;
		Node<T> left;
		Node<T> right;

		Node(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		@Override
		public int compareTo(T o) {
			if (o instanceof Integer) {
				if ((Integer) this.data <= (Integer) o) {
					return 1;
				}
				else {
					return 0;
				}
			}
			return 1;
		}
	}

	public void add(T data) {
		if (root == null) {
			root = new Node(data);
		}
		else {
			add(root, data);
		}

	}

	private void add(Node<T> root, T data) {
		if (root.compareTo(data) == 0) {
			if (root.left != null) {
				add(root.left, data);
			}
			else
			{
				root.left=new Node<>(data);
			}
		}
		else {
			if (root.right != null) {
				add(root.right, data);
			}
			else
			{
				root.right=new Node<>(data);
			}
		}
	}

	public void inorderTraversal(Node root)
	{//23,10,50,20,97,32,109,32,241,321,45,1
		if(root==null)
		{
			return;
		}
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);

	}
	public void forEach()
	{
		if(root==null)
		{
			return;
		}
		else
		{
			inorderTraversal(root);
		}
	}
}