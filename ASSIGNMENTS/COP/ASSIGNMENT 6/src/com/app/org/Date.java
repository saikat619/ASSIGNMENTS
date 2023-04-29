package com.app.org;
import com.Interface.IPrintable;
import java.util.Scanner;
public class Date implements IPrintable {
	private int day,mon,yr;
	public void Data(int d,int m,int y) {
		day=d;
		mon=m;
		yr = y;
	}
	public void getdate(int d,int m,int y) {
		day=d;
		mon=m;
		yr = y;
	}
	@Override
	public void print() {
		System.out.println(day+"-"+mon+"-"+yr);
	}
	@Override
	public boolean isEquals(Object obj) {
		Date d = (Date)obj;
		if (this.day==d.day && this.mon==d.mon&&this.yr==d.yr)
			return true;
		else
		return false;
	}

}
