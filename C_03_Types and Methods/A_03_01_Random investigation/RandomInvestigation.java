class RandomInvestigation {

	RandomInvestigation() {
		double random1, random2;
		random1 = Math.random();
		random2 = Math.random();
		System.out.println("The numbers are: " + random1 + " and " + random2);
		System.out.println("Max is " + Math.max(random1, random2));
	}
	
	public static void main (String [] args) {
		new RandomInvestigation();
	}
}