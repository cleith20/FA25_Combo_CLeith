
public class Time {
	private int hour;
	private int minute;
	private double seconds;
	
	//default
	public Time()
	{
		this.hour = 0;
		this.minute = 0;
		this.seconds = 0.0;
	}
	//values constructor

	public Time(int hour, int minute, double seconds) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSeconds() {
		return seconds;
	}

	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	
	public static void printTime(Time t)
	{
		System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.seconds);
	}
	
	public boolean equals(Time that)
	{
		final double DELTA = 0.001;
		return this.hour == that.hour && this.minute == this.minute && 
				Math.abs(this.seconds - that.seconds) < DELTA;
	}

	public Time add(Time that)
	{
		Time sum = new Time();
		sum.hour = this.hour + that.hour;
		sum.minute = this.minute + that.minute;
		sum.seconds = this.seconds + that.seconds;
	
		if(sum.seconds >= 60.0)
		{
			sum.seconds -= 60.0;
			sum.minute ++;
		}
		if(sum.minute >= 60)
		{
			sum.minute -= 60;
			sum.hour ++;
		}
		if(sum.hour >= 24)
		{
			sum.hour -= 24;
		}
		return sum;
	}
	
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n", hour, minute, seconds);
	}
	
	
}
