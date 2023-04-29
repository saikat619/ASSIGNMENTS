//Write a program to find m to the power n.
import java.util.Scanner;
public class prog5{
public static void main(String[] args){
int base,power;
int ans=1;
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of base = ");
base=sc.nextInt();
System.out.println("enter the power = ");
power=sc.nextInt();
for (int i=0;i<power;i++){
ans*=base;
}
System.out.println(base+"^"+power +"="+ans);
}
}