package medical;

import java.util.List;

import person.Patient;

public interface MedicalAction {
	void addPatient (CDC cdc, Patient p) throws NotCoronaException;
	void removePatient (CDC cdc,Patient p);
	void writeReport (List<Patient> pList);
}
