class LotsaLabels {

	/* Displaying a warning program		by J M Bishop Aug 1996
	 * ----------------------------		Java 1.1 October 1997
	 *									updated and Java 2 April 2000
	 * Prints many labels
	 * Illustrates a simple for-loop
	 */
	
	LotsaLabels () {
		
		for (int i = 0; i < 8; i++) {
			System.out.println("-----------------------------");
			System.out.println("|                           |");
			System.out.println("|   Ms Mary Brown           |");
			System.out.println("|   33 Charles Street       |");
			System.out.println("|   Brooklyn                |");
			System.out.println("|                           |");
			System.out.println("-----------------------------");
		}
	}
	
	public static void main (String [] args) {
		new LotsaLabels ();
	}
}