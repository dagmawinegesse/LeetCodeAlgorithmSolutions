package solutions;

public class RemoveDuplicate {
	 public static int removeDuplicates(int[] nums) {
	        
	        if (nums.length == 0 || nums.length == 1) {
	            return nums.length;
	        }
	        int expectedNums[]= new int [nums.length]; 
	        int count=0;
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i]!= nums[i+1]){
	                expectedNums[count++] = nums[i];
	                
	            }
	           
	           
	        }
	       expectedNums[count++] = nums[nums.length-1];

	         for(int i = 0; i<count; i++){
	                nums[i] = expectedNums[i];
	                System.out.println(nums[i]);
	            }
	         return count;
	    }
	   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,4,5,6,7}; 
		removeDuplicates(nums);
	}

}
