import java.io.*;

class Greetings {
	/*	A simple greetings program	by J M Bishop	Oct 1996
	 *	--------------------------	Java 1.1 		Dec 1997
	 *								updated May 2000
	 */
	
	Greetings () throws IOException {
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("What is your name? ");
		String name = in.readLine();
		System.out.println("Bonjour " + name);
	}
	
	public static void main (String args[]) throws IOException {
		new Greetings();
	}
}
