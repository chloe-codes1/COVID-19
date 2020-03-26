package medical;
import java.util.List;
import java.util.Set;

import person.Patient;

public class CDC extends Organization{
	
	private List<Hospital> hospitalList;
	private Set<Patient> patientList;
	
	public CDC() {}
	public CDC(String name, int employeeCount, List<Hospital> hospitalList, Set<Patient> patientList) {
		super(name, employeeCount);
		this.hospitalList = hospitalList;
		this.patientList = patientList;
	}
	public List<Hospital> getHospitalList() {
		return hospitalList;
	}
	public void setHospitalList(List<Hospital> hospitalList) {
		this.hospitalList = hospitalList;
	}
	public Set<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}
	
	public void about() {
		System.out.println("Organization - CDC : " + super.getName());
	}
	
	public void about(String more) {
		about();
		System.out.println("We manage Hospital and Patients");
	}
}
