import java.util.Scanner;

public class prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("enter the size of 2nd array");
		int size1 = sc.nextInt();
		int [] arr1= new int[size1];
		System.out.println("Enter the 1st array elements");
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter the 2nd array elements");
		for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
		}
		int[] arr2 = new int[size+size1];
		for (int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		for (int i=arr.length;i<(arr1.length+arr.length);i++) {
			arr2[i]=arr1[i-(arr.length)];
		}
		for(int n:arr2) 
			System.out.println(n);
	}

}
