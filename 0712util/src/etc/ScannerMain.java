package etc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
//		// 키보드로부터 한 줄을 입력받아서 출력
		Scanner sc = new Scanner(System.in);
//
//		System.out.println("한 줄 단위로 구분해서 입력받기");
//		// 한 줄을 입력받는 객체
//		String msg = sc.nextLine();
//		System.out.println(msg);
//
//		System.out.println("공백 단위로 구분해서 입력받기");
//		// 공백만 와도 끝났다고 생각한다.
//		String msg1 = sc.next();
//		System.out.println(msg1);
//
//		// 스캐너를 사용하면 마지막에는 닫아 줘야 한다.
		sc.close();
//
//		// 문자열로부터 받기
//		sc = new Scanner("Hello Java");
//		// 공백 단위로 출력된다.
//		System.out.println(sc.next());
//		System.out.println(sc.next());

		// File객체 만들기
		//파일 경로를 찾을 때 역슬래시 두 번 쓰는 것을 잊지 말자.
		File f = new File("C:\\ddd.txt");
		// 파일과 연결되는 스캐너 만들기
		try {
			sc = new Scanner(f);
			//데이터가 있을 때까지 읽음.
			//파일은 있는데 내용을 못 읽는 두 가지 경우가 있다.
			//구분문자가 없는 경우, 혹은 한글 인코딩이 서로 다른 경우.
			//한글 인코딩이 잘못되면 글자가 깨지는 것이 아니라 Scanner가 읽지 못한다.
			//공백 문자를 찾아야 하는데 인코딩이 다르면 공백문자의 인코딩 값이 달라서 읽지 못함.
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
