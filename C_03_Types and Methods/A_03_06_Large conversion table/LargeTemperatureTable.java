class LargeTemperatureTable {
	
	/* Large Temperature Table Program		by J M Bishop Sept 1996
	 * -------------------------------		Java 1.1
	 *										updated April 2000
	 * Produces a conversion table from Celsius to Fahrenheit
	 * for values from 0 to 99.
	 *
	 * Illustrates for-loops, methods for structuring,
	 * typed methods and parameters.
	 */
	
	int colsPerLine = 5;
	int maxLineNo = 20;
	String gap = "\t\t";
	
	LargeTemperatureTable () {
		// First print the headings
		System.out.println("\t\tTemperature Conversion Table");
		System.out.println("\t\t============================");
		System.out.println();
		
		for (int col = 0; col < colsPerLine; col++)
			System.out.print("C\tF" + gap);
		System.out.println();
		
		// Second, print the table
		// For each of thel ines required, the outaLine
		// method is called with the line number as a parameter
		for (int r = 0; r < maxLineNo; r++)
			outaLine(r);
	}
	
	void outaLine (int thisline) {
		/* Using the information given by the parameter as
		 * to which line this is, the method calculates the
		 * Celsius values for that line and displays them with
		 * their Fahrenheit equivalents
		 */
		 
		for (int col = 0; col < colsPerLine; col++) {
			int c = thisline * colsPerLine + col;
			System.out.print(c + "\t");
			System.out.print(fahrenheit(c) + gap);
		}
		System.out.println();
	}
	
	// a simple conversion function
	long fahrenheit(int celsius) {
		return Math.round(celsius*9.0/5 + 32);
	}
	
	public static void main (String [] args) {
		new LargeTemperatureTable();
	}
}