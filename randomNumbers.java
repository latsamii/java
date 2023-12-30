
public class Lab {

	public static void main(String[] args) {
		
		int num1 = (int) (Math.random() * 100 + 1);
		int num2 = (int) (Math.random() * 100 + 1);
		int num3 = (int) (Math.random() * 100 + 1);
		int num4 = (int) (Math.random() * 100 + 1);
		int num5 = (int) (Math.random() * 100 + 1);
		int num6 = (int) (Math.random() * 100 + 1);
		int num7 = (int) (Math.random() * 100 + 1);
		int num8 = (int) (Math.random() * 100 + 1);
		int num9 = (int) (Math.random() * 100 + 1);
		int num10 = (int) (Math.random() * 100 + 1);
		int average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
		
		System.out.println("The average is: " + average);
		if (average < 40)
			System.out.println("Too low");
		else if (average > 60)
			System.out.println("Too high");
		else
			System.out.println("Normal");
			
	}

}
