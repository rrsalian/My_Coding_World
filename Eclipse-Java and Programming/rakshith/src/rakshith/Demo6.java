package rakshith;

class Base   
{  
    protected final void getInfo()  
    {  
        System.out.println("method of Base class");  
    }  
}  
   
public class Demo6 extends Base  
{  
//    protected final void getInfo()  
//    {  
//        System.out.println("method of Derived class");  
//    }  
    public static void main(String[] args)  
    {  
        Base obj = new Base();  
        obj.getInfo();  
    }  
}  
