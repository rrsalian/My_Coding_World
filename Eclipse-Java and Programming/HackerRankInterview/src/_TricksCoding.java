
import java.util.*;

public class _TricksCoding {

	public static void main(String[] args) {
//************************************************************************************************		
//To Convert Integer to String
		
		String s=Integer.toString(123);
		System.out.println(s);
		
		//or
		
		String s1=String.valueOf(1234);
		System.out.println(s1);
		
		
//****************************************************************************************************
//TO convert String to Integer
		
		int a=Integer.parseInt("12345");
		System.out.println(a);
		
//***************************************************************************************************
//To Sort a array		
		int b[]= {5,6,1,9,0,4,3,6};
		Arrays.sort(b);
		for(int i :b) {System.out.print(i+" ");}
		System.out.println();
//************************************************************************************************
		//String to Upper or LowerCase
		String r="RakshithRSalian";
		System.out.println(r.toUpperCase());
		System.out.println(r.toLowerCase());
		
		//Reverse a String
		String rev=new StringBuilder(r).reverse().toString();
		System.out.println(rev);
		
		
		//Remove Spaces
		String q="This is for Remove Space from a String ";
		String w=q.replaceAll(" ", "");
		System.out.println(w);
		
		//Remove the space from start and end of string
		String s2="  this is a String  ";
		System.out.println(s2.trim());
		
		//Remove Duplicate from String
		String s5="abacdasdebasdfasdfadfaadf";
		Set<Character> se=new HashSet<>();
		for(char i:s5.toCharArray()) {
			se.add(i);
		}
		s5=se.toString();
		System.out.println(s5);
		
//************************************************************************************************
//To convert String to String type array
		String s3="This is for String to StringArray convertion";
		String s4[]=s3.split(" ");
		for(String i :s4) {
			System.out.print(i+" ");
		}
		
		System.out.println();

//************************************************************************************************
//To convert char to int
		
		int c=Character.getNumericValue('2');
		System.out.println(c);
//*********************************************************************************************
		

	}

}
