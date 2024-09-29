package ArrayBasicProblems;

// Reversing an array

public class ReverseAnArray {
	
	public static int[] reverse(int[] arr) {
	
		int temp=0;
		int startPointer=0;
		int endPointer=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			if(startPointer<=endPointer) {
				
				temp = arr[startPointer];
				arr[startPointer]=arr[endPointer];
				arr[endPointer]=temp;
				
				startPointer++;
				endPointer--;
				
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {5,3,6,9,2,7};
		
		System.out.println(" Initial Array :");
		System.out.println();
		printArray(arr);
		System.out.println();
		
		int[] resArr = reverse(arr);
		
		System.out.println(" Reversed Array :");
		System.out.println();
		printArray(resArr);
	}

}
