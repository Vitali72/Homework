package Number;

import java.util.Scanner;

public class Digit1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������� 4 ������� ");
		int n = sc.nextInt();
		sc.close();

		int i = 0, odd = 0, even = 0, t = n;
		while (t > 0) {
			t = t / 10;
			i++;
		}
		System.out.println("���������� ��������= " + i);
		while (i > 0) {
			if (i % 2 == 0) {
				odd += n % 10;
				n /=  10;
			} else {
				even += n % 10;
				n /= 10;
			}
			i--;
		}
		System.out.println(" ����� �������� ��������= " + odd + " ����� ������ ��������= " + even);

	}

}
