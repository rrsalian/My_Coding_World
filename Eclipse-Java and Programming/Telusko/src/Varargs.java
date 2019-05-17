
class Demo{
	public int add(int ...n) //{1,2,3,4,5,6,77}//Variable Length Arguments
	{ 
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		return sum;
	}
}




public class Varargs {//Variable Arguments

	public static void main(String[] args) {
		
		Demo d=new Demo();
		System.out.println(d.add(1,2,3,4,5,6,77));
		
	}

	
}


