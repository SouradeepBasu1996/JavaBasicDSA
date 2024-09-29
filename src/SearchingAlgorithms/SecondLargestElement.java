package SearchingAlgorithms;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int[] nums = {8,4,3,1,8,0,9};
		
		SecondLargestElement find = new SecondLargestElement();
		find.findElemnet(nums);

	}
	
	public void findElemnet(int[] nums) {
		
		int f=0;
		int s=0;
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]>f) {
				s=f;
				f=nums[i];
			}
			else if(nums[i]>s) {
				s=nums[i];
			}
		}
		
		System.out.println("Second Largest Elelment : "+s);
		
	}

}
