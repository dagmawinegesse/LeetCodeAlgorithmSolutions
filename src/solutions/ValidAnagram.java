package solutions;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
        if(s.length()!= t.length()) return false;
       int [] charCount = new int[26]; 
         
        for(int i= 0; i<s.length(); i++){
            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;
        }
        
        for(int count: charCount){
            if(count!= 0){
            	System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anagram";
		String  t = "nagaram";
		
		isAnagram(s,t);
	}

}
