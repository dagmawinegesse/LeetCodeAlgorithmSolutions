package solutions;

import java.util.Stack;

public class ValidParentheses {
	 public static boolean isValid(String s) {
	        if(s.length() % 2 != 0 ) return false;
	        Stack<Character> validP = new Stack<>();
	        for(char c: s.toCharArray()){
	            if(c == '(' || c == '{' || c == '['){
	                validP.push(c);
	            }else if(c == ')' && !validP.isEmpty() && validP.peek() == '(' ){
	                validP.pop();
	            }else if(c == '}' && !validP.isEmpty() && validP.peek() == '{' ){
	                validP.pop();
	            }else if(c == ']' && !validP.isEmpty() && validP.peek() == '[' ){
	                validP.pop();
	            }else{
	            	System.out.println("False");
	                return false;
	            }
	        }
	        System.out.println("True");
	        return validP.isEmpty();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(}";
		
		isValid(s);

	}

}
