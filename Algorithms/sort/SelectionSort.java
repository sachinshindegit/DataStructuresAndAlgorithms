package sort;

/**
 * 
 * @author Sachin Shinde
 *
 */
// This class implements selection sort
// Complexity: 
// Worst, avg, best: O(n^2)

// Select the smallest element and place it in the left most position
public class SelectionSort {

	public int[] sort(int[] arr){
		int min;
		int temp;
		for(int i=0;i<arr.length-1;i++){
			 min = i;
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return  arr;
	}
	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 5, 3};
		SelectionSort selectionSort = new SelectionSort();
		arr = selectionSort.sort(arr);
		// print the array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
