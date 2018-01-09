package Number;

public class Digit2 {
	public static void main(String[] args) {

		sum(3, 4, 6);
		System.out.println(getArgSum(3, 4, 6, 7, 4, 5));
		printDigits(7);
	}

	private static double getArgSum(int... varargs) {
		double sum = 0;
		int k = 0;
		for (int i : varargs) {
			sum += i;
			k++;
		}
		return sum / k;

	}

	private static void sum(int a, int b, int c) {
		double sum = a + b + c;
		System.out.println(sum / 3);

	}

	private static void printDigits(int a) {
		for (int i = 0; i < a; i++)
			System.out.print(i + " ");

	}

}