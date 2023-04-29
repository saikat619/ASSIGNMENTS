//4:Write a program to find factorial of a given number.
import java.util.Scanner;
public class prog4{
public static void main(String[] ashish){
int a;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number you want the factorial of : \n");
a=sc.nextInt();
double fact = 1;
int i = a;
while(i>=1){
fact=fact*i;
i--;
}
System.out.println("factorial of the given number is = "+fact);
}
}