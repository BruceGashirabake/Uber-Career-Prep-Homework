public class NodePrintInOrder {
	TreeNode root;
	static class TreeNode{
		TreeNode left, right;
		int data;
		TreeNode(int data){
			this.data=data;
		}
		public void print() {
			if (left!=null) {
				left.print();
			}
			System.out.println(data);
			if (right!=null) {
				right.print();
			}
		}
	}

	NodePrintInOrder(TreeNode root){
		this.root=root;
	}
	public static void main(String[] args){
		//Create the actual tree with the nodes.
	}
}

//Separate implementation for different result
//All else is the same except the print method

public void print(){
	System.out.println(data);
	if (left!=null){
		left.print();
	}
	if (right!=null){
		right.print();
	}
}

//third way
public void print(){
	System.out.println(data);
	if (right!=null){
		right.print();
	}
	if (left!=null){
		left.print();
	}
}