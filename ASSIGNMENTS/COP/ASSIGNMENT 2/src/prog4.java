import java.util.Scanner;
public class prog4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		System.out.println("enter book id:");
		b.Setid(sc.nextInt());
		System.out.println("enter book name:");
		b.Setbname(sc.next());
		System.out.println("enter book author:");
		b.Setauthor(sc.next());
		System.out.println("enter book price:");
		b.Setprice(sc.nextDouble());
		System.out.println("book id:"+b.Getid());
		System.out.println("book name: "+b.GetBname());
		System.out.println("author's name:"+b.GetAuthor());
		System.out.println("Price:"+b.GetPrice());
	}
	

}
