package programmingExercise;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			System.out.printf("For x = %d\n", i);

			// a.
			System.out.printf("a. ");
			System.out.printf("y = x^2 = %.2f\n", Math.pow(i, 2));

			// b.
			System.out.printf("b. ");
			System.out.printf("y = x^2lnx^3 = %.2f\n", Math.pow(i, 2) * Math.log(Math.pow(i, 3)));

			// c.
			System.out.printf("c. ");
			System.out.printf("y = x^3 - (6x^2 / 19) + (42x / 71) - (3701 / 9993) = %.2f\n\n",
					Math.pow(i, 3) - ((6 * Math.pow(i, 2)) / 19) + ((42 * i) / 71) - (3701 / 9993));
		}
	}
}
