package Array;

import java.util.Scanner;

public class Array20 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите шаг сдвига элементов массива вправо < 10 ");
		int k = sc.nextInt();
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("переворот");
		for (int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("попарная смена элементов");
		for (int i = 0; i < arr.length; i += 2) {
			int tmp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = tmp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("сдвиг вправо");
		for (int i = arr.length - 1; i > 0; i--) {
			int tmp = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = tmp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("сдвиг вправо на " + k + " элементов");

		for (int i = 0; i < k; i++) {
			int tmp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = tmp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Поиск отрезка с возрастанием");
		int arrnew[] = new int[10];
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int t = 1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[t] != arr[i]) {
				arrnew[t] = arr[i];
				t++;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrnew[i] + " ");
		}
	}
}
