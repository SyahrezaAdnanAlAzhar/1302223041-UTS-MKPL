package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String address;
	private boolean isForeigner;
	private Gender gender;
	private DateInformation dateInformation;
	private FamilyInformation familyInformation;
	private FinancialInformation financialInformation;

	public static enum Gender {
		Laki-Laki,
		Perempuan
	}
	
	public Employee(String employeeId, String firstName, String lastName, String address, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.isForeigner = isForeigner;
		this.gender = gender;
		this.financialInformation = new FinancialInformation();
	}

	public void setDateInformation(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear){
		this.dateInformation = new DateInformation(yearJoined, monthJoined, dayJoined, monthWorkingInYear);
	}

	public void setFamilyInformation(String spouseName, String spouseIdNumber){
		this.familyInformation = new FamilyInformation(spouseName, spouseIdNumber);
	}
	
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
