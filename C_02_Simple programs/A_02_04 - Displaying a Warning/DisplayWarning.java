class DisplayWarning {

	/* Displaying a warning program		by J M Bishop Aug 1996
	 * ----------------------------		Java 1.1 October 1997
	 *									updated and Java 2 April 2000
	 * Illustrates the form of a program ant the use of println.
	 */
	
	DisplayWarning () {
		System.out.println("-----------------------------");
		System.out.println("|                           |");
		System.out.println("|          WARNING          |");
		System.out.println("|  Possible virus detected  |");
		System.out.println("|    Reboot and run virus   |");
		System.out.println("|      remover software     |");
		System.out.println("|                           |");
		System.out.println("-----------------------------");
	}
	
	public static void main (String [] args) {
		new DisplayWarning ();
	}
}