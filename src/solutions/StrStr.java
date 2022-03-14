package solutions;

public class StrStr {
	
	//Return the index of the first occurrence of
	//needle in haystack, or -1 if needle is not part of haystack.
	
	 public static int strStr(String haystack, String needle) {
	       int output = 0; 
	        
	        if(needle.length() == 0){
	            return 0; 
	        }
	        if(haystack.length() == 0){
	            return -1; 
	        }
	        while(haystack.length()!=0 && needle.length()!=0){
	           output = haystack.indexOf(needle); 
	            break;
	        }
	        System.out.println(output);
	        return output; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//haystack = "hello", needle = "ll"
		strStr("hello", "ll");
		
		

	}

}
