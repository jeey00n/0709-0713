package lang;

import java.io.IOException;

public class Main4 {

	public static void main(String[] args) {
//		int i;
//		long start=System.currentTimeMillis();
//		for(i=0; i<1000000;i++) {
//			System.out.println("Hello world");
//		}
//		long end=System.currentTimeMillis();
//		System.out.println("작업시간: "+(end-start));
//		//환경변수 확인하는법
//		System.out.println(System.getenv("path"));
//		//시스템 속성 확인
//		System.out.println(System.getProperty("java.version"));
		
//		Runtime r = Runtime.getRuntime();
//		try {
//			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https://www.naver.com/");
//		}
//		catch(IOException e){
//			e.printStackTrace();
//		}
		
		//Hello문자열을 뒤집어서 출력하기
		String str = "Hello";
		int size = str.length();
//		for (int i = 0; i < size; i++) {
//			char ch = str.charAt(size-i-1);
//			System.out.println(ch);
//		}
		
		//소문자를 대문자로 바꿔서 출력하기
		String result = "";
		for (int i = 0; i < size; i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<= 'z') {
				//ch = (char)ch-32;
				//산술 연산자는 기본형으로 바뀌는데 (그래서 강제형변환을 해 줘야 하는데) 
				//대입연산자는 안 바뀌나 보다. 왜 그런진 모르겠다 ㅎㅎ
				ch-=32;
			}
			result = result + ch;
		}
		System.out.println(result);
	
	}
}
