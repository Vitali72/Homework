package Geometry;

import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество строк ");
		int rows = sc.nextInt();
		sc.close();
		equilateralTriangle(rows);
		equilateralTriangleHollow(rows);
		rightTriangle(rows);
		rightTriangleHollow(rows);
	}

	private static void equilateralTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (i * 2 - 1); k++) {

				System.out.print(" *");

			}
			System.out.println();
		}
		System.out.println();
	}

	private static void rightTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");

			}
			System.out.println();
		}
		System.out.println();
	}

	private static void equilateralTriangleHollow(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (i * 2 - 1); k++) {
				if (i == rows || k == 1 || k == (2 * i - 1)) {
					System.out.print(" *");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void rightTriangleHollow(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == rows || j == i || j == 1) {
					System.out.print(" *");
				} else {

					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
