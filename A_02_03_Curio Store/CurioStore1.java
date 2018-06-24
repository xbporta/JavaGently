class CurioStore1 {
	/* Curio Store No. 1 by J M Bishop April 2000
	 * -----------------
	 * Illustrates the basic form of an object-oriented program
	 */
	 
	// Declare three object variables
	Curio mugs, tshirts, carvings;
	
	// The cosntructor for the program is
	// where the initial work gets done
	CurioStore1 () {
		// Create three objects with different initial values
		mugs = new Curio("Traditional mugs", 6, "beaded in Ndebele style");
		tshirts = new Curio("T-shirts", 30, "sizes M to XL");
		carvings = new Curio("Masks", 80, "carved in wood");
		
		// Print ut a header
		System.out.println("The Polelo Curio Store sells\n");
		
		// Print the values contained in each of the objects
		mugs.write();
		tshirts.write();
		carvings.write();
	}
	
	// All programs must have a main method
	public static void main (String [ ] args) {
		// Start the program running its cosntructor
		new CurioStore1();
	}
}

class Curio {
	
	// Declare variables related to a curio
	String name;
	int price;
	String description;
	
	// The constructor copies the initial values
	// into the object's variables
	Curio (String n, int p, String d) {
		name = n;
		price = p;
		description = d;
	}
	
	// a method to output the values of the object's variables
	void write() {
		System.out.println(name + " " + description + " for G" + price);
	}
}