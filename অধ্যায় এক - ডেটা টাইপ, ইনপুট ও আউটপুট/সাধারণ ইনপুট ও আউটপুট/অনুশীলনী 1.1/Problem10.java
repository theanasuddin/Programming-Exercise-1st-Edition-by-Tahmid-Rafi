package programmingExercise;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int totalJujubes, totalFriends;

		System.out.printf("Total number of Friends: ");
		totalFriends = scan.nextInt();
		System.out.printf("Total number of Jujubes: ");
		totalJujubes = scan.nextInt();
		scan.close();
		System.out.printf("Jujubes left: %d\n", (totalJujubes % totalFriends));

	}

}
