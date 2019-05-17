import java.util.Scanner;

public class AnagramSpecialProgram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a[]=new String[n];
	String cp[]=new String[n];
	sc.nextLine();
	for(int i=0;i<n;i++) {
		a[i]=sc.nextLine();
		cp[i]=a[i];
	}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			 boolean f=true;
			System.out.println(cp[i]);
			System.out.println(cp[j]);
			
			a[i]=removeSpaces(a[i]);
			a[j]=removeSpaces(a[j]);
			
			if(a[i].length()==a[j].length()) {
				
				a[i]=lowerCase(a[i]);
				a[j]=lowerCase(a[i]);

				a[i]=sort(a[i]);
				a[j]=sort(a[j]);
				
				for(int k=0;k<a[i].length();k++) {
					if(a[i].charAt(k)!=a[j].charAt(k)) {
						System.out.println("Not Anagram: "+reverse(cp[i])+" : "+reverse(cp[j]));
						System.out.println();
						f=false;
						break;
					}
					}
				if(f) {
					System.out.println("Anagram    :"+firstUp(cp[i])+" : "+firstUp(cp[j]));
					System.out.println();
				}
			}
			else {
				System.out.println("Not Anagram: "+reverse(cp[i])+" : "+reverse(cp[j]));
				System.out.println();
			}
		}
		}
	}
public static String removeSpaces(String s) {
	String temp="";
	for(int i=0;i<s.length();i++) {
	if(s.charAt(i)!=' ') {
		temp+=s.charAt(i);
	}
   }
	return temp;
}
public static String lowerCase(String s) {
	String temp="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=65&&s.charAt(i)<=90) {
			temp+=(char)(s.charAt(i)+32);
		}
		else {
			temp+=s.charAt(i);
		}
	}
	return temp;
}
public static String sort(String s) {
	String temp="";
	char a[]=s.toCharArray();
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				char t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		temp+=a[i];
	}
	return temp;
}
public static String reverse(String s) {
	String temp="";
	for(int i=s.length()-1;i>=0;i--) {
		temp+=s.charAt(i);
	}
	return temp;
}
public static String firstUp(String s) {
	String temp="";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
			count++;
		}
	}
	String a[]=new String[count+1];
	int j=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			temp+=s.charAt(i);
		}
		else if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
			a[j]=temp;
			j++;
			temp="";
		}
	}
	a[a.length-1]=temp;
	temp="";
	for(int i=0;i<a.length-1;i++) {
		temp+=conv(a[i])+" ";
	}
	temp+=conv(a[a.length-1]);
	return temp;
}
public static String conv(String s) {
	String temp="";
	if(s.charAt(0)>=97&&s.charAt(0)<=122) {
	   temp+=(char)(s.charAt(0)-32);
	}
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)>=65&&s.charAt(i)<=90) {
			temp+=(char)(s.charAt(i)+32);
		}
		else {
			temp+=s.charAt(i);
		}
	}
	return temp;
}
}
