package virus;

public class CoronaRunnable implements Runnable{

	int num;
	
	public CoronaRunnable() {}
	
	public CoronaRunnable(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for (int i =0 ; i< 10000 ; i++) {
			if (i % 1000 == 0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(num);
	}
}
