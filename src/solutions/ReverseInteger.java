package solutions;

public class ReverseInteger {
	 public static int reverse(int x) {
	        //reverse a given integer
	        int temp = 0; 
	        while(x!=0){
	           int remainder = x% 10; 
	            x/=10;
	            if(temp> Integer.MAX_VALUE/10 || (temp == Integer.MAX_VALUE/10 && remainder>7)) return 0; 
	            if(temp< Integer.MIN_VALUE/10 || (temp == Integer.MIN_VALUE/10 && remainder<-8)) return 0;
	        
	            temp = temp * 10+ remainder; 
	                
	            
	              
	            
	            
	        }
	        System.out.println(temp);
	        return temp;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse(123);

	}

}
