package lang;

public class Main2 {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNum(1);
		user1.setName("아이린");
		
		//중괄호는 배열을 만들 때만 줄 수 있다. 대입할 때 바로 중괄호를 사용해서 입력할 수 없다.
		//user1.setHobbies({"노래", "춤"}); (X)
		String [] hobbies1 = {"노래", "춤"};
		user1.setHobbies(hobbies1);
		//toString을 호출해서 내부 내용 확인
		System.out.println(user1);
		
		//user1의 데이터가 저장된 곳의 주소를 user2에 복사
		User user2 = user1;
		user2.setNum(2);
		//인스턴스도 참조형이기 때문에 user2의 내용을 바꾸면 user1의 내용이 바뀌게 된다.
		System.out.println(user1);
		
		
		User user3 = user1.clone();
		user3.setNum(3);
		user3.setName("수지");
		user3.getHobbies()[0] = "연기";
		System.out.println(user1);
		System.out.println(user3);
		
	}

}
