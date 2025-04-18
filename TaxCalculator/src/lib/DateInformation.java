package lib;

// Class yang berisikan terkait informasi employee yang berkaitan tanggal masuk kerja dan durasi bekerja

public class DateInformation{
    private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public DateInformation(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear){
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
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
        return this.monthWorkingInYear
    }

    public void setYearJoined(int yearJoined){
        this.yearJoined = yearJoined
    }

    public void setMonthJoined(int monthJoined){
        this.monthJoined = monthJoined
    }

    public void setDayJoined(int dayJoined){
        this.dayJoined = dayJoined
    }

    public void setMonthWorkingInYear(int monthWorkingInYear){
        this.monthWorkingInYear = monthWorkingInYear
    }
}