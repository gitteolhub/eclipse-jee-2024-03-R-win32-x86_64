package thisIsJava;

public class Q5_8 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0;
		int count = 0;
		for (int[] arr : array) {
			for (int value : arr) {
				sum += value;
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println(sum);
		System.out.println(avg);
	}
}