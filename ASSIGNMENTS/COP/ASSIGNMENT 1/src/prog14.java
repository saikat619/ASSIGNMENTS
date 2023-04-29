
//Create Menu driven program for array operations.
import java.util.Scanner;

public class prog14 {

	public class prog14 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int [] arr= new int[size];
		int ch;
		do {
			System.out.println("please one of the options:"
					+"\n1:Read Array"
					+ "\n 2:Print Array"
					+ "\n 3:Search element in array "
					+ "\n4:Reverse Array "
					+ "\n5:Even number from array"
					+ "\n6:sum of array element"
					+ "\n0:exit");
			ch=sc.nextInt();
			int qty;
			switch(ch) {
			case 1:System.out.println("Enter the array elements");
			for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
			break;
			case 2:System.out.println("your array is");
			for(int n:arr) {
				System.out.println(n);
			}
			break;
			case 3:System.out.println("please enter the number you want to search:");
				 int key=sc.nextInt();
				 boolean flag= false;
				 for(int i=0;i<arr.length;i++) {
					 if(arr[i]==key) {
						 flag = true;
						 System.out.println("y"+arr[i]);
						 break;
					 }
				 }
				 	if(flag==false)
				 		System.out.println("number not found");
				 	break;
			case 4:int beg=0,end=arr.length;
			while(beg>end) {
				int temp;
				temp=arr[beg];
				arr[beg]=arr[end];
				arr[end]=temp;
				beg++;
				end--;
			}
			System.out.println("the reverse array is ");
			for(int n: arr)
				System.out.println(n);
			break;
			case 5:System.out.println("the even number in array are :");
			for (int i=0;i<arr.length;i++) {
				if (arr[i]%2==0)
					System.out.println(arr[i]);
					}
			break;
			case 6:int sum =0;
			for(int i =0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println("the sum of array is "+sum
					);
			break;
			default:System.out.println("please selct a valid choice");
			break;
					}
			}while(ch!=0);
		

	}

}
