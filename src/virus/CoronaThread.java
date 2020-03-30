package virus;

public class CoronaThread extends Thread{
	int num;
	
	public CoronaThread() {}
	public CoronaThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("thread try start");
			Thread.sleep(5000);
			System.out.println("thread try end");
		} catch (InterruptedException e) {
			System.out.println("thread interrupted raised");
		}
		System.out.println(num);
	}
}
