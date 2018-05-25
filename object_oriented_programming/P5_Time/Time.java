package P5_Time;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		String h = (""+hour).length() == 2 ? "0"+hour : ""+hour;
		String m = (""+minute).length() == 2 ? "0"+minute : ""+minute;
		String s = (""+second).length() == 2 ? "0"+second : ""+second;
		
		return h + ":" + m + ":" + s;
	}

	public Time nextSecond() {
		Time another = new Time(hour, minute, second + 1);
		return another;
	}

	public Time previousSecond() {
		Time another = new Time(hour, minute, second - 1);
		return another;
	}
}
