package solutions;


public class TwoSum {

	public static int[] twoSum(int nums[], int target) {
		// nums = [2,7,11,15] target = 9 
        // return [0,1] as 2+7 = 9 
        
        // loop through the array 
        //start checking the sum of two intergers 
        //and when we find the sum of two numbers being the target 
        //print the indexes of the two number
		int [] saved = new int[2];
        int complement; 
        for(int i= 0; i<nums.length; i++){
            complement = target - nums[i]; 
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue; 
                }else if(nums[j] == complement){
                    saved[0] = i; 
                    saved[1] = j;
                }
            }
        }
        
        for(int i=0; i<saved.length; i++) {
        	System.out.println(saved[i]);
        }
        
        return saved;
		
		
	}
	public static void main(String[] args) {
		
		//test case
		int nums[] = {2,7,11,15};
		
		int target = 9; 
		
		twoSum(nums, target);
		
		
	}

}
