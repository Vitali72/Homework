package Geometry;

import java.util.*;

public class ChristmasTreePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите высоту Єлки");
		int n = sc.nextInt();
		drawChristmasTree(n);
		sc.close();
	}

	private static void drawChristmasTree(int n) {
		for (int i = 0; i < n; i++) {
			triangle(i+1 , n);
		}
	}

	private static void triangle(int n, int max) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < max - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i * 2 + 1; j++) {
				if(i == (int)(Math.random() * 6))
                {
                    System.out.print("@");
                }
                else
                {
                    System.out.print("#");
                }
				
			}

			System.out.println();
		}

	}

}
