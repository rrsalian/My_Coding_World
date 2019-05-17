import java.util.Scanner;

public class Kangaroo {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] a=s.split(" ");
    int x1=Integer.parseInt(a[0]);
    int v1=Integer.parseInt(a[1]);
    int x2=Integer.parseInt(a[2]);
    int v2=Integer.parseInt(a[3]);
    //System.out.println(x1 +" "+v1+" "+x2+" "+v2);
    int k1 = x1;
    int k2 = x2;
    if(x2>x1&&v2>v1){
        System.out.print("NO");
    }
    else{
        for(int i=0;i<1000;i++){
            k1+=v1;
            k2+=v2;
            if(k1==k2){
                System.out.print("YES");
                System.exit(0);
            }
        }
        System.out.print("NO");
    }
    sc.close();
 }
}
