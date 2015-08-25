package sort;

/**
 * 
 * @author Sachin Shinde
 *
 */

//This sort is better than selection sort since less comparisons are made
// Best: O(n)
// avg, worst: O(n^2)
public class InsertionSort {

	public int[] sort(int[] arr){
		int value=0;
		int hole=0;
		
		for(int i=1;i<arr.length;i++){
			value = arr[i];
			hole = i;
			
			while((hole > 0) && (arr[hole-1] > value)){
				arr[hole] = arr[hole-1];
				hole = hole-1;
			}
			arr[hole] = value;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 5, 3, 6};
		InsertionSort insertionSort = new InsertionSort();
		arr = insertionSort.sort(arr);
		// print the array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
