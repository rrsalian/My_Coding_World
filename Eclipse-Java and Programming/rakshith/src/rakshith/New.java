package rakshith;

public class New {
	static int ar[][]= new int[4][4];
	public static void main(String[] args) {

		System.out.println(slou(3,3));
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	//Recursion

//	public static int slou(int i,int j) {
//		k++;
//		if (i==0&&j==0) {
//			return 0;
//		}
//		else if(i==0 || j==0) {
//			return 1;
//		}
//		else {
//			return slou(i-1,j)+slou(i,j-1);
//		}
//	}
	
	
	// Dynamic Recursion
//	public static int slou(int i,int j) {
//		if(ar[i][j]!=0) {
//			return ar[i][j];
//		}
//		if (i==0&&j==0) {
//			return 0;
//		}
//		else if(i==0 || j==0) {
//			return 1;
//		}
//		else {
//			ar[i][j]= slou(i-1,j)+slou(i,j-1);
//		}
//		
//		System.out.println(i+"  "+j+" "+ ar[2][2]);
//		return ar[i][j];
//	}
	
	
	//Dynamic
	public static int slou(int m,int n) {
	
		for(int i=1;i<=m;i++) {
			 ar[i][0]=1;
		}
		for(int i=1;i<=n;i++) {
			ar[0][i]=1;
		}
		
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				ar[i][j]=ar[i-1][j]+ar[i][j-1];
				//System.out.println(i+" "+j);
			}
		}
		
		return ar[m][n];
	}
}

