package sort;

/**
 * 
 * @author Sachin Shinde
 *
 */
//Best: O(n)
//avg, worst: O(n^2)
public class BubbleSort {
	int count = 0;
	public int[] sort(int[] arr){
		int temp = 0;
		
		for(int i=1;i<arr.length;i++){
			boolean flag=false;		// To avoid repeated comparisons
			for(int j=0;j<arr.length-1;j++){
				count = count+1;
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 5, 3, 6};
		BubbleSort bubbleSort = new BubbleSort();
		arr = bubbleSort.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("comparisons Count: "+bubbleSort.count);

	}

}
