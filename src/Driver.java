class LinkedStack{
	class Node {
		int data;
		Node next;
		Node(int value){
			data = value;
		}
	}
	private Node top;
	private int x;
	public LinkedStack() {
		top = null;
		x=0;
	}
	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
		x++;
	}
	public int size() {
		return x;
	}
	public int pop() {
		if(x==0) {
			return -999;
		}
		int data = top.data;
		top = top.next;
		x--;
		return data;
	}
}

class ArrayStack{
	private int[] array;
	private int x, max;
	
	public ArrayStack(int capacity) {
		max = capacity; 
		x = 0;
		array = new int [capacity];	
		}
	public int size() {
		return x;
	}
	
	public void push (int value) {
		if (x==max) {
			System.out.println("Full Stack");
		}
		else {
			array[x]= value;
			x++;
		}
	}
	public int pop() {
		int data = -999;
		if (x==0) {
			System.out.println("Full Stack");
		}
		else {
			data = array[ x-1];
			x--;
		}
		return data;
	}

}


public class Driver {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(1);
        stack.push(7);
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(2);

        LinkedStack stack1 = new LinkedStack();
        stack1.push(1);
        stack1.push(7);
        stack1.push(3);
        stack1.push(4);
        stack1.push(9);
        stack1.push(2);

        while (stack.size() != 0) {
            System.out.println(stack.pop());
        }
        System.out.println();

        while (stack1.size() != 0) {
            System.out.println(stack1.pop());
        }
        System.out.println();

    }
}