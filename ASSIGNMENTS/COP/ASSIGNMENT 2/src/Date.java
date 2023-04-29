import java.util.Scanner;
public class Date {
	private int day,mon,yr;
	public void Date(int d,int m,int y) {
		day=d;
		mon=m;
		yr = y;
	}
	public void getdate(int d,int m,int y) {
		day=d;
		mon=m;
		yr = y;
	}
	public void show_date() {
		System.out.println(day+"-"+mon+"-"+yr);
	}

}
