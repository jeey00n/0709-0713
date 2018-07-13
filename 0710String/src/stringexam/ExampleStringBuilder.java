package stringexam;

import java.util.ArrayList;
import java.util.HashMap;

public class ExampleStringBuilder {
	//static메소드 안에 만들지 않는다.
	enum GENDER{
		//GENDER라는 이름으로 묶어 둔 것. 이름은 의미있는 것으로 준다.
		MAN, WOMAN;
	}

	
	public static void main(String[] args) {
		String[] station = { "광화문", "종로3가", "을지로4가" };
		for (int i = 0; i < station.length; i++) {
			System.out.println(station[i]);
		}
		
		ArrayList <Integer/*int라고 쓸 수 없음*/> al = new ArrayList<>();
		
		HashMap<String, String> hm = new HashMap<>();
		
		//0이면 남자 1이면 여자
		
		final int MAN = 0;
		final int WOMAN = 1;
		
		int gender = 1;
		if (gender == MAN) {
			
		}else {
			
		}
		
	}
}