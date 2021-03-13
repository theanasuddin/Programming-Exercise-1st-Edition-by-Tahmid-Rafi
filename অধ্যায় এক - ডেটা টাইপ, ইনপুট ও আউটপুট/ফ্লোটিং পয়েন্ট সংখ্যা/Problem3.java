package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float meter, feet, inch;
		float cm, total_inch;

		meter = scan.nextFloat();
		scan.close();

		// 1st way
		feet = meter * 3.2808f;
		inch = (feet - (int) feet) * 12;

		System.out.printf("%d feet %.2f inch\n", (int) feet, inch);

		// 2nd way
		cm = meter * 100;
		total_inch = cm * 0.393701f;
		feet = (int) (total_inch / 12);
		inch = total_inch - (feet * 12);

		System.out.printf("%d feet %.2f inch\n", (int) feet, inch);

		// 3rd way
		feet = meter * 3.2808f;
		inch = (feet * 12) % 12;

		System.out.printf("%d feet %.2f inch\n", (int) feet, inch);
	}

}
