package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {
		// 이름과 나이 및 소속 회사를 저장하는 Map을 생성
		//HashMap은 key의 순서를 알 수 없다.
		//HashMap<String, Object> map = new HashMap<>();
		//저장한 순서대로 출력하는 LinkedHashMap
		//LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		//키의 순서대로 출력하는 TreeMap
		TreeMap<String, Object> map = new TreeMap<>();
		
		//key 이름을 틀리는 경우가 있기 때문에 초보자의 경우는 Map을 쓸 때 어려움을 겪기도 한다.
		map.put("name", "아이린");
		map.put("age", 28);
		map.put("company", "SM");
		
		//전체를 한꺼번에 출력 - toString이 재정의되어 있다.
		System.out.println(map);
		//순서에 상관없이 항목별로 출력
		System.out.println("================================");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+": " + map.get(key));
		}
	}
}
