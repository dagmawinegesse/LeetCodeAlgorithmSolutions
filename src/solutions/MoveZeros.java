package solutions;

public class MoveZeros {

public static void moveZeroes(int[] nums) {
        
        //move all zero to the end the array 
        //itr through the array 
        //if the current number is zero move it to the right
        int temp = 0; 
        for(int i = 0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                 if(nums[i] == 0){
                    temp = nums[i]; 
                    nums[i] = nums[j]; 
                    nums[j] = temp; 
                }
                
            }
               
            }
        
        for(int i=0; i<nums.length; i++) {
        	System.out.print(nums[i]);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums [] = {1,0,2,0,3,4,5};
		
		moveZeroes(nums); //moves all zeros to the end of the array
	}

}
