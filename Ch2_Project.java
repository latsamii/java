import java.util.Scanner;

public class Ch2_Project {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in average miles per hour (mph) for the car:  ");
		int averageSpeed = input.nextInt();
		
		System.out.println("Enter the distance in miles the trip is:  ");
		double tripDistance = input.nextInt();
		
		double totalHours = tripDistance / averageSpeed;
		
		System.out.println("The trip will take " + totalHours);
		
	}

}
