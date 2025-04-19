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
        LocalDate date = LocalDate.now();

        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = date.getMonthValue() - monthJoined;
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
    }

    public void setMonthJoined(int monthJoined){
        LocalDate date = LocalDate.now();
        this.monthJoined = monthJoined;
        this.monthWorkingInYear = date.getMonthValue() - monthJoined;
    }

    public void setDayJoined(int dayJoined){
        this.dayJoined = dayJoined;
    }
}