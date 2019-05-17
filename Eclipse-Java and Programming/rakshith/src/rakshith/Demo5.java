package rakshith;

import java.util.concurrent.SynchronousQueue;

class Person   
{  
	
	static{
		aa=9;
		
	}
	
	static final int aa;
	int b=18;
	//aa=8l;
    public Person()  
    {  
    	//aa=0;//Final variable must be initialized inside the constructor
        System.out.println("Person class constructor called");  
    } 
    
    public void show() {
    	System.out.println("hi");
    }
//    public int show() {
//    	return 1;
//    }
}  

class Employee extends Person   
{  
	
    public Employee()   
    {  
    	
        System.out.println("Employee class constructor called");  
    }  
    
    public Employee(int a)   
    {  
    	
    	this();
    	super.show();
        System.out.println("Employee class constructor called");  
    }  
    
    public void print() {
    	System.out.println("Print");
    }
   
   
} 

public class Demo5{
	 public static void main (String args[])  
	    {  
		 final int qq;
			qq=33;
		 
	        Employee e = new Employee(5);  
	    }  
}