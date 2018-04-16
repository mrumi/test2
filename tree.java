import java.util.*;
public class tree{
	int[]arr;
	static int size = 50;
	public static void main(String [] args){	
		tree tr = new tree();		
		
	}
		
	public void build_tree(){
		
		
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
		while(root != null && data != temp.key){
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
		return temp
	}
	
	public Node maximum(Node root){
		if(root==null)
			return root;
		Node temp = root;
		while(temp.right != null){
			temp = temp.right;
		}
		return temp
	}
	
	public Node successor(N0de node){
		if(node)
	}
	public void print(){		
		for(int i = 0; i < this.arr.length; i++){
			System.out.print(this.arr[i]+" ");
		}	
		System.out.println();
	}
}

class Node {
    int data;
    Node left;
    Node right;
	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}