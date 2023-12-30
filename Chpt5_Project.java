import java.util.Scanner;

public class Chpt5_Project {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a value in between 30 and 70
		System.out.println("Enter a value between 30 and 70: ");
		
		int value;
		//Loop for if value is in between range
		while(true) {
			value = input.nextInt();
		//If the value is over 70, it will prompt user to reenter
			if (value > 70) {
				System.out.println("The value is out of range, please reenter: ");
		//If the value is under 30, it will prompt user to reenter
			} else if (value < 30) {
				System.out.println("The value is out of range, please reenter: ");
		//When in range it will go out of the loop, and print the value entered
			} else {
				System.out.println("The value entered is: " + value);
				break;
			}
		}
		// Generates 100 numbers between 0 and 100
		int counter = 1;
		int random = 0;
		int num = 0;
		while (counter <= 100) {
			random += (int) (Math.random() * 100);
			counter ++;
		//Compares value to random number generated and checks if it's less than, if less than it will add 1 to total count
		if (value <= counter) {
			  num ++;
		}
			}
		System.out.println("There are " + num + " random numbers larger than " + value);
		}
		
	}


