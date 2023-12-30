import java.util.Scanner;

public class Chpt3_Project {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		//Prompts the user tell what temperature the beans cook at
		System.out.println("Enter the temperature in Celsius that beans cook at.");
		int beanTemp = input.nextInt();
		
		//Number randomly generated between 50-150
		int numTemp = (int)(50 + (Math.random() * 100));
		
		//Tells the user the random number generated and if the water is too hot or cold
		if (numTemp < 100)
			System.out.println("The water temperature is " + numTemp + " Celsius and is not hot enough to cook beans.");
		if (numTemp > 100)
			System.out.println("The water temperature is " + numTemp + " Celsius and is hot enough to cook beans.");

	}

}
