package prob1;

public class Sort {
	public static void main(String[] arg) {
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count = array.length;
		int count1 = 0;
		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		//
		// 선택 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		while (count1 <= array.length) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] >= array[i + 1]) {
					count1++;
				} else {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					count1 = 0;
				}
			}
		}
		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

	}
}