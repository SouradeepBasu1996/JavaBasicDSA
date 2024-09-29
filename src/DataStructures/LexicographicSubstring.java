package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicSubstring {

	public static void main(String[] args) {
		
		String str = "welcometojava";
		
		LexicographicSubstring lex = new LexicographicSubstring();
		lex.subString(str, 3);

	}
	
	public void subString(String s, int k) {
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<s.length()-(k-1);i++) {
			
			String newStr = "";
			
			for(int j=i;j<=i+2;j++) {
				newStr=newStr+s.charAt(j);
			}
			list.add(newStr);
		}
		
		Collections.sort(list);
		String smallest = list.get(0);
		String largest = list.get(list.size()-1);
		
		System.out.println("Smallest :"+smallest+" Largest : "+largest);
	}

}
