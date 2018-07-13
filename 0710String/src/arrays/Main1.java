package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// 문자열 배열 생성
		String[] subject = { "Java", "Oracle", "Web Front End", "Web Back End-Java", "Android", "iOS" };

		// subject정렬
		Arrays.sort(subject);

		// Oracle의 위치 검색
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);

		// Android의 위치검색 //subject정렬 전: 오라클은 1번이라고 잘 나오고, 안드로이드는 -1나옴.
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx);

		// for (int i=0; i<subject.length; i++) {
		// System.out.println(subject[i]);
		// }
		//위와 같은 역할을 하는 코드
		for (String temp : subject) {
			System.out.println(temp);
		}
	}
}
