package SearchingAlgorithms;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void segregate(int[] nums) {
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evenList.add(nums[i]);
			}
			else {
				oddList.add(nums[i]);
			}
		}
		evenList.addAll(oddList);
		int[] finalArray = convertToArray(evenList);
	}
	
	public int[] convertToArray(List<Integer> list) {
		int[] finalArray = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			finalArray[i]=list.get(i);
		}
		return finalArray;
	}

}
