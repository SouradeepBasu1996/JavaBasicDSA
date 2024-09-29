package SearchingAlgorithms;

public class JumpSearch {

	public static void main(String[] args) {
		
		int[] a= {3,9,12,13,15,19,20,25,26,29,40,44,47,50};
		int key = 26;
		JumpSearch jump = new JumpSearch();
		jump.jumping(a, key);
	}
	
	public void jumping(int[] a,int key) {
		
		int i=0;
		while(key>a[i]) {
			i=i+4;
		}
		int end =i;
		int start = i-4;
		linearSearch(a, start, end, key);
		
	}
	public void linearSearch(int a[],int start,int end,int key) {
		int c=0;
		for(int i=start;i<=end;i++) {
			if(key==a[i]) {
				System.out.println("Data found at : "+i);
				c++;
			}		
		}
		if(c!=1) {
			System.out.println("Data not found");
		}
		
	    }
	
}
