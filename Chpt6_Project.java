import java.util.Scanner;

//Latsami Luanglaj

public class Chpt6_Project {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	// Prompts user to enter in height of the building as an int
		System.out.println("Enter the height of the building in feet as a integer: ");
		int buildingHeight = input.nextInt();

	//Prompts user to enter the initial speed of the ball in ft/sec as a double	
		System.out.println("Enter the initial speed of the ball in ft/sec as a double: ");
		double initialSpeed = input.nextDouble();

	//Prompts the user the enter the flight time of the ball as a double	
		System.out.println("Enter the flight time of the ball as a double: ");
		double flightTime = input.nextDouble();	
	//Prints calcBallHeight in next line	
		System.out.println();

		calcBallHeight(buildingHeight, initialSpeed, flightTime);
	}
	//Calculating projectile motion from inputs entered by user
	public static double calcBallHeight(int buildingHeight, double initialSpeed, double flightTime) {
		
		double height = -16 * flightTime * flightTime + initialSpeed * flightTime + buildingHeight;
	//Printing out statement with numbers only going to two decimal points	
		System.out.printf("The ball will be %.2f feet above the ground after %.2f seconds of flight time.", height, flightTime);
		return height;	
		}
}

