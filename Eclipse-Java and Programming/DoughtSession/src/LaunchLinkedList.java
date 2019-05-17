import java.util.Scanner;
//Node
class Node
{
	int ele;
	Node next;

	Node(int ele)
	{
		this.ele=ele;
		this.next=null;
	}

	Node(int ele, Node next)
	{
		this.ele=ele;
		this.next=next;
	}
}
// creating my linked list
class MyLinkedList
{
	Node start;
	int size;
	Node p;
	//add a element at end
	public void add(int ele) 
	{
		if(start==null)
		{
			start=new Node(ele);
			size++;
		}
		else
		{
			p=start;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=new Node(ele);
			size++;
		}
	}

	//add a element at given index
	public void add(int index, int ele) 
	{
		if(index>=size) 
		{
			System.out.println("IndexOutOfBoundExeption");

		}
		else if(index==0){
			p=start;
			start=new Node(ele,p);
			size++;
		}   
		else 
		{
			p=start;
			for(int i=0;i<index-1;i++) 
			{
				p=p.next;
			}
			p.next=new Node(ele, p.next);
			size++;
		}
	}
	// get size
	public void getSize()
	{
		System.out.println("no of node="+size);
	}

	//remove node
	public void remove(int index)
	{
		if(index>=size) 
		{
			System.out.println("IndexOutOfBoundException");
		}
		else if(index==0)
		{
			start=start.next;
			size--;
		}
		else
		{
			p=start;
			for(int i=0;i<index-1;i++)
			{
				p=p.next;
			}
			p.next=p.next.next;
			size--;
		}

	}

	public void display()
	{
		p=start;
		System.out.println("\n");
		while(p!=null) 
		{
			System.out.print(p.ele+" ");	
			p=p.next;
		}
		System.out.println("\n");
	}
	
	public void reverse() {
		Node prev=null;
		Node current=start;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		start=prev;
	}

}


class LaunchLinkedList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyLinkedList m= new MyLinkedList(); 
		while(true) { 


			System.out.println("1. Add at end");
			System.out.println("2. Add at middle");
			System.out.println("3. Remove");
			System.out.println("4. Size");
			System.out.println("5. Display");
			System.out.println("6. Reverse the LinkedList");
			System.out.println("Enter the choice");


			int choice;
			switch(choice=sc.nextInt()) {
			case 1:
				System.out.println("Enter the ele to be added");
				int a=sc.nextInt();
				m.add(a);
				break;
			case 2:
				System.out.println("enter the index and elemet ");
				int b=sc.nextInt();
				int c=sc.nextInt();
				m.add(b,c);
				break;
			case 3:
				System.out.println("enter node to be removed");
				int d=sc.nextInt();
				m.remove(d);
				break;
			case 4:
				m.getSize();
				break;
			case 5:
				m.display();
				break;
			case 6:
				m.reverse();
				break;
			default:
				System.exit(0);
			}
		}
	}
}
