package Number;

import java.util.Scanner;

public class Digit3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите два числа ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Большее число = " + largeofDigits(a, b));
		System.out.println("a mod b = " + modofDigits(a, b));
		System.out.println(equalsofDigit(a, b));
		System.out.println("НОK= " + LCM(a, b));
		System.out.println("НОД= " + GCF(a, b));
		sc.close();
	}

	private static int largeofDigits(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	private static int modofDigits(int a, int b) {

		return (a % b);

	}

	private static boolean equalsofDigit(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	/**39, 65
	 * Calculate Lowest Common Multiplier
	 */
	public static int LCM(int a, int b) {
		return (a * b) / GCF(a, b);
	}

	/**36, 27
	 * Calculate Greatest Common Factor
	 */
	public static int GCF(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GCF(b, a % b);
		}
	}
}
