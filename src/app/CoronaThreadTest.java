package app;

import virus.CoronaRunnable;
import virus.CoronaThread;

public class CoronaThreadTest {
	public static void main(String[] args) {

		CoronaRunnable cr = new CoronaRunnable(2020);
		Thread t = new Thread(cr);
		// Thread 동작시키기
		t.start();
	
		try {
			// main thread 가 t에 간섭
			// : t thread 가 끝나면 main thread가 깨어난다
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
//		System.out.println("-----------------------");
//		for (int i = 0 ; i <1000 ; i++) {
//			CoronaThread ct = new CoronaThread(i);
//			ct.start();
//		}
		System.out.println("main thread end");
	}
}
