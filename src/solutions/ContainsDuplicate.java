package solutions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	 public static boolean containsDuplicate(int[] nums) {
	        
		 /*
		 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		 */
		         Set<Integer> store = new HashSet<>(); 
		         for(int i = 0; i<nums.length; i++){
		             if(store.contains(nums[i]) == false){
		                 store.add(nums[i]); 
		             }else{
		            	 System.out.print(true);
		                 return true; 
		             }
		             
		         }
		         System.out.print(false);
		         return false; 
		     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,2,3,5,4,5,6,7};
		containsDuplicate(nums);
	}

}
