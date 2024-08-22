package thisIsJava;

import java.util.Scanner;

public class Q5_9 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		boolean scoreEntered = false;
		int[] scores = null;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			String menuChoice = scan.nextLine();
			try {
				switch (menuChoice) {
				case "1":
					System.out.print("학생수> ");
					int studentCount = Integer.parseInt(scan.nextLine());
					if (studentCount > 0) {
						scores = new int[studentCount];
					}
					else {
						System.out.println("학생수는 1명 이상이어야 합니다");
					}
					break;
				case "2":
					if (scores == null) {
						System.out.println("먼저 학생수를 입력하세요");
						break;
					}
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						int score = Integer.parseInt(scan.nextLine());
						if (score >= 0) {
							scores[i] = score;
						}
						else {
							System.out.println("점수는 0 이상이어야 합니다");
							i--;
						}
					}
					scoreEntered = true;
					break;
				case "3":
					if (scores == null) {
						System.out.println("먼저 학생수를 입력하세요");
						break;
					}
					else if (!scoreEntered) {
						System.out.println("먼저 점수를 입력하세요");
						break;
					}
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);
					}
					break;
				case "4":
					if (scores == null) {
						System.out.println("먼저 학생수를 입력하세요");
						break;
					}
					else if (!scoreEntered) {
						System.out.println("먼저 점수를 입력하세요");
						break;
					}
					int sum = 0;
					int highscore = 0;
					for (int i = 0; i <scores.length; i++) {
						sum += scores[i];
						if (scores[i] > highscore) {
							highscore = scores[i];
						}
					}
					System.out.println("최고 점수: " + highscore);
					System.out.println("평균 점수: " + (double) sum / scores.length);
					break;
				case "5":
					run = false;
					break;
				default:
					System.out.println("1, 2, 3, 4, 5 중 하나로 입력하세요");
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("숫자로 입력하시오");
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}
}