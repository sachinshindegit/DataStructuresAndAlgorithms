package sortingSearchingQuestions;

public class ElevenFive {
	
	public static int search(String[] a, int left, int right, String s){
		if(left > right){
			return -1;
		}
		int mid = (left+right)/2;
		
		if(a[mid] == null){
			int first = mid;
			int last = mid;
			
			// shifting of mid
			while(a[mid]==null){
				if(first < left && last > right){
					return -1;
				}
				if(a[first] != null){
					mid = first;
				}else{
					first--;
				}
				if(a[last] != null){
					mid = last;
				}else{
					last++;
				}
			}
		}
		
		if(a[mid].equalsIgnoreCase(s)){
			return mid;
		}
		
		if(a[mid].compareTo(s) < 0){
			return search(a,mid+1,right,s);
		}else{
			return search(a,left,mid-1,s);
		}
	}
	
	public static void main(String[] args){
		String[] a = {"a","aa",null,"ab","bc",null,"cc"};
		System.out.println(search(a, 0, 6, "cc"));
	}
}
