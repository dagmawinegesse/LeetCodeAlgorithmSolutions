package solutions;

public class ClimbStairs {
	
	 public static int climbStairs(int n) {
	        
	        //takes n steps to reach top 
	        //find possible ways to each top
	        // when n is 4 5 possible solution 
	        //(1,1,1,1), (2,2), (2,1,1), (1,1,2) (1,2,1)
	        //when n is 5
	        //(1+1+1+1+1) (1+2+1+1) (1+1+2+1)(1+1+1+2) (2+1+1+1)(2+2+1)
	        //when n is 6
	         //(1+1+1+1+1+1) (1+2+1+1+1) (1+1+2+1+1)(1+1+1+1+1+2) (2+1+1+1+1)(2+2+1+1)(2+2+1)

	     int temp1 = 1; 
	     int temp2 = 1; 
	        
	    int curr = 0; 
	        
	        for(int i = 2; i<=n; i++){
	            curr = temp2 + temp1; 
	            temp1 = temp2; 
	            temp2 = curr; 
	        }
	        System.out.println(temp2);
	        return temp2; 
	        
	        

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		climbStairs(6);

	}

}
