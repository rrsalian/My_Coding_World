import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fuzzy_Minimum_Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <String> a=new ArrayList<>(Arrays.asList(
				"Rakshith",
				"Rahul",
				"Hardik",
				"Ramanujan",
				"Rohith",
				"deepanshu",
				"depanshu",
				"dipanshu"
				));
		System.out.println("Enter a name");
		String s2=sc.next();
		
		System.out.println("\nMatching Name\n");
		for(int i=0;i<a.size();i++) {
			String s1=a.get(i);
			
			//Finding the Minimum distance between to String
			int t=MinDist(s1.toLowerCase().toCharArray(), s2.toLowerCase().toCharArray());
			if(t<=3) {
				//System.out.println(t);
				System.out.println(a.get(i));
			}

		}
	}

	public static int MinDist(char str1[],char str2[]) {

		int temp[][]=new int[str1.length+1][str2.length+1];

		//appending index
		for(int i=0;i<temp.length;i++) {
			temp[i][0]=i;
		}
		for(int i=0;i<temp[1].length;i++) {
			temp[0][i]=i;
		}
		for(int i=1;i<temp.length;i++) {
			for(int j=1;j<temp[i].length;j++) {
				if(str1[i-1]==str2[j-1]) {
					temp[i][j]=temp[i-1][j-1];
					//System.out.println(i+"*"+j+" "+temp[i][j]);
				}
				else {
					//Finding the minimum
					int min=Math.min(temp[i-1][j-1], temp[i-1][j]);
					min=Math.min(min, temp[i][j-1]);
					temp[i][j]=min+1;
					//System.out.println(temp[i][j]+" "+ temp[i-1][j]+" "+temp[i][j-1]+" Minumum="+min );
					//System.out.println(i+"*"+j+" "+temp[i][j]);;

				}
			}
		}

		for(int i=0;i<temp.length;i++) {
			temp[i][0]=i;
		}
		for(int i=0;i<temp[1].length;i++) {
			temp[0][i]=i;
		}

		///////////////////////////////////////////////////


		//		for(int i=0;i<temp.length;i++) {
		//			for(int j=0;j<temp[i].length;j++) {
		//				System.out.print(temp[i][j]+" ");
		//			}
		//			System.out.println();
		//		}


		/////////////////////////////////////////////////	

		//System.out.println(temp[str1.length][str2.length]);
		return temp[str1.length][str2.length];
	}



}
