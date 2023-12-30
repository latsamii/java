import java.util.Arrays;
import java.util.Scanner;

public class Chpt7_Project {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 100 + 1);
		}
		
		int minimum = 999;
		int maximum = -1;
		
		for (int i = 0; i < list.length; i++) {
			if (maximum < list[i])
				maximum = list[i];
			if (minimum > list[i])
				minimum = list[i];
		}
		
		System.out.println("The largest value is " + maximum);
		
		System.out.println("The unsorted list is: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
		System.out.println();
		
		bubbleSort(list);
		System.out.println("The sorted list is: " + Arrays.toString(list) + " ");
	}
	
	public static void bubbleSort(int[] list) 
	  {
	    int temp;
	    			  
		  for (int i = list.length - 1; i > 0; i--) 
	      {
	         for (int j = 0; j < i; j++) 
	         {
	           if (list[j] > list[j + 1]) 
	           {
	           temp = list[j];
	           list[j] = list[j + 1];
	           list[j + 1] = temp;
	           }
	         }
	      }
	   }


}
