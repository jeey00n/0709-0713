package lang;

public class Main3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i <= 3) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
