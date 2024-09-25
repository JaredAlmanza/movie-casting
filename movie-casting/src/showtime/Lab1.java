package showtime;
/**
 * Lab1 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in 
 * the lab description.
 * 
 * @author Amanda Fernandez (abc123)
 * UTSA CS 3443 - Lab 1
 * Fall 2021
 */
public class Lab1 {

	public static void main( String[] args ) {
		
		// Initialize a new show to add cast members to.
		Show hamilton = new Show( "Hamilton", 5 );

		// Initialize roles within the show 
		Role aHam = new Role( "Alexander Hamilton", 21 );						// Hamilton is age 21
		Role aBurr = new Role( "Aaron Burr", 20 );								// Burr is 20 
		Role mDeLafayette = new Role( "Marquis de Lafayette", 19 );
		Role tJefferson = new Role( "Thomas Jefferson", 33 );
		Role kGeorge = new Role( "King George III", 38 );
		Role gWashington = new Role( "George Washington", 44 );
	
		// Set up cast members and assign their role(s)
		CastMember lMMiranda = new CastMember( "Lin Manuel Miranda", 35, 1 );	// Lin Manuel Miranda is 35 years old and has 1 role in this show (2015)
		lMMiranda.addRole( aHam );

		CastMember lOdomJr = new CastMember( "Leslie Odom Jr.", 34, 1 );		// Odom is 34 and has 1 role
		lOdomJr.addRole( aBurr );

		CastMember dDiggs = new CastMember( "Daveed Diggs", 33, 2 );			// Diggs is 33 and has 2 roles
		dDiggs.addRole( mDeLafayette );
		dDiggs.addRole( tJefferson );

		CastMember jGroff = new CastMember( "Jonathan Groff", 30, 1 );
		jGroff.addRole( kGeorge );
		
		CastMember cJackson = new CastMember( "Christopher Jackson", 40, 1 );
		cJackson.addRole( gWashington );

		// Add cast members to the show
		hamilton.addCastMember( lMMiranda );
		hamilton.addCastMember( lOdomJr );
		hamilton.addCastMember( dDiggs );
		hamilton.addCastMember( jGroff );
		hamilton.addCastMember( cJackson );

		// Print to the console
		System.out.println( hamilton );
	}
}