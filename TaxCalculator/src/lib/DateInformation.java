package lib;
import java.time.LocalDate;
import java.time.Month;

// Class yang berisikan terkait informasi employee yang berkaitan tanggal masuk kerja dan durasi bekerja

public class DateInformation{
    private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public DateInformation(int yearJoined, int monthJoined, int dayJoined){
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = calculateMonthWorkingInYear();
    }

    public int getYearJoined(){
        return this.yearJoined;
    }

    public int getMonthJoined(){
        return this.monthJoined;
    }

    public int getDayJoined(){
        return this.dayJoined;
    }

    public int getMonthWorkingInYear(){
        return this.monthWorkingInYear;
    }

    public void setYearJoined(int yearJoined){
        this.yearJoined = yearJoined;
        this.monthWorkingInYear = calculateMonthWorkingInYear();
    }

    public void setMonthJoined(int monthJoined){
        this.monthJoined = monthJoined;
        
        this.monthWorkingInYear = calculateMonthWorkingInYear(); 
    }

    public void setDayJoined(int dayJoined){
        this.dayJoined = dayJoined;
    }

    public int calculateMonthWorkingInYear(){
        LocalDate date = LocalDate.now();

        if (date.getYear() == this.yearJoined) {
            return date.getMonthValue() - this.monthJoined;
        } else {
            return 12;
        }
    }
}