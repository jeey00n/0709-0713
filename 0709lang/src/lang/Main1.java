package lang;

public class Main1 {

	public static void main(String[] args) {
		// value형 변수 생성
		int n = 10;
		// value형의 데이터를 대입
		// n에 저장된 데이터인 10이 복사, n이 복사되는 것이 아니라서 n과는 상관이 없다.
		int x = n;

		x = 20;
		System.out.println(n);

		// 참조형 데이터의 복사 - 주소가 복사
		int[] ar = { 10, 20, 30 };
		// 10, 20, 30이 저장된 곳의 주소를 복사
		int[] br = ar;
		// 복사된 주소의 첫 번째 데이터를 1000으로 변경
		br[0] = 1000;

		System.out.println(ar[0]);

		// 참조형을 복사해 줄 때 실제 데이터를 복사해주기
		// 배열을 복사하기 위해서 새로운 공간을 생성
		int[] cr = new int[ar.length];
		// 내부 데이터를 복사
		for (int i = 0; i < ar.length; i++) {
			cr[i] = ar[i];
		}
		cr[0] = 500;
		// 이번에는 데이터를 복사해서 줬기 때문에 값을 바꾼 것이 원본에 영향을 미치지 않는다.
		System.out.println(ar[0]);
	}

}
