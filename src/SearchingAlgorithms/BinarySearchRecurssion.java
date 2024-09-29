package SearchingAlgorithms;

public class BinarySearchRecurssion {

	public static void main(String[] args) {
		
		int[] a = {2,3,10,16,23,51,62,65,90};
		int low=0;
		int high=a.length-1;
		int x = 10;
		
		int index = search(a,x,low,high);
		
		if(index!=-1) 
			System.out.println("Search Element found in index : "+index);
		else
			System.out.println("Search Element not found");

	}
	
	private static int search(int[] a, int x, int low, int high) {
		
		if(low>high) {
			return -1;
		}
		
		int mid = (low+high)/2;
		System.out.println("mid value "+mid);
		if(x==a[mid]) {
			System.out.println("a[mid] : "+a[mid]);
			return mid;
		}
		else if(x<a[mid]) {
			System.out.println("Value of mid-1 : "+(mid-1));
			return search(a,x,low,mid-1);	
		}
		else {
			System.out.println("Value of mid+1 : "+(mid+1));
			return search(a,x,mid+1,high);
		}
		
	}

}
