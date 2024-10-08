package SearchingAlgorithms;


/*  Compare the middle element of the search space with the key. 
If the key is found at middle element, the process is terminated.
If the key is not found at middle element, choose which half will be used as the 
next search space.
If the key is smaller than the middle element, then the left side is used for next search.
If the key is larger than the middle element, then the right side is used for next search.
This process is continued until the key is found or the total search space is exhausted.*/

public class BinarySearch {
	
	private int mid;

	public static void main(String[] args) {
		int[] a = {1,3,4,7,10,15,17,18,22,25};
		int high=a.length-1;
		int low=0;
		int data = 1;
		
		
		BinarySearch binarysearch = new BinarySearch();
		binarysearch.search(a,data,high,low);

	}
	
	public void search(int[] a,int data,int high,int low) {
		
		
		while(data != a[mid] && low<=high) {
			
			mid = (high+low)/2;
			
			 if(data>a[mid]) 
				low = mid+1;
			else
				high = mid-1;
					
		}
		
		if(data == a[mid]) {
			System.out.println("Data found at pos : "+mid);
		}
		else {
			System.out.println("Data Mismatch");
		}
		
	}

}
