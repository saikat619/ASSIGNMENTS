//Write a  program to find sum of all even and odd numbers between 1 to n. 
import java.util.Scanner;
public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number upto which you want to have the even and odd sum of numbers: ");
		n = sc.nextInt();
		int sum_even = 0,sum_odd = 0;
		for(int i=0;i<=n;i++) {
			if (i%2!=0)
				sum_odd+=i;
			else
				sum_even+=i;
		}
		System.out.println("sum of odd number ="+ sum_odd);
		System.out.println("sum of even number ="+ sum_even);
	}

}
