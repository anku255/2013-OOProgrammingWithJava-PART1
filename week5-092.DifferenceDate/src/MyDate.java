


public class MyDate {

    private int day;
    private int month;
    private int year;
    private static final int YEAR_IN_DAYS = 365;
    private static final int BASE_YEAR = 1900;
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        return Math.abs(this.numberOfDays() - comparedDate.numberOfDays()) / YEAR_IN_DAYS;

    }

    public int numberOfDays() {
        int noOfDays = day;
        if (month > 1) {
            noOfDays += 30 * (month - 1);
        }

        noOfDays += ((year - 1 - BASE_YEAR) * YEAR_IN_DAYS);

        return noOfDays;
    }

}
