package thisIsJava;

import java.util.Scanner;

public class Q5_9 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = null;
        boolean run = true;
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
                        } else {
                            System.out.println("학생수는 1명 이상이어야 합니다.");
                        }
                        break;
                    case "2":
                        if (scores == null) {
                            System.out.println("먼저 학생수를 입력해주세요");
                            break;
                        }
                        for (int i = 0; i < scores.length; i++) {
                            System.out.print("scores[" + i + "]> ");
                            String input = scan.nextLine();
                            try {
                                int score = Integer.parseInt(input);
                                if(score >= 0) {
                                    scores[i] = score;
                                } else {
                                    System.out.println("점수는 0 이상이어야 합니다.");
                                    i--; // 다시 입력받기 위해 인덱스 감소
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("유효한 숫자를 입력하세요.");
                                i--; // 다시 입력받기 위해 인덱스 감소
                            }
                        }
                        break;
                    case "3":
                        if (scores == null) {
                            System.out.println("먼저 학생수를 입력해주세요");
                            break;
                        }
                        for (int i = 0; i < scores.length; i++) {
                            System.out.println("scores[" + i + "]: " + scores[i]);
                        }
                        break;
                    case "4":
                        if (scores == null) {
                            System.out.println("먼저 학생수를 입력해주세요");
                            break;
                        }
                        int highscore = 0;
                        int sum = 0;
                        for (int i = 0; i < scores.length; i++) {
                            sum += scores[i];
                            if (scores[i] > highscore) {
                                highscore = scores[i];
                            }
                        }
                        double avg = (double) sum / scores.length;
                        System.out.println("최고 점수: " + highscore);
                        System.out.println("평균 점수: " + avg);
                        break;
                    case "5":
                        run = false;
                        break;
                    default:
                        System.out.println("1, 2, 3, 4, 5 중 하나로 입력하시오");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력하시오");
            }
        }
        scan.close();
        System.out.println("프로그램 종료");
    }
}