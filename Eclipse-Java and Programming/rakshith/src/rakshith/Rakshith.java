package rakshith;

import java.util.Arrays;

public class Rakshith {
	public static void main(String[] java) {
		
//		System.out.println("Hello World");
//		String s="Rakshith";
//		String q="Rakshith";
//		String a="RSalian";
//		String b=s+a;
//		String c=s+a;
		
		String ww[]= {"adfa","wer","fadsfsdf","Hrwe"};
		
		//Arrays.sort(ww);
		
		for(int i=0;i<ww.length;i++) {
			for(int j=i;j<ww.length;j++) {
				if(ww[i].charAt(0)>ww[j].charAt(0)) {
					String temp=ww[i];
					ww[i]=ww[j];
					ww[j]=temp;
				}
			}
		}
	
	
		
		for(String i:ww) {
			System.out.println(i);
		}
	}
}
