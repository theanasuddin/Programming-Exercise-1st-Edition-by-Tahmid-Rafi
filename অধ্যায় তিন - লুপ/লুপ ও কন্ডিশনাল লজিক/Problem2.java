package programmingExercise;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d ", i);
			}
		}
	}
}