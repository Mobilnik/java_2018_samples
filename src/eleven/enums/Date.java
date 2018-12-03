package eleven.enums;

public class Date {
    public static class MonthConstants {
        public static final int JANUARY = 0;
        public static final int FEBRUARY = 1;
        //...
    }

    private int monthInt;
    private int year;

    private Month month;

    public Date(int monthInt, int year) {
        this.monthInt = monthInt;
        this.year = year;
    }


    public Date(Month month, int year) {
        this.month = month;
        this.year = year;
    }


    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonthInt() {
        return monthInt;
    }

    public void setMonthInt(int monthInt) {
        this.monthInt = monthInt;
    }


    @Override
    public String toString() {
        return "Date{" +
                "monthInt=" + monthInt +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
