package solutions;

public class BinarySearch {

	 public static int search(int[] nums, int target) {
	        //set left and right 
	        //set mid to be the this two divided by 2
	        int left = 0;
	        int right = nums.length-1; 
	        
	      
	        
	        while(left<= right){
	            int mid = left + ((right-left)/2); 
	            if(nums[mid] == target){
	            	System.out.println(mid);
	                return mid; 
	            }else if(target < nums[mid]){
	                right = mid -1; 
	            }else{
	                left = mid + 1; 
	            }
	        }
        	System.out.println(-1);

	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,2,3,4,5,6,7,8}; 
		int target = 6; 
 		search(nums, target); // output the position of target in nums

	}

}
