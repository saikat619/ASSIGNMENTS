
//Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;

public class prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("enter three numbers you want to find the greatest of:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if (a>b) {
		if (a>c)
			System.out.println(a+" is greatest");
		else
			System.out.println(c+" is greatest");
	}
	else {
		if (b>c)
			System.out.println(b+" is greatest");
		else
			System.out.println(c+" is greatest");
	}
	
	}

}
