package programmingExercise;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 10000, janani_bank_total_interest, urmi_bank_total_interest;

		janani_bank_total_interest = ((principal * 3.5) / 100) * ((12 / 6) * 3);
		urmi_bank_total_interest = ((principal * 2.0) / 100) * ((12 / 4) * 3);

		if (janani_bank_total_interest > urmi_bank_total_interest) {
			System.out.printf("উপকৃত হলেন।\n");
		} else {
			System.out.printf("ক্ষতিগ্রস্ত হলেন।\n");
		}
	}
}
