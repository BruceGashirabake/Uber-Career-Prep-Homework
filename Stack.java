import java.util.List;
import java.util.ArrayList;
public class Stack{
	public int size;
	public ArrayList<Integer> stack;
	public Stack(){
		stack= new ArrayList<Integer>();
	}
	public void push(int numPush){
		stack.add(numPush);
			size++;
		

	}
	public int pop(){
		if (size!=0){
			int temp=stack.get(size-1);
			stack.remove(size-1);
			size--;
			return temp;
		}
		System.out.println("Stack is empty");
		return 0;
	}
	public int top(){
		return stack.get(size-1);
	
	}
	public boolean isEmpty(){
		if (size==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Stack myStack=new Stack();
		myStack.push(4);
		myStack.push(6);
		myStack.push(12);
		myStack.push(0);
		myStack.push(7);
		System.out.println(myStack.isEmpty());



	}

}