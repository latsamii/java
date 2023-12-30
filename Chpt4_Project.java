import java.util.Scanner;

public class Chpt4_Project {

	public static void main(String[] args) {
		
		Scanner textScanner = new Scanner (System.in);
		Scanner numericScanner = new Scanner (System.in);
		
		//Prompting user to enter in team name
		System.out.println("The name of the team is: ");
		String teamName = textScanner.nextLine();
	
		//Prompting user to enter in member 1 name
		System.out.println("Enter the name of member 1: ");
		String memberOne = textScanner.nextLine();
		
		//Prompting user to enter in member 1 weight in lbs and converts and stores in kg
		System.out.println("Enter the weight of member 1 in lbs: ");
		double memberOneLbs = numericScanner.nextDouble();
		
		//Prompting user to enter in member 2 name
		System.out.println("Enter the name of member 2: ");
		String memberTwo = textScanner.nextLine();
		
		//Prompting user to enter in member 2 weight in lbs and converts and stores in kg
		System.out.println("Enter the weight of member 2 in lbs: ");
		double memberTwoLbs = numericScanner.nextDouble();
		
		//Prompting user to enter in member 3 name
		System.out.println("Enter the name of member 3: ");
		String memberThree = textScanner.nextLine();
		
		//Prompting user to enter in member 3 weight in lbs and converts and stores in kg
		System.out.println("Enter the weight of member 3 in lbs: ");
		double memberThreeLbs = numericScanner.nextDouble();
		
		//Adding weight from all three inputs and converting to kg
		double weightTotalKg = (memberOneLbs + memberTwoLbs + memberThreeLbs) / 2.2046;
		
		//Stating team name with team members
		System.out.println("Team " + teamName + " members: " + memberOne + ", " +  memberTwo + ", " + "and " + memberThree);
		
		//if statement depending if weightTotalKg is over or under set maximum is 272.16
		if (weightTotalKg < 272.16)
			System.out.printf("The total weight of the team is %6.2f and is under the maximum", weightTotalKg);
		if (weightTotalKg > 272.16)
			System.out.printf("The total weight of the team is %6.2f and is not under the maximum", weightTotalKg);
		
	}

}
