package virus;

public class Corona extends Virus{
	private String spreadSpeed;

	public Corona() {}

	public Corona(String name, int level, String spreadSpeed) {
		super(name, level);
		this.spreadSpeed = spreadSpeed;
	}

	public String getSpreadSpeed() {
		return spreadSpeed;
	}

	public void setSpreadSpeed(String spreadSpeed) {
		this.spreadSpeed = spreadSpeed;
	}
	
}
