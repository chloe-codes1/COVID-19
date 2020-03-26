package person;

public class Patient extends Person{
	
	private String diseaseName;
	private String hospitalId;
	boolean isCorona;
	
	public Patient() {}
	
	public Patient(String name, int age, String phone,String diseaseName, String hospitalId, boolean isCorona) {
		super(name,age,phone);
		this.diseaseName = diseaseName;
		this.hospitalId = hospitalId;
		this.isCorona = isCorona;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public boolean isCorona() {
		return isCorona;
	}

	public void setCorona(boolean isCorona) {
		this.isCorona = isCorona;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + this.getName().hashCode();
		hash = 31 * hash + this.getPhone().hashCode();
		return hash;
	}
	
	
	// name, phone 두 가지가 같으면 같은 Patient 
	@Override
	public boolean equals(Object obj) {
		Patient p = (Patient) obj;
		if(this.getName().contentEquals(p.getName()) && this.getPhone().equals(p.getPhone())) {
			return true;
		}
		return false;
	}
	
	
}