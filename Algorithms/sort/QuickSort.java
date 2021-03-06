package sort;

/**
 * 
 * @author Sachin Shinde
 *
 */


// Best, avg: O(nlog(n))
// worst: O(n^2)

public class QuickSort {

	public void sort(int[] values) {
	    // check for empty or null array
	    if (values ==null || values.length==0){
	      return;
	    }
	    quicksort(values, 0, values.length - 1);
	  }

	  private void quicksort( int[] numbers, int low, int high) {
	    int i = low, j = high;
	    // Get the pivot element from the middle of the list
	    int pivot = numbers[low + (high-low)/2];

	    // Divide into two lists
	    while (i <= j) {
	      // If the current value from the left list is smaller then the pivot
	      // element then get the next element from the left list
	      while (numbers[i] < pivot) {
	        i++;
	      }
	      // If the current value from the right list is larger then the pivot
	      // element then get the next element from the right list
	      while (numbers[j] > pivot) {
	        j--;
	      }

	      // If we have found a values in the left list which is larger then
	      // the pivot element and if we have found a value in the right list
	      // which is smaller then the pivot element then we exchange the
	      // values.
	      // As we are done we can increase i and j
	      if (i <= j) {
	    	  int temp = numbers[i];
	  	    numbers[i] = numbers[j];
	  	    numbers[j] = temp;
	        i++;
	        j--;
	      }
	    }
	    // Recursion
	    if (low < j)
	      quicksort(numbers, low, j);
	    if (i < high)
	      quicksort(numbers, i, high);
	  }

	  
	  public static void main(String[] args){
		  Quicksort q = new Quicksort();
			int arr[] = {2,1,4,3,6,5,2,1,0};
			q.sort(arr);
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			
		}

}
