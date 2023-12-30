import java.util.Scanner;

public class Chpt8_Project {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
//Making a single array for the two cities
		String[] city = new String [2];
		
//Make a double array for the latitude and longitude of the two cities
		double latitudeLongitude[][] = new double [2][2];
		
//Saving first and second city as a string	
		System.out.print("Enter the first city: ");
		city[0] = input.nextLine();
		System.out.print("Enter the second city: ");
		city[1] = input.nextLine();

//Asking and saving latitude and longitude of the first city		
		System.out.print("Enter the latitude and longitude of first city separated by a space: ");
		latitudeLongitude[0][0] = input.nextDouble();
		latitudeLongitude[0][1] = input.nextDouble();
		
//Asking and saving latitude and longitude of the second city			
		System.out.print("Enter the latitude and longitude of second city separated by a space: ");
		latitudeLongitude[1][0] = input.nextDouble();
		latitudeLongitude[1][1] = input.nextDouble();
		
//Saving distance as a double		
		double distance = calcDistance (latitudeLongitude);
		
//Stating the distance between the two cities		
		System.out.printf("The distance between the two cities is %4.2f miles", distance);	
	}

	public static double calcDistance (double[][] list) {
		
		//calculating distance
		double xValue = (list[0][1] - list[1][1])*55;
		double yValue = (list[0][0] - list[1][0])*69;
		double distance = Math.sqrt(xValue*xValue + yValue*yValue);
		return distance;
	}
}
