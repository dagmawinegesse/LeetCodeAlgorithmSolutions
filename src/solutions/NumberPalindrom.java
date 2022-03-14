package solutions;

public class NumberPalindrom {

public static boolean isPalindrome(int x) {
        
        //x = 121 return true 
        //x = 123 return false
        //x = -121 return false
        //check if it reads the same left to right
        int temp=0; 
        int remainder=0;
        int orignalNum = x; 
        if(x<0){
            return false;
        }
        while(x!=0){
            remainder = x%10; 
            temp = temp*10 + remainder; 
            x/=10;
        }
        
        if(temp == orignalNum){
        	System.out.println("true");
            return true;
        }else{
        	System.out.println("False");
            return false;
        }
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(121); 
		isPalindrome(123); 
	}

}
