package Geometry;

import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ 1-� �������  ");
		int rows = sc.nextInt();
		System.out.println("������� ������ 2-� ������� ");
		int col = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {

				if (i == 0 || i == rows - 1 || j == 0 || j == col - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println(" ");
		}
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("$ ");
			}

			System.out.println();

			sc.close();
		}
	}
}
