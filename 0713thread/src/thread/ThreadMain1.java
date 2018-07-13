package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		// 앞에서 만든 클래스의 인스턴스를 만들고 run메소드를 호출
//		ThreadEx1 th1 = new ThreadEx1();
//		th1.run();
//		ThreadEx1 th2 = new ThreadEx1();
//		th2.run();
		
		//스레드로 실행
		ThreadEx1 th1 = new ThreadEx1();
		th1.setDaemon(true);
		//보통 때는 일을 안 하고, 다른 작업이 있을 때만 일을 하는 친구들.
		//데몬이 아니면 자기 작업이 끝날 때까지 자기 일을 수행한다.
		//다운로드 프로그램 같은 경우 데몬으로 만들지 않으면 종료를 시킬 수 없는 것..
		th1.start();
		ThreadEx1 th2 = new ThreadEx1();
		th2.setDaemon(true);
		th2.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("작업 종료");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
