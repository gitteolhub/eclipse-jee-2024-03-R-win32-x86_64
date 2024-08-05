package practice;
import java.util.Scanner;
import java.math.BigInteger;
public class ThisIsJava4_7 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		BigInteger balance = BigInteger.ZERO;
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			String menuChoice = scan.nextLine();
			switch (menuChoice) {
			case "1":
				try {
					System.out.print("예금액>");
					BigInteger deposit = new BigInteger(scan.nextLine());
					if (deposit.compareTo(BigInteger.ZERO) > 0) {
						balance = balance.add(deposit);
					}
					else {
						System.err.println("올바른 금액을 입력하세요");
					}
				}
				catch (NumberFormatException e) {
					System.err.println("숫자로 입력하시오");
				}
				break;
			case "2":
				try {
					System.out.print("출금액>"); 
					BigInteger withdraw = new BigInteger(scan.nextLine());
					if (withdraw.compareTo(BigInteger.ZERO) > 0 && withdraw.compareTo(balance) <= 0) {
						balance = balance.subtract(withdraw);
					}
					else {
						System.err.println("잔액이 부족합니다 혹은 잘못된 금액입니다");
					}
				}
				catch (NumberFormatException e) {
					System.err.println("숫자로 입력하세요");
				}
				break;
			case "3":
				System.out.println("잔고>" + balance);
				break;
			case "4":
				run = false;
				break;
			default:
				System.err.println("1, 2, 3, 4 중 하나로 입력하세요");
				break;
			}
			System.out.println();
		}
		scan.close();
		System.out.println("프로그램 종료");
	}
}