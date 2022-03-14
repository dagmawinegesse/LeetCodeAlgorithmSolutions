
package solutions;

public class RotateArray {
	
public static void rotate(int[] nums, int k) {
    System.out.print("Before rotation ->");

	for(int i=0; i<nums.length;i++) {
		System.out.print(nums[i]);
	}
        k = k% nums.length; 
        reverse(nums, 0, nums.length-1); 
        reverse(nums,0, k-1 ); 
        reverse(nums, k, nums.length-1); 
        System.out.print(" After rotation-> ");
        for(int i=0; i<nums.length;i++) {
        

    		System.out.print(nums[i]);
    	}
       
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp= nums[start]; 
            nums[start] = nums[end]; ;
            nums[end] = temp; 
            start++;
            end--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums []= {1,2,3,4,5,6,7,8};
		int k = 3; 
		
		rotate(nums, k); //rotates the array nums by K times
		

	}

}
