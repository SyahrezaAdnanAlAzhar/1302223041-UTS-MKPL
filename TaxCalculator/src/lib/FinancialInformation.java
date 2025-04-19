package lib;

public class FinancialInformation{
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public FinancialInformation(){
    }

    /**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

    public void setMonthlySalary(int grade, boolean isForeigner) {
        int baseSalary;

        switch (grade) {
            case 1:
                baseSalary = 3000000;
                break;
            case 2:
                baseSalary = 5000000;
                break;
            case 3:
                baseSalary = 7000000;
                break;
            default:
                baseSalary = 0;
        }

        if (isForeigner) {
            baseSalary *= 1.5;
        }

        this.monthlySalary = baseSalary;
    }
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setOtherMonthlyIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

    public int getMonthlySalary(){
        return this.monthlySalary;
    }

    public int getOtherMonthlyIncome(){
        return this.otherMonthlyIncome;
    }

    public int getAnnualDeductible(){
        return this.annualDeductible;
    }
}