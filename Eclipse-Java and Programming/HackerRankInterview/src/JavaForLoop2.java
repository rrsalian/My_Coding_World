import java.util.*;

class JavaForLoop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int arr[][]=new int[t][];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            arr[i]=new int[n];
            for(int j=0;j<n;j++){
                sum+=b*(2^j);
                arr[i][j]=sum;
            }
        }
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}

