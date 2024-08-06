//chatbot을 이용해 예제 만들어 공부해보기
package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GroupChatCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 조원 수에 따라 배열 크기를 조정합니다.
        String[] memberNumbers = new String[3]; // 조원1부터 조원3까지의 번호를 저장할 배열
        
        // 모든 조원을 순회하며 번호 확인
        for (int i = 0; i < memberNumbers.length; i++) {
            // 조원의 번호가 이미 있는지 확인.
        	// null은 입력을 안 한거고 isEmpty는 입력 없이 빈 값으로 엔터를 친것이라 두 가지 경우를 모두 확인해야 한다.
            if (memberNumbers[i] == null || memberNumbers[i].isEmpty()) {
                System.out.println("A가 조원" + (i + 1) + "의 번호를 확인한다.");
                System.out.print("번호가 없습니다. 번호를 입력해주세요:");
                
             // 번호 입력 받음.
                while (true) {
                    try {
                        // 입력받은 값을 숫자 형태로 변환
                        int number = scanner.nextInt();

                        // 변환 성공, 숫자 형태의 번호이므로 저장
                        memberNumbers[i] = String.valueOf(number);
                        break;
                    } catch (InputMismatchException e) {
                        // 변환 실패, 숫자 형태의 번호가 아님
                        System.err.println("숫자만 입력해주세요:");
                        scanner.next(); // 잘못된 입력을 버리고 다시 입력받기 위해 호출
                    }
                }
            }
        }
        
        // 모든 조원의 번호가 있는지 최종 확인
        boolean allNumbersPresent = true;
        for (String number : memberNumbers) {
            if (number == null || number.isEmpty()) {
                allNumbersPresent = false;
                break;
            }
        }
        
        // 모든 조원의 번호가 있을 경우
        if (allNumbersPresent) {
            System.out.println("모든 조원의 번호가 확인되었습니다. 그룹 채팅방을 생성합니다.");
        } else {
            System.out.println("모든 조원의 번호가 확인되지 않았습니다. 다시 번호를 확인하세요.");
        }
        
        scanner.close();
    }
}