package virus;

public class CoronaThread extends Thread{
	int num;
	
	public CoronaThread() {}
	public CoronaThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for (int i = 0 ; i < 10000 ; i++) {
			int j = i*100;
		}
		System.out.println(num);
	}
}
