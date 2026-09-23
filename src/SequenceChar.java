import java.util.Scanner;

public class SequenceChar {
	    public static void main(String[] args) {
	    	
	    String str = "PHP Exercises and Python Exercises";
	     System.out.println("Original String: " + str);
	     
	    Scanner s=new Scanner (System.in);
	    System.out.println("Specified sequence of char values: ");
	    String sequence = s.nextLine();
	    
	    boolean result = str.contains(sequence);
	    
	    System.out.println(result);
	    }
	}
