
//Write a program to check entered number is Armstrong number or not.
import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num you want to check for armstrong number :");
		num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			int rem = temp % 10;
			temp /= 10;
			sum = sum + (rem * rem * rem);
		}
		if (sum ==num)
			System.out.println("the number is an armstrong number ");
		else
			System.out.println("the number is not an armstrong number ");
	}

}
