import java.util.*;

class Stack{
	int a[];
	int top;
	int size;
	int len;
	Stack(int n) {
		a=new int[n];
		size=n;
		len=0;
		top=-1;
	}
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==size-1;
	}
	int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("UnderFlow Exception");
		}
		else {
			return a[top];
		}
	}
	void push(int ele) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("OverFlow Exception");
		}
		else {
			a[++top]=ele;
			len++;
		}
	}
	int pop() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("UnderFlow Exception");
		}
		else {
			len--;
			return a[top--];
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Empty");
		}
		else {
			for(int i=0;i<len;i++) {
				System.out.println(a[i]);
			}
		}
	}
	int gerSize() {
		return len;
	}
}
 class StackImplimentaion {
       public static void main(String args[]) {
    	   Stack s=new Stack(10);
    	   try {
    	   s.push(10);
    	   s.push(20);
    	   s.push(30);
    	   s.display();
    	   s.pop();
    	   s.display();
    	   }
    	   catch (Exception e) {
    		   System.out.println(e.getMessage());
    	   }
    	   
       }
}
