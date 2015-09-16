package sortingSearchingQuestions;

import java.lang.reflect.Member;

public class ElevenOne {
	
	// This function mergers two arrays B into A
	public static int[] merge(int[]a, int[]b, int lengthA, int lengthB){
		int indexA = lengthA-1;
		int indexB = lengthB-1;
		int mergedIndex = a.length-1;
		
		while(indexA >=0 && indexB >=0){
			if(a[indexA] >= b[indexB]){
				a[mergedIndex] = a[indexA] ;
				mergedIndex--;
				indexA--;
			}else{
				a[mergedIndex] = b[indexB];
				mergedIndex--;
				indexB--;
			}
		}
		
		while(indexB >= 0){
			a[mergedIndex] = b[indexB];
			mergedIndex--;
			indexB--;
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a = new int[10];
		int[] b = new int[4];
		
		a[0] = 2;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		a[5] = 9;
		
		b[0] = 0;
		b[1] = 1;
		b[2] = 3;
		b[3] = 4;
		
		a = merge(a, b,6,4);
		
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		
		
	}
}
