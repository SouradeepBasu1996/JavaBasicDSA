package SearchingAlgorithms;

/* Sentinel Linear search is a type of search algorithm.
 * it is used to avoid any out-of-bounds comparisons, but there 
 * is no additional comparison made specifically for the index of 
 * the element being searched */

/* Sentinel linear search is a variation of the standard linear search algorithm
 *  used to find a target value in an array or list. The basic idea behind this 
 *  algorithm is to add a sentinel value at the end of the array which is equal 
 *  to the target value we are looking for. This helps to avoid checking the 
 *  array boundary condition during each iteration of the loop, as the sentinel 
 *  value acts as a stopper for the loop.*/

public class SentinelLinearSearch {

	public static void main(String[] args) {
		int[] a= {1,5,12,33,42,54,6};
		int n= a.length;
		
		
		SentinelLinearSearch search = new SentinelLinearSearch();
		search.sentinelSearch(a,n,32);

	}
	
	public void sentinelSearch(int a[],int n,int data) {
		
		int last =a[n-1];  // assigning the value of last element to a temporary variable
		a[n-1]=data;   //replacing the last index with the searched index
		int i=0;
		
		while(a[i]!=data)//the loop iterates only when the values don't match
			i++;
		
		a[n-1]=last;  //putting back the last element to the last index of the array
		
		if(i<n-1 || a[n-1]==data)
			System.out.println("Search element is present at loc : "+i);
		else
			System.out.println("Data Mismatch");
	}

}
