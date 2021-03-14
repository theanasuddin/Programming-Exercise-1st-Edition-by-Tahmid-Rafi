package programmingExercise;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a. cm to inch
		float cm = 12.5f;
		float inch = 0.3937f * cm;
		System.out.printf("a. %.2f cm = %.2f inch\n", cm, inch);

		// b. inch to cm
		inch = 4.92f;
		cm = inch / 0.3937f;
		System.out.printf("b. %.2f inch = %.2f cm\n", inch, cm);

		// c. feet to meter
		float feet = 4.92f;
		float meter = feet / 3.2808f;
		System.out.printf("c. %.2f feet = %.2f meter\n", feet, meter);

		// d. meter to feet
		meter = 1.50f;
		feet = meter * 3.2808f;
		System.out.printf("d. %.2f meter = %.2f feet\n", meter, feet);

		// e. pound to kg
		float lb = 158.73f;
		float kg = lb / 2.2046f;
		System.out.printf("e. %.2f lb = %.2f kg\n", lb, kg);

		// f. kg to pound
		kg = 72.00f;
		lb = kg * 2.2046f;
		System.out.printf("f. %.2f kg = %.2f lb\n", kg, lb);

		// g. km to mile
		float km = 42.35f;
		float mile = km * 0.62137f;
		System.out.printf("g. %.2f km = %.2f mile\n", km, mile);

		// h. mile to km
		mile = 26.32f;
		km = mile / 0.62137f;
		System.out.printf("h. %.2f mile = %.2f km\n", mile, km);

		// i. km/h to mile/h
		km = 42.35f;
		mile = km * 0.62137f;
		System.out.printf("i. %.2f km/h = %.2f mile/h\n", km, mile);

		// j. mile/h to km/h
		mile = 26.32f;
		km = mile / 0.62137f;
		System.out.printf("j. %.2f mile/h = %.2f km/h\n", mile, km);
	}
}
