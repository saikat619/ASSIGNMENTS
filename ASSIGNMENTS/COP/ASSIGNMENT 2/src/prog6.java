import java.util.Scanner;
public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ComplexNumber z= new ComplexNumber();
		System.out.println("enter the real part of the complex number:");
		z.SetReal(sc.nextInt());
		System.out.println("enter the imaginary part of the complex number:");
		z.SetImag(sc.nextInt());
		z.DisplayNumber();
		}

}
