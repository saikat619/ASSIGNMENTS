package aashish_saikat01;
import java.util.Scanner;
public class prog7 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want the sum of the series: ");
		n= sc.nextInt();
		int ans = ((n*(n+1))/2);
		System.out.println("the sum of "+ n +" natural number is = "+ans );
	}
	

}
