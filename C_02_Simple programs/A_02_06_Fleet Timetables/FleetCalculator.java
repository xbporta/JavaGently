class FleetCalculator {
	
	/* The Fleet Calculator Program		by J M Bishop Aug 1996
	 * ----------------------------		Java 1.1 Oct 1997
	 *									update and Java 2, Apr 2000
	 * Works out the new arrival time for vehicles that
	 * do a journey in 15% less time.
	 *
	 * Illustrates expressions and assignement.
	 * Includes use of the modulo operator %
	 */
	
	FleetCalculator () {
		
		int reduction = 85;
		int depart24 = 900;
		int arrive24 = 1020;
		
		int newArrive24,		// 24 hour clock time
			departMins,			// minutes in a day
			arriveMins,
			oldJourneyMins,
			newJourneyMins,
			newArriveMins;
		
	//  Convert the initial times to minutes
		departMins = depart24 / 100 * 60 + depart24 % 100;
		arriveMins = arrive24 / 100 * 60 + arrive24 % 100;
		
	//  Calculate the old and new times
		oldJourneyMins = arriveMins - departMins;
		newJourneyMins = oldJourneyMins * reduction / 100;
		
	//  Create the new arrival time in minutes and
	// 	then in a 24 hour clocj time
		newArriveMins = departMins + newJourneyMins;
		newArrive24 = newArriveMins * 60 / 100 + newArriveMins % 60;
		
	//  Report on the findings
		System.out.println("Departure time is " + depart24);
		System.out.println("Old arrival time is " + arrive24);
		System.out.println("Old journey time is " + oldJourneyMins + " minutes");
		System.out.println("New journey time is " + newJourneyMins + " minutes");
		System.out.println("New arrival time is " + newArrive24);
	}
	
	public static void main (String [] args) {
		new FleetCalculator ();
	}
}