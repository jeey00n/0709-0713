package etc;

import java.sql.Date;
import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// 1994년 11월 2일을 Calendar 객체로 만들기
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 1994);
		birth.set(Calendar.MONTH, 10);
		birth.set(Calendar.DAY_OF_MONTH, 2);
		//Date date = new Date(birth.getTimeMillis());
		
		Calendar toDay = Calendar.getInstance();
		long gap = toDay.getTimeInMillis()-birth.getTimeInMillis();
		System.out.println("내가 태어난 지 " + (gap/24/60/60/1000)+"일째 되는 날");
		

	}

}
