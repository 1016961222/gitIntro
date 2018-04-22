/*
add comments:
*/

public class Fish extends Pet {

	int currentDepth = 0;
	
	  // This is constructor
	  Fish(int startingPosition)  {
	    currentDepth = startingPosition;
	  }

	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
		System.out.println("Diving for " + howDeep + " feet");
		System.out.println("I'm at " + currentDepth + " feet below sea level");
		return currentDepth;
	}

	public String talk(String something) {
		return "Don't you know that fish do not talk?";
	}

}
