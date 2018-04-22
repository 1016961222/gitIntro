public class PetMaster {
	public static void main(String[] args) {

		String petReaction;
		Pet snowball = new Pet();// create his own pet
		snowball.eat(); // I’m so hungry…let me have a snack like nachos!
		petReaction = snowball.say("Tweet!! Tweet!!");
		System.out.println(petReaction); // OK!! OK!! Tweet!! Tweet!!
		snowball.sleep();// print out "Good night, see you tomorrow"
		// object + function + ;

		// define variable i to be the counter
		// for ( initial conditions;  ending condition; counter increment)
		for (int i=0; i < 5;  i = i+1 ) // outer  for loop, using counter i
		{
			for (int j=0; j < 5;  j = j+1 ) // // inner for loop, using counter j
			{
				snowball.algebra (  i, j, '+'); // subject + verb . 
			}
		}
	}
}




/*
 * Scanner keyboard = new Scanner(System.in);
	System.out.println("enter an integer");
	int myint = keyboard.nextInt();
 */
