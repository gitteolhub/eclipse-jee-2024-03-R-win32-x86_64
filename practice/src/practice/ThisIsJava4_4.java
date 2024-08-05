package practice;
public class ThisIsJava4_4{
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		while(a+b != 5) {
			a = (int)(Math.random()*6) + 1;
			b = (int)(Math.random()*6) + 1;
			System.out.println("(" + a + ", " + b + ")");
		}
	}
}