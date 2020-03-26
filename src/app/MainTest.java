package app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medical.CDC;
import medical.Hospital;
import medical.NotCoronaException;
import person.Patient;

public class MainTest {
	public static void main(String[] args) {
		
		// 병원 생성
		Hospital univHospital = new Hospital("University Hospital", 15, "001", 50,10);
		Hospital regularHospital = new Hospital("Regular Hospital", 3, "901", 10, 2);
		
		// 환자 생성
		Patient p1 = new Patient("David", 42, "010-1111-1111", "pneumonia", "001", true );
		Patient p2 = new Patient("Rio", 30, "010-1234-5678", "gluttony", "901", false);
		
		// 병원 Collection
		List<Hospital> hospitalList = new ArrayList<Hospital>();
		hospitalList.add(univHospital);
		hospitalList.add(regularHospital);
		
		// 환자 Collection
		Set<Patient> patientList = new HashSet<Patient>();
		patientList.add(p1);
		patientList.add(p2);
		
		// MedicalAction Test
		CDC cdc = new CDC("질병관리본부", 200,hospitalList, patientList);
		Patient p3 = new Patient("Ben", 22, "010-3333-3333", "high fever", "001", false);
		Patient p4 = new Patient("Marcus", 22, "010-3333-3333", "high fever", "001", true);
		Patient p5 = new Patient("확찐자", 20, "010-0000-0000", "기침", "001", true);
		patientList.add(p5);
		try {
		univHospital.addPatient(cdc, p3);
		univHospital.addPatient(cdc, p4);
		univHospital.addPatient(cdc, p5);
		}catch (NotCoronaException e) {
			System.out.println("Corona 환자가 아닙니다.");
		}
		System.out.println(cdc.getPatientList());

		// File Write
		String filePath = "/home/chloe/Workspace/Java/workspace_0303/KillCorona/PatientList"; 
		String fileName = "CoronaPatientList_" + LocalDate.now() +".csv";
		
		try (
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + File.separator +fileName));
		){ 
			for (Patient p : patientList) {
				writer.write(p.getName() + "^" + p.getAge() + "^" + p.getPhone());
				writer.newLine();
			}
			writer.flush();
			System.out.println("File saved - " + fileName);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
