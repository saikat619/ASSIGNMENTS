//2:Write a program to adddition of two numbers 
import java.util.Scanner;
public class prog2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter any two number you want to add");
int a = sc.nextInt();
int b = sc.nextInt();
int c = a+b;
System.out.println("addition of the number is = "+c);
}
}