package classImplementation;
public class Date {
	private int day,mon,yr;
	public Date() {}
	public Date(int d,int m,int y) {
		day=d;
		mon=m;
		yr = y;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMon() {
		return mon;
	}
	public void setMon(int mon) {
		this.mon = mon;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
	}
	public void show_date() {
		System.out.println(day+"-"+mon+"-"+yr);
	}

}
