package is_One_Edit_Distance;

public class isOneEditDistance {
	
	public static void main(String[] args) {
		IsOneEditDistance("4361", "4321");
	}
	
	public static boolean IsOneEditDistance(String s, String t) {
        boolean tf = true;
        if(s.length() > t.length()) {
        	    tf=false;
        	    System.out.println("It is not a one edit distance.");
        }
        
        if(tf == true){
            for(int i= 0; i<t.length(); i++){
            	    char c = t.charAt(i);
            	    String str = Character.toString(c);
                if(!s.contains(str) && s.length()<t.length()){
                	    s += str;
                    System.out.println(s);
                }
                if(!s.contains(str) && s.length()==t.length()){
                	    StringBuilder word = new StringBuilder(s);
                	    char ch = t.charAt(i);
                	    word.setCharAt(i, ch);
                	    s = word.toString();
                	    System.out.println(s);
                }
                
            }
        }
        return tf;
        
    }

}
