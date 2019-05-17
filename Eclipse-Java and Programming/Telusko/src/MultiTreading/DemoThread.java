package MultiTreading;


class Hi extends Thread{

	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Hi");
				//Thread.sleep(100);
			}
		}
		catch(Exception e) {

		}
	}

}

class Hello extends Thread{
	public void run() {

		try {
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
				Thread.sleep(100);
			}
		}
		catch(Exception e) {

		}
	}
}

public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Hello();
		Thread t2=new Hi();
		t1.start();
		t2.start();
		System.out.println("afadfasf");
		for(int i=0;i<5;i++) {
			System.out.println("**************");
		}
		
		System.out.println("##############################");



	}

}
