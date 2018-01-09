package Number;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число ");
		int n = sc.nextInt();
		sc.close();
		int i = 0, sum = 0, max = 0, rev = 0;
		while (n > 0) {
			sum += n % 10;
			if (n % 10 > max) {
				max = n % 10;
			}
			int t = n % 10;
			rev = 10 * rev + t;
			n = n / 10;
			i++;
		}
		System.out.println(
				"Количество разрядов= " + i + " Сумма= " + sum + " Наибольшая цифра= " + max + " Зеркало= " + rev);
	}

}
