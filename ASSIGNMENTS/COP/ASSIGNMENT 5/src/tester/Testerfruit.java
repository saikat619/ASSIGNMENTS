package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class Testerfruit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of fruit basket");
		int size = sc.nextInt();
		Fruit[] arr = new Fruit[size];
		int ch = 0, index = 0;
		do {
			System.out.println("please enter a choice " + "\n1.add mango" + "\n1.add orange" + "\n1.add apple"
					+ "\n4.display name of all fruit in the basket" + "\n5.dissplay all fresh fruit"
					+ "\n6.mark a fruit stale" + "\n7.mark all sour fruit stale"
					+ "\n8.To see special function of each fruit");
			ch = sc.nextInt();
			switch (ch) {
			case 1://adding Mango
				if (index < size) {
					System.out.println("enter the weight and true or false if the fruit is fresh or not");
					arr[index] = new Mango(sc.nextDouble(), sc.nextBoolean());
					index++;
				} else
					System.out.println("basket is full");
				break;

			case 2://adding orange
				if (index < size) {
					System.out.println("enter the weight and true or false if the fruit is fresh or not");
					arr[index] = new Orange(sc.nextDouble(), sc.nextBoolean());
					index++;
				} else
					System.out.println("basket is full");
				break;

			case 3://adding orange
				if (index < size) {
					System.out.println("enter the weight and true or false if the fruit is fresh or not");
					arr[index] = new Apple(sc.nextDouble(), sc.nextBoolean());
					index++;
				} else
					System.out.println("basket is full");
				break;

			case 4://displaying names of fruits in basket
				System.out.println("The fruits in the basket are");
				for (Fruit f : arr) {
					if (f != null)
						System.out.println(f.getName());
				}
				break;

			case 5://displaying details of all fresh fruits in basket
				System.out.println("Displaying details of all freash fruits in basket");
				for (Fruit f : arr) {
					if (f != null && f.isFresh()==true)
						System.out.println(f + f.Taste());
				}
				break;

			case 6://marking fruit stale
				System.out.println("enter the number of the fruit you want to amrk as stale");
				int ind = sc.nextInt();
				try {
					arr[ind].setFresh(false);
				} catch (NullPointerException n) {
					System.out.println("enter a valid number of the fruit in the basket");
				}
				break;

			case 7://marking sour fruits stale
				System.out.println("marking all fruits as sour");
				for (Fruit f : arr) {
					if (f != null) {
						if(f.Taste().equals("sour"))
						f.setFresh(false);
				}
				}
				break;

			case 8://fruit functionality
				System.out.println("displaying all fruit functionality");
				for (Fruit f : arr) {
					if (f != null) {
						if (f instanceof Mango)
							((Mango) f).pulp();
						if (f instanceof Apple)
							((Apple) f).jam();
						if (f instanceof Orange)
							((Orange) f).juice();
						;
					}
				}
			}

		} while (ch != 0);
	}

}
