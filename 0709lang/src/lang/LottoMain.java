package lang;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		// 1부터 45까지 중복되지 않는 6개의 정수 저장, 데이터를 저장할 배열 생성
		int[] lotto = new int[6];
		// 배열의 데이터 개수를 저장할 변수
		int size = lotto.length;
		// 인덱스 변수
		int i, j;
		Scanner sc = new Scanner(System.in);

		// 배열의 전체 데이터 순회
		for (i = 0; i < size; i++) {
			try {
				System.out.println("숫자를 입력하세요.");
				String temp = sc.nextLine();
				lotto[i] = Integer.parseInt(temp);
				/*
				 * if (!(lotto[i]>=1 && lotto[i]<=45)){
				 * System.out.println("1부터 45 사이의 숫자만 입력하세요."); i = i - 1; continue;
				 */
				if (lotto[i] < 1 || lotto[i] > 45) {
					System.out.println("1부터 45 사이의 숫자만 입력하세요.");
					i = i - 1;
					continue;
				}
				for (j = 0; j <= i-1; j++) {
					//이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					if (lotto[i] == lotto[j]) {
						System.out.println("중복된 숫자를 입력하셨습니다.");
						i = i - 1;
						break;
					}
				}
				//이전 데이터와 방금 입력된 데이터가 동일하면
				if(j != i) {
					System.out.println("중복된 숫자를 입력하셨습니다.");
					i = i - 1;
					continue;
				}
			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				i = i - 1;
				// 한 회를 무효처리하기 위한 방법.
			}
		}						

		// 스캐너 객체 닫기
		sc.close();
		// 배열의 모든 데이터 출력
		for (i = 0; i < size; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
