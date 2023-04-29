
public class Book {
private int id; String bname;String author;double price;
public  Book() {
	System.out.println("Book has been created");
	
}
public Book(int id,String bname,String author,double price) {
	this.id=id;
	this.bname =bname;
	this.author=author;
	this.price=price;
}
public void Setid(int id) {this.id=id;}
public void Setbname(String bname) {this.bname=bname;}
public void Setauthor(String author) {this.author=author;}
public void Setprice(double price) {this.price=price;}
public int Getid() {return id;}
public String GetBname() {return bname;}
public String GetAuthor() {return author;}
public double GetPrice() {return price;}
public void DisplayBookDetails() {
	System.out.println("Book Name:"+bname);
	System.out.println("Book ID:"+id);	
	System.out.println("Author:"+author);	
	System.out.println("Price = "+price);	
}
}
