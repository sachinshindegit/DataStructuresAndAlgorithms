package dynamicProgramming;

import java.awt.List;
import java.util.Arrays;

public class LongestIncreasingSequence {
	
	
		public static int[] lcs(int[] x) {
		    int size = x.length;
		    int[] lengtArray = new int[size];
		    Arrays.fill(lengtArray, 1);
		    int[] pred = new int[size];
		    Arrays.fill(pred, -1);
		    for (int i = 1; i < size; i++) {
		      for (int j = 0; j < i; j++) {
		        if (x[j] < x[i] && lengtArray[i] < lengtArray[j] + 1) {
		        	lengtArray[i] = lengtArray[j] + 1;
		          pred[i] = j;
		        }
		      }
		    }
		    int k = 0;
		    for (int i = 1; i < size; i++) {
		      if (lengtArray[k] < lengtArray[i]) {
		        k = i;
		      }
		    }
		    int t = lengtArray[k];
		    int[] res = new int[t];
		    for (int i = k; i != -1; i = pred[i]) {
		      res[--t] = x[i];
		    }
		    return res;
		  }

		  // Usage example
		  public static void main(String[] args) {
		    int[] a = { 2, 5, 4, 1, 3, 7, 6 };
		    int[] lis = lcs(a);
		    System.out.println(Arrays.toString(lis));
		  }
}
