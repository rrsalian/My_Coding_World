
public class QueueImplimentaion {
	int queue[];
	int len;
	int size;
	int front;
	int rear;
	QueueImplimentaion(int n){
		queue=new int[n];
		size=n;
		front=-1;
		rear=-1;
		len=0;
	}
	public int getSize() {
		return len;
	}
	public boolean isEmpty() {
		return front==-1;
	}
	public boolean isFull() {
		return (rear==size-1&&front==0);
	}
	public int peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("underflow Exception");
		}
		else {
			return queue[front];
		}
	}
	public void insert(int ele) {
		if(rear==-1) {
			front=0;
			rear=0;
			queue[rear]=ele;
			len++;
		}
		else if(rear>=size-1) {
			throw new IndexOutOfBoundsException("OverFlow Exception");
		}
		else {
			queue[++rear]=ele;
			len++;
		}
	}
	public int remove() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("UnderFlow Exception");
		}
		else {
			len--;
			int ele =queue[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
			}
			return ele;
		}
	}
	public void display() {
		if(len==0) {
			System.out.println("Empty....");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println(queue[i]);
			}
		}
	}
	public static void main(String[] args) {
		QueueImplimentaion q=new QueueImplimentaion(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.display();
		System.out.println("*******************************");
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		System.out.println("Size "+q.getSize());
		System.out.println("*******************************");
		q.display();

	}
}
