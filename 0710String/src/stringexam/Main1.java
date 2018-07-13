package stringexam;

public class Main1 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		// x: 200 y: 100 형식의 문자열 만들기
		String str = String.format("x:%d y:%d", x, y);
		// 사용법은 printf와 동일하다.
		System.out.println(str);

		String msg = "I like Java";
		// 위의 문자열에서 java 포함여부 확인 - 대소문자 구분x
		//찾는 문자나 문자열이 없으면 -1을 리턴.
		int idx = msg.toLowerCase().indexOf("java".toLowerCase());
		if (idx >= 0) {
			System.out.println("java가 존재합니다.");
		} else {
			System.out.println("java가 존재하지 않습니다.");
		}

		// msg의 문자열을 공백을 기준으로 분할해서 하나씩 출력
		String[] ar = msg.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		// msg의 3번째부터 7번째 글자까지 출력하기(시작위치, 종료위치+1)
		String sub = msg.substring(3,8);
		System.out.println(sub);
		
	}

}
