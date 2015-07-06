package package25a;

import java.util.Scanner;

public class BonusStarter {

	public static void main(String[] args) {
		
		EmpInfo ob1;
		ob1 = new BonusConsultancy(1, "Tessy", 5000);
		ob1.display();
		ob1.getBonus();
		System.out.println();
		
		EmpInfo ob2 = new BonusFullTime(1, "Daisy", 5500);
		ob2.display();
		ob2.getBonus();
		System.out.println();
		
		BonusFullTime ob3 = new BonusFullTime(3, "Jorgan", 4000);
		ob3.display();
		ob3.getBonus();
		System.out.println();
		
		BonusConsultancy ob4 = new BonusConsultancy(4, "Mille", 3000);
		ob4.display();
		ob4.getBonus();

	}

}
