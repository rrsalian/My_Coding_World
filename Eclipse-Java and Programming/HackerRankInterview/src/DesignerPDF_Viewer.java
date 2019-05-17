import java.io.*;
import java.util.*;
/********************************************************************************
 
https://www.hackerrank.com/challenges/designer-pdf-viewer/problem


Sample Input 
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 
9

*********************************************************************************/

public class DesignerPDF_Viewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int high=0;
            for(int i=0;i<word.length();i++){
                int n=word.charAt(i)-97;
                 high=h[n]>high?h[n]:high;
                                }
            return word.length()*high;

    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        for(int i=0;i<h.length;i++) {
        	h[i]=sc.nextInt();
        }
        
        String word=sc.next();
        System.out.println(designerPdfViewer(h,word));
    }
}
