//경주마 게임 만들기

package thread;

import java.util.Random;

public class Horse extends Thread {
	//이 클래스로부터 만들어진 모든 인스턴스가 공유하는 변수
	public static int rank=0;
	@Override
	public void run() {
		// 스레드 이름 출력
		System.out.println(getName() + " 출발");
		
		//현재 위치를 저장할 변수
		int pos = 0;
		//랜덤한 값을 가져오기 위한 변수
		Random r =new Random();
		while (true) {
			try {
				Thread.sleep(100);
				pos = pos+r.nextInt(10);
				if(pos>300) {
					break;
				}
				//말의 위치 현황을 찍어낼 때
				//System.out.println(getName()+":"+pos);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		rank = rank +1;
		System.out.println(getName() +"번 말이 " + rank +"번째로 골인");
	}
}
