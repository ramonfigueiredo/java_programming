package P4_Date;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31)
			this.day = day;
		else
			System.out.println("The value of the day is incorrect. Value must be between 1 and 31.");
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 31)
			this.month = month;
		else
			System.out.println("The value of the day is incorrect. Value must be between 1 and 12.");
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 9999)
			this.year = year;
		else
			System.out.println("The value of the year is incorrect. Value must be between 1900 and 9999.");
	}

	public void setDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	@Override
	public String toString() {
		return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
	}
}
