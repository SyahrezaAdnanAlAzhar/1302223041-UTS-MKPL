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

	public void setName(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setIsForeigner(boolean isForeigner){
		this.isForeigner = isForeigner;
	}

	public void setGender(Gender gender){
		this.gender = gender;
	}

	public void setDateInformation(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear){
		this.dateInformation = new DateInformation(yearJoined, monthJoined, dayJoined, monthWorkingInYear);
	}

	public void setFamilyInformation(String spouseName, String spouseIdNumber){
		this.familyInformation = new FamilyInformation(spouseName, spouseIdNumber);
	}

	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public String getFullName(){
		return this.firstName + " " + this.lastName;
	}

	public String getAddress(){
		return this.address;
	}

	public boolean getIsForeigner(){
		return this.isForeigner;
	}
	
	public Gender getGender(){
		return this.gender;
	}

	public DateInformation getDateInformation(){
		return this.dateInformation;
	}

	public FamilyInformation getFamilyInformation(){
		return this.familyInformation;
	}

	public FinancialInformation getFinancialInformation(){
		return this.financialInformation;
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
