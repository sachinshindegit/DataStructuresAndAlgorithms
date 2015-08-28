package sort;

/**
 * 
 * @author Sachin Shinde
 *
 */


// Best, avg: O(nlog(n))
// worst: O(n^2)

public class QuickSort {

	public int partition(int[] arr, int left, int right){
		int i=left;
		int j=right;
		int temp = 0;
		int pivot = arr[(i+j)/2];
		while(i<=j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if (i <= j) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
			}	
		}
		return i;
		
	}
	
	public void sort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		if(left < index-1){
			sort(arr,left,index-1);
		}
		if(right > index){
			sort(arr,index,right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 5, 3, 6};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr,0,arr.length-1);
		// print the array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
