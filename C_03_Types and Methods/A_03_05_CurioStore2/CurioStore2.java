class CurioStore2 {
	
	/*
	 * Polelo Curio Store no.2		by J M Bishop April 2000
	 * -----------------------
	 * 
	 * The shop with stock levels and a sell option
	 * Illustrates methods in an object-oriented program
	 */
	 
	public static void main(String [] args) {
		// Creates the class's (i.e. program's) object
		new CurioStore2 ();
	}
	
	// declare three objects
	Curio mugs, tshirts, carvings;
	
	// The constructor for the program
	// where the initializing and main work gets done
	CurioStore2() {
		
		// instantiate the objects with different initial values
		mugs = new Curio("Traditional mugs", 6, "beaded in Ndebele style");
		tshirts = new Curio("T-shirts", 30, "sizes M to XL");
		carvings = new Curio("Masks", 80, "carved in wood");
		
		// print out a report
		report();
		
		// Now stock the shop for each curio
		mugs.addToStock(10);
		tshirts.addToStock(50);
		carvings.addToStock(5);
		
		// report on stock levels
		available();
		
		// Sell something. The sell method returns a string with
		// a "receipt" we can print
		System.out.println(tshirts.sell(8));
		
		// Report on stock levels again
		available();
	}
	
	void report() {
		System.out.println("The Polelo Curio Store sells\n");
		// use the objects' access toString to print their contents
		mugs.write();
		tshirts.write();
		carvings.write();
	}
	
	
	void available() {
		System.out.println("Available are " + mugs.stockLevel() + " " +
			tshirts.stockLevel() + " " + carvings.stockLevel() +
			" curios respectively\n");
	}
}

class Curio {
	// An inner class giving details of and actions on a curio.
	// Will be expanded as the project progresses
	
	// Declare the fields, including a new one for stock.
	String item;
	int price;
	String description;
	int stock;
	
	// The constructor copies the initialization into the fields
	Curio (String n, int p, String d) {
		item = n;
		price = p;
		description = d;
	}
	
	void addToStock (int n) {
		stock += n;
	}
	
	String sell (int n) {
		stock -= n;
		return "Sold " + n + " " + item;
	}
	
	int stockLevel () {
		return stock;
	}
	
	void write() {
		System.out.println(item + " " + description + " for G" + price);
	}
}