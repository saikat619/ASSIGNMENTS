import java.util.Scanner;
public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Point p = new Point();
		System.out.println("enter X-coordinate:");
		p.SetX(sc.nextInt());
		System.out.println("enter Y-coordinate:");
		p.SetY(sc.nextInt());
		System.out.println("point p :");
		p.DisplayPoint();
		

	}

}
