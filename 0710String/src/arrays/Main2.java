package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Book[] books = new Book[5];

		// 아직은 배열 속 데이터가 모두 null
		// for(Book temp:books) {
		// System.out.println(temp);
		// }

		// 인스턴스 생성
		books[0] = new Book();
		books[0].setTitle("이것이 자바다");
		books[0].setAuthor("신용권");
		books[0].setPubdate("2015-01-05");
		books[0].setPrice(30000);

		books[1] = new Book();
		books[1].setTitle("피아노 치는 여자");
		books[1].setAuthor("이병애");
		books[1].setPubdate("1983-01-01");
		books[1].setPrice(12000);

		books[2] = new Book();
		books[2].setTitle("코스모스");
		books[2].setAuthor("칼세이건");
		books[2].setPubdate("2005-08-05");
		books[2].setPrice(10000);

		books[3] = new Book();
		books[3].setTitle("장미의 이름");
		books[3].setAuthor("움베르토에코");
		books[3].setPubdate("1950-07-30");
		books[3].setPrice(16500);

		books[4] = new Book();
		books[4].setTitle("인간실격");
		books[4].setAuthor("다자이오사무");
		books[4].setPubdate("2001-06-20");
		books[4].setPrice(11000);

//		System.out.println("----------------------------정렬 전 데이터 출력----------------------------");
//		// 배열의 데이터 전부 출력
//		for (Book book : books) {
//			System.out.println(book);
//		}

		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 한다.
		// java에서 크기비교를 하는 메소드는 Comparable 인터페이스에 compare메소드다.
		// 직접 만든 클래스의 경우는 클래스에 Comparable인터페이스를 implements하든가,
		// Comparator 인터페이스를 implements한 인스턴스를 같이 대입해야 한다.

		Scanner sc = new Scanner(System.in);
		while (true) {
			// 비교할 Comparator 변수만 선언한다.
			Comparator<Book> comparator=null;
			System.out.println("0: 종료, 1: 제목오름차순, 2: 제목내림차순");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			} else if (menu == 1) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Book book1 = (Book) o1;
						Book book2 = (Book) o2;
						return book1.getTitle().compareTo(book2.getTitle());
					}
				};
			} 
			else if (menu == 2) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Book book1 = (Book) o1;
						Book book2 = (Book) o2;
						return book2.getTitle().compareTo(book1.getTitle());
					}
				};
			}
			Arrays.sort(books, comparator);
			//배열의 데이터를 전부 출력한다.
			for (Book book : books) {
				System.out.println(book);
			}
			System.out.println("=====================================");
		}

		sc.close();
	}

}
