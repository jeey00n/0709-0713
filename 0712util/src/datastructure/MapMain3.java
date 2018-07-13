package datastructure;

import java.util.HashMap;

public class MapMain3 {

	public static void main(String[] args) {
		// 프로야구 팀 별 선수 명단을 배열로 만들기
		String[] kia = { "윤석민", "안치홍", "김선빈" };
		String[] hanhwa = { "권혁", "정근우" };
		String[] lotte = { "레일리", "이대호" };

		// 동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은 바람직하지 않다.
		// 배열이나 리스트는 인덱스를 가지고 구분하기 때문에 의미를 부여하지 못한다.
		// 배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저 Map으로
		// 의미를 부여해서 묶은 후 다시 배열이나 리스트로 묶어야 한다.

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("team", "기아");
		map1.put("data", kia);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("team", "한화");
		map2.put("data", hanhwa);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("team", "롯데");
		map3.put("data", lotte);

		String[] nc = { "박석민", "이재학" };
		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("team", "nc");
		map4.put("data", nc);

		// HashMap의 배열
		HashMap[] players = { map1, map2, map3 };

		for (int i = 0; i < players.length; i++) {
			HashMap temp = players[i];
			// 팀 이름 출력
			//Map으로 묶어둔 데이터기 때문에, 새로 배열을 추가해도 출력문을 고칠 필요가 없다.
			System.out.print(temp.get("team") + ":" + "\t");
			// 선수 명단 가져오기
			// 출력할 땐 get한 데이터를 형변환하지 않지만 저장하거나 사용할 때는 반드시 원래 자료형으로 강제형변환 해줘야한다.
			String[] imsi = (String[]) temp.get("data");
			for (int j = 0; j < imsi.length; j++) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}

	}

}
