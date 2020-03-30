package virus;

public class RedBloodThread extends Thread {
	Cell cell;
	
	public RedBloodThread() {}
	public RedBloodThread(Cell cell) {
		this.cell = cell;
	}
	
	@Override
	public void run() {
		synchronized (cell) {
			cell.power = cell.power + 100;
			cell.notifyAll();
		}
		System.out.println("RedBlood : " + cell.power);
	}
}
