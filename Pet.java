/*
  comments:
*/

public class Pet {
 	 int age;
	 float weight;
	 float height;
	 String color;
   
	 public void sleep(){
		  System.out.println(
						"Good night, see you tomorrow");
	 }
 
	 // define two arguments x and y, both of which integers
	 public void add( int x, int y){ // define a new function for class Pet
		  System.out.println(  x + "+" + y + "=" + (x+y) );
	 }
	 
	 // define a more powerful function for class Pet
	 public void algebra ( int x, int y, char operator ){ // define a new function for class Pet
		 if ( operator == '+' ) {
			  System.out.println(  x + "+" + y + "=" + (x+y) );
		 } else if ( operator == '-' ) {
			  System.out.println(  x + "-" + y + "=" + (x-y) );
		 } else if ( operator == '*' ) {
			  System.out.println(  x + "*" + y + "=" + (x*y) );
		 } else if ( operator == '/' ) {
			  System.out.println(  x + "/" + y + "=" + (x/y) );
		 } else if ( operator == '^' ) {
			  System.out.println(  x + "^" + y + "=" + (Math.pow(x,y)) );
		 }
	 }
	 public void eat(){
	  System.out.println(
	  "I’m so hungry…let me have a snack like nachos!");
	 }
 
	 public String say(String aWord){
		String petResponse = "OK!! OK!! " +aWord;
			return petResponse; 
	 }

} 
