package SearchingAlgorithms;

public class LinearSearch {
	
	public void search(int data) {
		int[] a = {10,23,45,33,11,34};
		int c =0;
			for(int i=0;i<a.length;i++) {
				if(data==a[i]) {
					System.out.println("Search completed at index : "+i);
					c++;
				}		
		}
			if(c!=1) {
				System.out.println("Data Mismatch");
			}
	}
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		linearSearch.search(34);
		linearSearch.search(234);
	}

}
