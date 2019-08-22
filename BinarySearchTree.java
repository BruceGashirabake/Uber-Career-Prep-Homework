
public class BinarySearchTree {
	public Node root;
	class Node{
		Node left, right;
		int data;
		Node(int data){
			this.data=data;
		}
		public void insert(int key) {
			
			if (key<=root.data)  {
				if (left!=null){
					left.insert(key);
				}
				else{
					left=new Node(key);
				}
				
			}
			if (key > data){
				if (right!=null){
					right.insert(key);
				}
				else{
					right=new Node(key);
				}
			}
		}

		public boolean find(int key){
			if (key==data){
				return true;
			}
			else if (key<data){
				left.find(key);
			}
			else if (key>data){
				right.find(key);
			}
			return false;
		}
	}
}
