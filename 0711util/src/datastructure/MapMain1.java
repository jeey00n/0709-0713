package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "태연");
		map.put("age", 30);
		map.put("company", "SM");
		// 동일한 키로 다시 저장하면 업데이트가 된다.
		// SM은 없어지고 SM Town으로 저장되는 것이다.
		map.put("company", "SM Town");

		// company 키의 값을 출력
		System.out.println(map.get("company"));
		// 없는 키의 이름을 사용하면 null을 리턴
		System.out.println(map.get("position"));

		// 모든 데이터를 조회하기
		Set<String> keys = map.keySet();
		for (String a : keys) {
			System.out.println(a + ": " + map.get(a));
		}
	}
}
