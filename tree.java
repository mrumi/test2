import java.util.*;

public class tree{
	int[]arr;
	static int size = 50;
	public static void main(String[] args){	
		tree tr = new tree();
		int [] arr = {5,4,3,8,9,10,24,35,27,11};
		tr.build_tree(arr);
	}
		
	public void build_tree(int[]arr){
		Node root = null;
		for(int i = 0; i < arr.length; i++){
			int x = arr[i];
			Node nd = new Node(arr[i]);
			root = insert(root, nd);
		}
	}
	
	public Node insert(Node root, Node node){
		if(root == null){
			root = node;
			return root;
		}
		return root;
	}
	
	public Node search(int data, Node root){
		if(root==null || root.data == data)
			return root;
		if(data < root.data)
			return search(data, root.left);
		else
			return search(data, root.right);
		
	}
	
	public Node iterative_search(int data, Node root){
		if(root==null || root.data == data)
			return root;
		Node temp = root;
		while(root != null && data != temp.data){
			if(data < temp.data)
				temp = temp.left;
			else
				temp = temp.right;
		}
		return temp;		
	}
	
	public Node minimum(Node root){
		if(root==null)
			return root;
		Node temp = root;
		while(temp.left != null){
			temp = temp.left;
		}
		return temp;
	}
	
	public Node maximum(Node root){
		if(root==null)
			return root;
		Node temp = root;
		while(temp.right != null){
			temp = temp.right;
		}
		return temp;
	}
	
	public Node successor(Node node){
		//if(node)
		return node;
	}
	public void print(){		
		for(int i = 0; i < this.arr.length; i++){
			System.out.print(this.arr[i]+" ");
		}	
		System.out.println();
	}
}
