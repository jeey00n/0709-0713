package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//HashSet: 중복 불가. 저장 순서에 상관없는 출력 순서.
		//TreeSet: 중복 불가. 크기 순서(알파벳 순서로 출력됨!)
		//LinkedHashSet: 중복 불가. 저장한 순서로 출력됨.
		TreeSet<String> song=new TreeSet<>();
		song.add("Thank you for the venom");
		song.add("Vampire Money");
		song.add("Kill All your friends");
		song.add("Vampire Money");
		song.add("Welcome to the Black parade");
		song.add("Cancer");
		song.add("Distroya");
		for(String s : song) {
			System.out.println(s);
		}
	}

}
