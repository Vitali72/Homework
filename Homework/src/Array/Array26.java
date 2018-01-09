package Array;

public class Array26 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) ((Math.random() * 199) - 99);
				System.out.print(arr[i][j] + "\t ");
			}
			System.out.println(" ");
		}
		System.out.println("Поменять местами столбцы");
		for (int i = 0; i < arr.length; i++) {

			int temp;

			temp = arr[i][1];
			arr[i][1] = arr[i][4];
			arr[i][4] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t ");
			}
			System.out.println(" ");
		}
		System.out.println("Поменять местами строки");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int temp;

				temp = arr[1][j];
				arr[1][j] = arr[3][j];
				arr[3][j] = temp;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t ");
			}
			System.out.println(" ");
		}
		System.out.println("Суммы диагоналей массива");
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i][i];
		}
		for (int i = 0, j = arr[i].length - 1; i < arr.length; i++, j--) {

			sum2 += arr[i][j];

		}
		System.out.println("Суммы диагоналей массива " + sum1 + " " + sum2);
	}

}
