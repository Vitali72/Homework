package Number;

import java.util.Scanner;

public class Digit4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число ");
		int a = sc.nextInt();
		factorial(a);
		factorial1(a);
		System.out.println("число простое? = " + isPrime(a));
		multipliers(a);
		sc.close();
	}

	private static int factorial(int x) {

		if (x == 1) {

			return 1;
		} else {

			return x * factorial(x - 1);
		}
	}

	private static void factorial1(int a) {
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f *= i;
		}
		System.out.println(f);
	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;

		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0)
				return false;
		}

		return true;
	}
	
	    private static void multipliers(int n) {
	        int a = 2;
	        while (a <= n) {
	            if ((n % a) == 0) {
	                if (a != n) {
	                    System.out.print(a + " ");
	                    multipliers(n / a);
	                } else {
	                    System.out.print(a);
	                }
	                return;
	            }
	            a++;
	        }
	    }
	
}