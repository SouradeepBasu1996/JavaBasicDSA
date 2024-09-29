package SearchingAlgorithms;

public class LargestThreeElementsOfArray {
	
	public static void main(String[] args) {
		
		int nums[]= {12,10,22,34,54,32,89,100};
		LargestThreeElementsOfArray arr = new LargestThreeElementsOfArray();
		//arr.findAll(nums);
		arr.ifNegetiveArray(nums);
	}
	
	public void findAll(int[] nums) {
		int max;
		int index=0;
		int[] maxArr = new int[3];
		for(int i=0;i<3;i++) {
			max=-1;     //assuming all numbers in the array are positive
			for(int j=0;j<nums.length;j++) {
				if(nums[j]>max) {
					max=nums[j];
					index=j;
				}
			}
			maxArr[i]=max;
			nums[index]=-1;
		}
		System.out.println("From ifAllPositiveArray : ");
		System.out.println(" ");
		for(int i=0;i<maxArr.length;i++) {
			System.out.print(maxArr[i]+",");
		}
	}
	public void ifNegetiveArray(int[] nums) {
		
		int f;
		int s;
		int t;
		f=s=t=-100;
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]>f) {
				t=s;
				s=f;
				f=nums[i];
			}
			else if(nums[i]>s) {
				t=s;
				s=nums[i];
			}
			else if(nums[i]>t) {
				t=nums[i];
			}
		}
		System.out.println("First : "+f);
		System.out.println("Second :"+s);
		System.out.println("Third :"+t);
	}
	public void ifRepeatedValues(int[] nums) {
		
	}

}
