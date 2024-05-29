package projectanudip;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "naveen";
	        countCharacters(str);
	    }
	    public static void countCharacters(String str) {
	        int[] charCount = new int[128];
	        for (int i = 0; i < str.length(); i++) {	     
	            int asciiValue = str.charAt(i);
	            charCount[asciiValue]++;
	        }
	        System.out.println("Character Counts:");
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 0) {
	                System.out.println("'" + (char) i + "': " + charCount[i]);
	            }
	        }
	    }
	}