﻿package b_전체탐색;
import java.util.*;
 public class InterestingDigits2 {
	public static void main(String[] args) {
		int base=10;
		
		int[] a = digits(base);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
}
	
	public static int[] digits(int base){
			
			 ArrayList <Integer> v = new ArrayList<Integer>();
			 
			 for(int i = 2; i<base; i++)
			 {
				 if(( (base-1) % i) == 0 ) {
					 v.add(i);
				 }
			 }
			 
				int [] ans = new int[v.size()];
				
				for( int i = 0; i<v.size(); i++ ) 
					ans[i] = v.get(i);
				
			 return ans;
}
}

 
