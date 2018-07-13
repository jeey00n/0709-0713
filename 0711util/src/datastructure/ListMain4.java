package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain4 {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book book = new Book();
		book.setTitle("이것이 자바다");
		book.setAuthor("신용권");
		book.setPubdate("2015-01-05");
		book.setPrice(30000);
		list.add(book);
		
		book = new Book();
		book.setTitle("피아노 치는 여자");
		book.setAuthor("이병애");
		book.setPubdate("1983-01-01");
		book.setPrice(12000);
		list.add(book);
		
		Comparator<Book>comp = new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				Book first = (Book)o1;
//				Book second = (Book)o2;
//				return first.getPrice()-second.getPrice();
//			}
			@Override
			public int compare(Object o1, Object o2) {
				Book first = (Book)o1;
				Book second = (Book)o2;
				return first.getPrice()-second.getPrice();
			}
		};
		
		//list의 모든 데이터를 확인
		System.out.println(list);
		//각각의 데이터 확인
		for(Book temp:list) {
			System.out.println(temp);
		}
	}
}