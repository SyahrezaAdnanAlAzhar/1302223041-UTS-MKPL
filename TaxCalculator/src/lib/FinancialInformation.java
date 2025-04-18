package lib;

public class FinancialInformation{
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public void setMonthlySalary(int grade, boolean isForeigner) {	
		if (grade == 1) {
			this.monthlySalary = 3000000;
			if (isForeigner) {
				this.monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			this.monthlySalary = 5000000;
			if (isForeigner) {
				this.monthlySalary = (int) (5000000 * 1.5);
			}
		}else if (grade == 3) {
			this.monthlySalary = 7000000;
			if (isForeigner) {
				this.monthlySalary = (int) (7000000 * 1.5);
			}
		}
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