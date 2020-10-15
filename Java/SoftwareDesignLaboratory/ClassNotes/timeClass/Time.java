package timeClass;

public class Time {
	
	private int hour; //0 - 24
	private int minute; //0 - 60
	private int second; //0 - 60
	
	//default constructor 
	public Time() {
//		setHour(0);
//		setMinute(0);
//		setSecond(0);
		this(0,0,0);
	}
	
	//non-default constructor 
	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) 
			throw new IllegalArgumentException(
					"Time, minute, or seconds are out the range");
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	
	//copy constructor 
	public Time(Time time) {
		//invoking constructor with three parameters
		this(time.hour, time.minute, time.second);
	}
	
	//hour
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour >= 24 ) 
			throw new IllegalArgumentException(
					"Time is out the range");
		this.hour = hour;
	}

	//minute
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute >= 24 ) 
			throw new IllegalArgumentException(
					"Minute is out the range");
		this.minute = minute;
	}

	//second
	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 24 ) 
			throw new IllegalArgumentException(
					"Second is out the range");
		this.second = second;
	}
	
	//convert to string in universal time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02s", hour, minute, second);
	}
	
	//convert to string in standard time format (HH:MM:SS AM/PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12)? 12 : hour%12), 
				minute , second, (hour < 12 ? "AM": "PM"));
	}
	
	
	
}
