package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	public int getAnnualIncomeTax(Employee employee) {
		FinancialInformation fin = employee.getFinancialInformation();
        FamilyInformation fam = employee.getFamilyInformation();
        DateInformation dateInfo = employee.getDateInformation();

		int monthlySalary = fin.getMonthlySalary();
        int otherMonthlyIncome = fin.getOtherMonthlyIncome();
        int deductible = fin.getAnnualDeductible();

		boolean isMarried = fam.getSpouseIdNumber() != null && !fam.getSpouseIdNumber().isEmpty();
		int numberOfChildren = fam.getNumberOfChildren();

		int numberOfMonthWorking = dateInfo.getMonthWorkingInYear();

		if (numberOfMonthWorking > 12) {
            System.err.println("More than 12 months working per year");
        }

        if (numberOfChildren > 3) {
            numberOfChildren = 3;
        }

		int nonTaxableIncome = 54000000;
        if (isMarried) {
            nonTaxableIncome += 4500000 + (numberOfChildren * 1500000);
        }

        int netIncome = ((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible;
        int tax = (int) Math.round(0.05 * (netIncome - nonTaxableIncome));

        return Math.max(tax, 0);
	}	
}
