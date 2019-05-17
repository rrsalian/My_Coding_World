import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianMode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        
        double b[]=find(a);
            System.out.println(b[0]);
            System.out.println(b[1]);
            System.out.println((int)b[2]);
    }
    public static double[] find(int a[]) {
        double result []=new double [3];
        double sum=0;
        //Find the sum
        for(int i=0;i<a.length;i++) {
            sum+=(double)a[i];
        }
        //find the Mean
        double Mean=sum/(double)a.length;
        result[0]=Mean;
        
        //Median
        Arrays.sort(a);
        double Median=a.length%2!=0?a[(a.length/2)]:((a[a.length/2]+a[(a.length/2)-1])/(double)2);
        result[1]=Median;
        
        //Mode  
        int Mode=a[0];
        int Count=0;
        int n=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                n++;
            }
            else{
                n=0;
            }
            if(n>Count){
                Count=n;
                Mode=a[i];
            }


        }
        result[2]=(double)Mode;
        
        
        
        return result;
    }

}
