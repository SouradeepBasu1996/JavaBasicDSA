package SearchingAlgorithms;

public class TernarySearch {

	public static void main(String[] args) {
		int[] a= {5,9,14,20,27,35,37,38,42,46,51,63,65,66,69,80,82,85,93,97,100};
		int x=42;
		int index = search(a,x);
		if(index!=-1)
			System.out.println("Search elment found at index = "+index);
		else
			System.out.println("Search element not found");
	}
	private static int search(int[] a, int x) {
		
		int left = 0;
		int right = a.length-1;
		int break1=0;
		int break2=0;
		
		while(left<right) {
			
			break1=left+((right-left)/3);
			break2=right-((right-left)/3);
			
			if(x==a[break1])
				return break1;
			else if(x==a[break2])
				return break2;
			else if(x<a[break1])
				right=break1-1;
			else if(x>a[break2])
				left=break2+1;
			else if(x>a[break1] && x<a[break2]) {
				left=break1+1;
				right=break2-1;
			}
				
		}
		return -1;
	}
}
