package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		// 정수 List와 문자열 List의 정렬
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(40);
		list1.add(30);
		list1.add(35);

		Comparator<Integer> comp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer first = (Integer) o1;
				Integer second = (Integer) o2;
				return first - second;
				// 앞에서 뒤를 빼면 오름차순, 뒤집으면 내림차순.
			}
		};
		list1.sort(comp);
		// List는 toString이 재정의되어 있어서 인스턴스를 출력하면 데이터가 순서대로 toString을 호출한다.
		System.out.println(list1);

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("테일러 스위프트");
		list2.add("마이 케미컬 로맨스");
		list2.add("에이브릴 라빈");

		Comparator<String> comp1 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String first = (String) o1;
				String second = (String) o2;
				return first.compareTo(second);
				// sort를 반대로 하고 싶으면 first와 second의 위치를 바꿔 주면 된다.
			}
		};
		list2.sort(comp1);
		System.out.println(list2);
	}
}
