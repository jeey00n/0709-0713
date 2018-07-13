package etc;

import java.util.ArrayList;
import java.util.Random;

public class SlotMain {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("!");
		list.add("@");
		list.add("#");
		list.add("$");
		list.add("%");
		list.add("^");
		list.add("&");
		list.add("*");

		String slot = new String();
		// slot에 null을 입력하면 값을 불러오거나 연산할 수 없기 때문에 에러가 난다.
		Random r = new Random();
		// list에 있는 모양 3개를 랜덤하게 추출해서 slot에 추가
		for (int i = 0; i < 3; i++) {
			slot = slot + list.get(r.nextInt(list.size()));
		}
		System.out.println(slot);

		// 3개의 문자가 동일한지 확인하기
		if (slot.charAt(0) == slot.charAt(1) && slot.charAt(1) == slot.charAt(2)) {
			System.out.println(slot.charAt(0) + "이 3개");
		}

		// 앞의 2개 문자만 동일한지 확인
		else if (slot.charAt(0)==slot.charAt(1)) {
			System.out.println(slot.charAt(0)+"이 2개");
		}
		// 그 이외의 경우
		else {
			System.out.println("꽝 다음 기회에");
		}
	}

}
