package solutions;

public class SortedSquares {
	 public static int[] sortedSquares(int[] nums) {
	        
	        //square the values of nums
	        //sort the sqared values of nums in non-decreasing order
	        
	    //loop through the nums array
	    //square each value 
	    //sort the array 
	        int temp = 0;
	        for(int i = 0; i<nums.length; i++){
	            nums[i]= nums[i]*nums[i];
	        }
	        for (int i= 0; i< nums.length; i++){
	            
	           for(int j= i+1; j<nums.length; j++){
	               
	               if(nums[i] > nums[j]){
	                   temp = nums[i]; 
	                   nums[i] = nums[j]; 
	                   nums[j] = temp; 
	                   
	               }
	           }
	            
	            
	        }
	        
	        for(int i=0; i<nums.length; i++) {
	        	System.out.println(nums[i]);
	        }
	        return nums; 
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {2,3,4,5,6,7};
		
		sortedSquares(nums); //inplace the function will alter the existing numbers to there squares

	}

}
