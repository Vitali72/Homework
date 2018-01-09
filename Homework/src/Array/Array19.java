package Array;

public class Array19 {

	public static void main(String[] args) {
		System.out.println("создание массива");
		int arr[] = new int[10];
		int sum = 0, sum1 = 0, sum2 = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0 || i == 0) {
				sum += arr[i];
			}
			if (arr[i] % 2 == 0) {
				sum1 += arr[i];
			}
			if (arr[i] > 5) {
				sum2 += arr[i];
			}
		}
		int maxel = arr[0], min = arr[0];
		for (int i = 0; i < 10; i++) {

			if (maxel < arr[i]) {
				maxel = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println();
		System.out.println("сумма элементов на четных позициях=" + sum + " сумма четных элементов=" + sum1
				+ " сумма элементов, которые больше 5= " + sum2 + " maxel+min=" + (maxel + min));
	}
}
