import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Edit_Distance {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n*2];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.next();
        }
        
         for(int i=0;i<a.length-1;i+=2){
            
            //Finding the Minimum distance between to String
            int t=MinDist(a[i].toLowerCase().toCharArray(), a[i+1].toLowerCase().toCharArray());
            System.out.println(t);
    
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
                }
                else {
                    //Finding the minimum
                    int min=Math.min(temp[i-1][j-1], temp[i-1][j]);
                    min=Math.min(min, temp[i][j-1]);
                    temp[i][j]=min+1;


                }
            }
        }

        for(int i=0;i<temp.length;i++) {
            temp[i][0]=i;
        }
        for(int i=0;i<temp[1].length;i++) {
            temp[0][i]=i;
        }

        return temp[str1.length][str2.length];
    }



}
