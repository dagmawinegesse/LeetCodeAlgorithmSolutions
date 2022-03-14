package solutions;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int output = 0; 
        
        String [] copyOfs = s.split(" "); 
        for(int i = 0; i<copyOfs.length; i++){
            output = copyOfs[copyOfs.length-1].length(); 
        }
        System.out.println(output);
        return output; 
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	String s = "   fly me   to   the moon  ";
		
		lengthOfLastWord(s);

	}


}
