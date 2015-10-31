package LearnAgain;

public class MergeSort {

	public void mergeSort(int[] arr,int[] helper, int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(arr,helper,left,mid);
			mergeSort(arr,helper,mid+1,right);
			merge(arr,helper,left,mid,right);
		}
	}

	public void merge(int[] arr,int[] helper, int left, int mid, int right)	{
		for(int i=0; i<arr.length; i++) {
			helper[i]=arr[i];
		}

		int helperleft = left;
		int helperright =mid+1;
		int current = left;

		while(helperleft<=mid && helperright<=right){
			if(helper[helperleft] <= helper[helperright]) {
				arr[current] = helper[helperleft];
				helperleft++;
			}
			else{
				arr[current] = helper[helperright];
				helperright++;
				}
		current++;
		}

		while(helperleft<=mid) {
			arr[current] = helper[helperleft];
			current++;
			helperleft++;
		}

	}

	public static void main(String[] args) {
		int[] arr = {2,1,5,3,7,3,9,8};
		int[] helper = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		new MergeSort().mergeSort(arr,helper,0,arr.length-1);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}