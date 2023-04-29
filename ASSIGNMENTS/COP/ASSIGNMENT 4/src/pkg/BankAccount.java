package pkg;

public class BankAccount {
	private int acc_id;
	private Person p;
	private double acc_balance;
	private static int acc_count = 1000;
	public BankAccount() {
		acc_id = acc_count;
		acc_count++;
		p = new Person();
		acc_balance = 10000;
	}
	public BankAccount(Person p) {
		acc_id = acc_count;
		acc_count++;
		this.p = p;
		acc_balance = 10000;
	}

	public BankAccount(Person p, double bal) {
		acc_id = acc_count;
		acc_count++;
		this.p = p;
		acc_balance = bal;
	}

	public void setPerson(Person a) {
		p = a;
	}

	public int getAccid() {
		return acc_id;
	}

	public double getBalance() {
		return acc_balance;
	}

	public Person getPerson() {
		return p;
	}

	public double withdraw(double amount) {
		acc_balance -= amount;
		return acc_balance;
	}

	public double deposit(double amount) {
		acc_balance += amount;
		return acc_balance;
	}

	public void moneytransfer(BankAccount b, double amount) {
		this.acc_balance = b.deposit(amount);
		this.withdraw(amount);
	}
	public String toString() {
		return "\nAccount id:"+acc_id+p.toString()+"\nAccount balance:"+acc_balance;
	}
}
