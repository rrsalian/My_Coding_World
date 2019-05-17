import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/******************************************************************************************
 
 https://www.hackerrank.com/challenges/electronics-shop/problem
 
 
Input Format

The first line contains three space-separated integers b,n , and m, her budget, the number of keyboard models and the number of USB drive models. 
The second line contains n space-separated integers keyboard[i], the prices of each keyboard model. 
The third line contains m space-separated integers drives, the prices of the USB drives.
 

Sample Input 1:

10 2 3
3 1
5 2 8

Sample Output 1:
9

Explanation 1:
She can buy the 2nd keyboard and the 3rd USB drive for a total cost of 8+1=9 .

Sample Input 2:

5 1 1
4
5

Sample Output 2:
-1

Explanation 2:
There is no way to buy one keyboard and one USB drive because 4+5>5, so we print -1.
 
 
********************************************************************************************/

public class ElectronicShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
                int max=-1;
            for(int i=0;i<keyboards.length;i++){
                for(int j=0;j<drives.length;j++){
                    if(keyboards[i]+drives[j]<=b){
                            max=keyboards[i]+drives[j]>max?keyboards[i]+drives[j]:max;
                    }
                }
            }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
