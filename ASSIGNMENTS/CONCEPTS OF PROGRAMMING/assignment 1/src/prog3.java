//3:Write a program to swap two numbers.
import java.util.Scanner;
public class prog3{
public static void main(String[] arg){
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number you want to swap");
a= sc.nextInt();
b=sc.nextInt();
System.out.println("before swapping : a= "+a+"b= "+b);
int temp;
temp = a;
a = b;
b = temp;
System.out.println("after swapping: a = " + a + "b = "+b);
}
}
