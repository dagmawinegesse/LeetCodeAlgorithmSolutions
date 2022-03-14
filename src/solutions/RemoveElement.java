package solutions;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
        
        //itr through the loop
        // if the current value of nums is val then do nothing 
        //if not copy those elements into expected nums
        //return the length of expectedNums
        
      int count =0; 
        
        for(int i= 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
        return count; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,5,6,10,11};
		int val = 6;
		
		removeElement(nums, val); //return the length without 6

	}

}
