package programmingExercise;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i = 1, product;

		while (true) {
			product = 7 * i;
			i++;

			if (product % 2 == 0) {
				System.out.printf("%d\n", product);
				count++;
			}

			if (count == 100) {
				break;
			}
		}
	}
}