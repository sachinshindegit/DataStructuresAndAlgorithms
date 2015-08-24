package search;


// This class defines a method for binary search using recursion
public class BinarySearch {
	
	public int recursiveSearch(int[] array, int low, int high, int value){
		if(low > high){							// Note here: its > while in iteration, it is <=
			return -1;
		}
		int mid = (low+high)/2;
		
		if(value > array[mid]){
			low = mid+1;
			return recursiveSearch(array,low, high, value);
		}
		else if(value < array[mid]){
			high = mid-1;
			return recursiveSearch(array, low, high, value);
		}
		else{
			return mid;
		}
	}
	
	public int iterativeSearch(int[] array, int value){
		int low = 0;
		int high = array.length-1;
		int mid = 0;
		while(low<=high){          // Note here: its <= while in recursion, it is >
			mid = (low+high)/2;
			if(array[mid] > value){
				high = mid-1;
			}
			else if(array[mid] < value){
				low = mid+1;
			}
			else{
				return mid;
			}
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] array = {1, 3, 8, 15, 20, 34, 43};
		BinarySearch bs = new BinarySearch();
		
		System.out.println(bs.recursiveSearch(array,0, (array.length-1), 34));
		System.out.println(bs.iterativeSearch(array,34));
	}
	
}
