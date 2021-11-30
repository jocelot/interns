package multiply;

import java.io.IOException;

public class Mpl {

	public static void main(String[] args) throws IOException {

		// Get arguments from command line
		String m1 = args[0];
		String m2 = args[1];
		
		// Compute multiply
		float i = Integer.parseInt(m1) * Integer.parseInt(m2); 
		
        // Printing the read line
        System.out.println(i);	
		
		
	}

}
