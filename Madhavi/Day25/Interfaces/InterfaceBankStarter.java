package package25b;

public class InterfaceBankStarter {

	public static void main(String[] args) {
		
		BankOperations b1 = new BankOperations(10011, "Carls", 3000);
		b1.display();
		b1.BalCheck();
		b1.deposit(1000);
		b1.BalCheck();
		b1.withdrawl(200);
		System.out.println();
		
		b1 = new BankOperations(10012, "Jhonny", 5000);
		b1.deposit(1000);
		b1.display();
		System.out.println();
		
		BankOperations b2 = new BankOperations(10013, "Jessie", 7000);
		b2.withdrawl(7700);
		b2.display();
		System.out.println();
		
		BankOperations b3;
		b3 = b1;
		b3.deposit(300);
		b3.display();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		

	}

}
