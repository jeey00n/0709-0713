package lang;

import java.util.Scanner;

public class ExerciseHomework {

	public static void main(String[] args) throws Exception {
		// //2번 문제
		// int i, j;
		// for (i = 0; i < 5; i++) {
		// if (i < 2) {
		// for (j = 0; j <= 2 - i; j++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }
		// else {
		// for(j=0;j<=i-2;j++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }
		// }

		// // 3번 문제
		// int i = 0, j = 0, k = 0;
		//
		// for (i = 0; i < 6; i++) {
		// for (j = 0; j < 11; j++) {
		// if (i == 5) {
		// System.out.printf("%2d",k++);
		// if (k ==10)
		// k = 0;
		// } else if (j == 5 - i) {
		// System.out.printf("%2d", k++);
		// if (k ==10)
		// k = 0;
		// } else if (j == 5 + i) {
		// System.out.printf("%2d", k++);
		// if (k == 10)
		// k = 0;
		// } else {
		// System.out.print(" ");
		// }
		// }
		// System.out.println("");
		// }

		// 4번 문제

		// 문자열을 입력받아서 모두 소문자로 변환해서 출력하시오 - 공백은 모두 제거하세요.
		// ex) 입력: "HeL lo " 출력: "hello"
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.");
		String input = sc.nextLine();
		int size = input.length();

		input = input.toLowerCase();

		for (int i = 0; i < size; i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				System.out.print("");
			}else {
				System.out.print(ch);
			}
		}
		sc.close();
	}
}