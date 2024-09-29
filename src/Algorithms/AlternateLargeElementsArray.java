package Algorithms;

import java.util.Arrays;

public class AlternateLargeElementsArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,2,1,3};
		rearrange(a);
	}
	
	public static void rearrange(int[] a) {
		Arrays.sort(a);
		
		int[] b = new int[a.length];
		int index=0;
		//int oddIndex=a.length-1;
		for(int i=0;i<a.length;i++) {
			//System.out.print(a[i]+", ");
			if(i%2!=0) {
				b[i]=a[index];
				index++;
			}	
		}
		for(int i=0;i<a.length;i++) {
			//System.out.print(a[i]+", ");
			if(i%2==0) {
				b[i]=a[index];
				index++;
			}	
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+", ");
			
		}
	}

}
