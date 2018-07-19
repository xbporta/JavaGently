class TemperatureTable {

	/* The Temperature Conversion Program	by J M bishop Aug 1996
	 * ----------------------------------	Java 1.1
	 *										updated April 2000
	 * Displays a simple table converting Celsius
	 * to Fahrenheit for a given range.
	 *
	 * Illustrates using the loop variable
	 * in expressions in the loop
	 */
	
	TemperatureTable () {
		System.out.println("Temperature Conversion Table");
		System.out.println("============================");
		System.out.println();
		System.out.println("C\tF");
		
		for (int c = 5; c <= 20; c++) {
			System.out.println(c + "\t" + Math.round(c*9.0/5 + 32));
		}
	}
	
	public static void main (String [] args) {
		new TemperatureTable ();
	}
}