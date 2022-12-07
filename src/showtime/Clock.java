package showtime;

public class Clock {
	private int seconds, minutes, hours;
	private char[] squares;
	
	public Clock(int h, int m, int s) {
		seconds = s;
		minutes = m;
		hours = h;
	}
	
	public void setTime(String s) {
		char[] arr = s.toCharArray();
		int[] values = {1, 1, 2, 3, 5};
		squares = arr;
		seconds = 0;
		minutes = 0;
		hours = 0;
		
		for(int i=0; i<values.length; i++) {
			if(arr[i]=='r') {
				hours += values[i];
			}
			
			else if(arr[i]=='g') {
				minutes += values[i]*5;
			}
			
			else if(arr[i]=='b') {
				seconds += values[i]*5;
			}
			
			else if(arr[i]=='y') {
				hours += values[i];
				minutes += values[i]*5;
			}
			else if(arr[i]=='m') {
				hours += values[i];
				seconds += values[i]*5;
			}
			else if(arr[i]=='c') {
				minutes += values[i]*5;
				seconds += values[i]*5;
			}
			else if(arr[i]=='w') {
				hours += values[i];
				minutes += values[i]*5;
				seconds += values[i]*5;
			}
		}
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public boolean equals(Clock o) {
		return (hours==o.getHours()&&minutes==o.getMinutes()&&seconds==o.getSeconds());
	}
}
