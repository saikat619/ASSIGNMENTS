
public class ComplexNumber {
private int real,imag;
public void SetReal(int x) {real=x;}
public void  SetImag (int y) {imag=y;}
public int  GetReal () {return real;}
public int  GetImag () {return imag;}
public void DisplayNumber() {
	System.out.println(real+" +i"+imag);
}


}
