package practice;

public class For_star_24_06_21 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i-1; j++) {
				//System.out.print(" ");
			}
			
			for (int j=1; j<=9; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
