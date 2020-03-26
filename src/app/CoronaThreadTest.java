package app;

import virus.CoronaRunnable;
import virus.CoronaThread;

public class CoronaThreadTest {
	public static void main(String[] args) {
		for (int i = 0 ; i <1000 ; i++) {
			CoronaRunnable cr = new CoronaRunnable(i);
			Thread t = new Thread(cr);
			// Thread 동작시키기
			t.start();
		}
		System.out.println("-----------------------");
		for (int i = 0 ; i <1000 ; i++) {
			CoronaThread ct = new CoronaThread(i);
			ct.start();
		}
		
	}
}
