import org.apache.log4j.Logger;
import java.io.*;
public class TestNull {

	public static class Null {
	    private static String nonEmpty;
		private static int length;
		public static void main(String[] args) {
	        String str1 = null;
	        String str2 = "SandeeP TeddU";
	        for(int i=10; i>=1; i--){
	              System.out.println("The value of i is: "+i);   
	        }
	        
	        if(isNullOrEmpty(str1))
	            System.out.println("First string is null or empty.");
	        	
	        else
	            System.out.println("First string is not null or empty.");
	        if(isNullOrEmpty(str2))
	            System.out.println("Second string is null or empty.");
	        else
	            System.out.println("Second string is not null or empty and the string is : " +str2 );
	        	length = str2.length();
	        	System.out.println("The length of the string is :" +length);
	        
	        	    }
	    public static boolean isNullOrEmpty(String str) {
	        if(str != null && !str.isEmpty())
	            return false;
	        return true;
	      }
	    
	     }
}
