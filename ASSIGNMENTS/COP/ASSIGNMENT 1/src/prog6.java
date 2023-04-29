//Check if number is a prime number or not.
import java.util.Scanner;
public class prog5{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in); 
	int a;
	System.out.println("enter the number you want to check");
	 a = sc.nextInt();
	boolean flag = true;
	for (int i=2;i<a;i++){
	
	if (a%i==0){
		flag=false;
		break;
		}
	}
if (flag==false)
System.out.println("not a prime number ");
else 
System.out.println("prime number");
}
