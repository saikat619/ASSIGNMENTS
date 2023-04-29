package tester;

import pkg.BankAccount;
import pkg.Person;
import java.util.Scanner;

public class bankTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount[] arr = new BankAccount[20];
		int index=0;
		int ch;
		
		
		//start of menu.
		
		
		do {
		System.out.println("please select an option:\n1.create an account"
												 + "\n2.Show account details"
												 + "\n3. Deposit money "
												 + "\n4.Withdraw money"
												 + "\n5. Money transfer"
												 + "\n0.Exit");
		ch=sc.nextInt();
		switch(ch) {
			//create account
			case 1:if (index<20) {
				System.out.println("enter the first and last name of the account holder"
								  +" enter the city and age <all fields separeated by space>");
				Person p = new Person(sc.next(),sc.next(),sc.next(),sc.nextInt());
				System.out.println("enter a starting balance amount or  press enter and default amount will be assigned to account");
				arr[index]= new BankAccount(p,sc.nextDouble());
				System.out.println("Your Account id :"+arr[index].getAccid()+"\nPlease remember this Id for future");
				System.out.println("\nAccount has been Created");
			}
			else {
				System.out.println("bank is full!!!! unable to create Account!");
			}
				break;
				//show account details
			case 2:System.out.println("please enter your account id:");
			int id=sc.nextInt();
			boolean flag=false;
			for(int i =0;i<=index;i++) {
				System.out.println("inside loop");
				if (id==arr[i].getAccid()) {
					System.out.println(arr[i]);
					flag=true;
					break;
				}	
			}
			if (flag==false) {
				System.out.println("account not found");
			}
				break;
				
				//deposit money
			case 3:System.out.println(" enter your account Id ");
			int id1 = sc.nextInt();
			boolean flag1=false;
			BankAccount b = null;
			for(int i =0;i<=index;i++) {
				if (id1==arr[i].getAccid()) {
					b=arr[i];
					flag1=true;
				}	
			}
			if (flag1==false) {
				System.out.println("account not found");
			}
			else {
			System.out.println("enter amount you want to deposit");
			b.deposit(sc.nextDouble());
			System.out.println("your account balance is"+b.getBalance());
			}
				break;
				
				//withdraw money
			case 4:System.out.println(" enter your account Id ");
			int id2= sc.nextInt();
			boolean flag2=false;
			BankAccount b1 = null;
			for(int i =0;i<=index;i++) {
				if (id2==arr[i].getAccid()) {
					b=arr[i];
					flag2=true;
				}	
			}
			if (flag2==false) {
				System.out.println("account not found");
			}
			else {
				System.out.println("enter amount you want to deposit");
				b1.deposit(sc.nextDouble());
				System.out.println("your account balance is"+b1.getBalance());
			}
				break;
				
				//money transfer
			case 5:if (index >=2) {
			System.out.println(" enter your account Id and reciever account id ");
			int sender_id= sc.nextInt();
			int reciever_id=sc.nextInt(); 
			boolean flag3=false,flag4=false;
			BankAccount reciever=null,sender = null;
			for(int i =0;i<=index;i++) {
				if (sender_id==arr[i].getAccid()) {
					sender=arr[i];
					flag3=true;
				}	
			}
			for(int i =0;i<=index;i++) {
				if (reciever_id==arr[i].getAccid()) {
					reciever=arr[i];
					flag4=true;
				}	
			}
			
			if ((flag3==false)||(flag4==false)) {
				System.out.println("account not found");
			}
			else
			{
				System.out.println("Enter the amount to transfer:");
				sender.moneytransfer(reciever,sc.nextDouble());
			}
			}
			else
				System.out.println("not enough account for money transfer");
				break;
			case 0:System.out.println(".......Thank you......."
									+ "......Visit Again......");
				break;
			default:System.out.println("Please enter a Valid choice");
		}
			
		}while(ch!=0);
	}

}
