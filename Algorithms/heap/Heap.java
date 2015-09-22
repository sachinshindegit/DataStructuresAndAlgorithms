package heap;


/**
 * 
 * @author Sachin Shinde
 *
 */

// This class implements heap

public class Heap {
	int heapSize=0;
	
	public Heap(int heapSize){
		this.heapSize = heapSize;
	}
	
	public void maxHeapify(int[] a, int i){
		int left = 2*i + 1;
		int right = 2*i + 2;
		int largest=0;
		if(this.heapSize==0){
			this.heapSize = a.length;
		}
		if(left <= this.heapSize-1 && a[left] > a[i]){
			largest = left;
		}
		else{
			largest = i;
		}
		
		if(right <= this.heapSize-1 && a[right] > a[largest]){
			largest = right;
		}
		
		if(largest != i){
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a,largest);
		}
		
	}
	
	// function to implement max heap
	public int[] buildMaxHeap(int[] a){
		for(int i = a.length/2; i >=0; i--){
			maxHeapify(a, i);
		}
		return a;
	}
	
	// to extract max value
	
	public int heapExtractMax(int[] a){
		if(a.length < 0){
			return 0;
		}
		int max = a[0];
		a[0] = a[a.length-1];
		maxHeapify(a, 0);
		return max;
	}
	
	// heap sort
	public int[] heapSort(int[] a){
		a = buildMaxHeap(a);
		
		for(int i=a.length-1;i>0;i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			this.heapSize = i;
			maxHeapify(a, 0);
		}
		return a;
	}
	
	public void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
	public static void main(String[] args){
		System.out.println("Before sort: ");
		int[] a = {5,0,1,2,7,3,4,6,9,8};
		
		Heap h = new Heap(a.length);
		h.printArray(a);
		System.out.println();
		a = h.heapSort(a);
		
		System.out.println("\nAfter sort: ");
		h.printArray(a);
		
	}
	
	
}
