class Node {
	private Integer value = null;
	private Node left;
	private Node right;
	
	Node(Integer value) {
		this.value = value;
	}
		
	Integer getValue() {
		return value;
	}
	
	Node getLeft() {
		return left;
	}
	
	Node getRight() {
		return right;
	}
	
	Integer getValueLeft() {
		if (this.left == null) {
			return null;
		} else {
			return left.getValue();
		}
		
	}
	
	Integer getValueRight() {
		if (this.right == null) {
			return null;
		} else {
			return right.getValue();
		}
	}
	
	void addNode(Node n) {
		if (n.getValue() < this.value) {
			if (this.left == null) 
				{
					this.left = n;
				} else 
				{
					this.left.addNode(n);
				}
		} else 
			if (n.getValue() > this.getValue()) 
			{
				if (this.right == null) 
				{
					this.right = n;
				} 
			else 
			{
				this.right.addNode(n);
			}
			
		}
	}
	
	void visitNodes() {
		if (this.left != null) {
			this.left.visitNodes();
		}
		System.out.println(this.value);
		if (this.right != null) {
			this.right.visitNodes();
		}
		
	}
	
	boolean dfs(Integer n) {
		if (this.value == n) {
			return true;
		} else if (n < this.value && this.left != null) {
			 return this.left.dfs(n);
		} else if (n > this.value && this.right != null) {
			return this.right.dfs(n);
		}
		return false;
	}
}

class Tree {
	private Node root = null;
	
	void addValue(Integer value) {
		Node n = new Node(value);
		if (this.root == null) {
			this.root = n;
		} else {
			root.addNode(n);
		}
	}
	
	Node getRoot() {
		return root;
	}
	
	void traverse() {
		this.root.visitNodes();
	}
	
	boolean inTree(Integer value) {
		return this.root.dfs(value);
	}
	
	
}

public class BinarySearchTree {
	static Tree t = new Tree();
	
	public static void main(String[] args) {
		
		t.addValue(3);
		t.addValue(4);
		t.addValue(1);
		
		System.out.println(t.inTree(5));
	}
}