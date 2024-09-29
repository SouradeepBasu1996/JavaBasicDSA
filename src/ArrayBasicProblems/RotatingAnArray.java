package ArrayBasicProblems;

public class RotatingAnArray {
	
	public static int[] clockwiseRotate(int[] arr) {
		
		int temp = arr[arr.length-1];
		 
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		return arr;
		
	}
	
	public static int[] antiClockwiseRotate(int[] arr) {
		int temp = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
		return arr;
	}
	public static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr= {5,3,6,9,2,7};
		int[] arr2= {5,3,6,9,2,7};
		System.out.println(" Initial Array :");
		System.out.println();
		printArray(arr);
		System.out.println();
		
		int[] resArr = clockwiseRotate(arr);
		
		System.out.println("Clockwise Rotated Array :");
		System.out.println();
		printArray(resArr);
		System.out.println();
		
		int[] resultArr = antiClockwiseRotate(arr2);
		
		System.out.println("Anti-Clockwise Rotated Array :");
		System.out.println();
		printArray(resultArr);

	}

}
