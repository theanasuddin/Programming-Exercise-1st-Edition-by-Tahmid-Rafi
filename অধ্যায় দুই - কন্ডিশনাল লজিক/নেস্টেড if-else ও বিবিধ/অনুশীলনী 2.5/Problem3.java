package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int anindita_birth_date, anindita_birth_month, anindita_birth_year, maliha_birth_date, maliha_birth_month,
				maliha_birth_year;

		System.out.printf("Anindita's birth date: ");
		anindita_birth_date = scan.nextInt();
		System.out.printf("Anindita's birth month: ");
		anindita_birth_month = scan.nextInt();
		System.out.printf("Anindita's birth year: ");
		anindita_birth_year = scan.nextInt();
		System.out.printf("Maliha's birth date: ");
		maliha_birth_date = scan.nextInt();
		System.out.printf("Maliha's birth month: ");
		maliha_birth_month = scan.nextInt();
		System.out.printf("Maliha's birth year: ");
		maliha_birth_year = scan.nextInt();
		scan.close();

		if (anindita_birth_year > maliha_birth_year) {
			System.out.printf("Maliha is elder.\n");
		} else if (anindita_birth_year < maliha_birth_year) {
			System.out.printf("Anindita is elder.\n");
		} else if (anindita_birth_year == maliha_birth_year) {
			if (anindita_birth_month > maliha_birth_month) {
				System.out.printf("Maliha is elder.\n");
			} else if (anindita_birth_month < maliha_birth_month) {
				System.out.printf("Anindita is elder.\n");
			} else if (anindita_birth_month == maliha_birth_month) {
				if (anindita_birth_date > maliha_birth_date) {
					System.out.printf("Maliha is elder.\n");
				} else if (anindita_birth_date < maliha_birth_date) {
					System.out.printf("Anindita is elder.\n");
				} else if (anindita_birth_date == maliha_birth_date) {
					System.out.printf("Anindita and Maliha has same age.\n");
				}
			}
		}

	}

}
