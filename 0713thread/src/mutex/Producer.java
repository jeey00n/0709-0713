package mutex;

import java.util.*;

public class Producer extends Thread {
	private ShareData shareData;

	// 생성자
	public Producer(ShareData shareData) {
		this.shareData = shareData;
	}

	// 스레드로 동작할 메소드
	public void run() {
		for(int i = 0; i<26; i++) {
			//65에 i를 더해서 문자로 변경한 후 save 메소드에게 전달
			shareData.save((char)(65+i));
		}
	}
}
