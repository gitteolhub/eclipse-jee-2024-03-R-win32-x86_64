package thisIsJava;

public class Q5_7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = array[0];
		for (int arr : array) {
			if (arr > max) {
				max = arr;
			}
		}
		System.out.println(max);
	}
}