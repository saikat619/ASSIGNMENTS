import java.util.Scanner;

public class prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		int item=0,bill=0;
		do {
			System.out.println("please one of the options:"
					+ "1. farmville pizza.......₹350\n"
					+ "2. margherita pizza......₹300\n"
					+ "3. tandoori pizza........₹380\n"
					+ "4. paneer pizza..........₹400\n"
					+ "5. extra cheese..........₹30\n"
					+ "0. exit");
			ch=sc.nextInt();
			int qty;
			switch(ch) {
			case 1:System.out.println("please enter the quantity:");
			qty=sc.nextInt();
			bill+=(qty*350);
			break;
			case 2:System.out.println("please enter the quantity:");
			qty=sc.nextInt();
			bill+=(qty*300);
			break;
			case 3:System.out.println("please enter the quantity:");
			qty=sc.nextInt();
			bill+=(qty*380);
			break;
			case 4:System.out.println("please enter the quantity:");
			qty=sc.nextInt();
			bill+=(qty*400);
			break;
			case 5:System.out.println("please enter the quantity:");
			qty=sc.nextInt();
			bill+=(qty*30);
			break;
			case 0:System.out.println(".....Thank You......."
									  +".....Visit Us Again......");
			break;
			default:System.out.println("please selct a valid choice");
			break;
					}
			
			
		}while(ch!=0);
		System.out.println("Your total bill is "+bill);

	}

}
