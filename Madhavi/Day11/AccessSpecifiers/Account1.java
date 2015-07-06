
public class Account1 {
	
	private int accountNum;
	private int customerId;
	private int availableBal;
	private int depositAmount;
	private int withdrawAmount;
	
	public void initializeMembers(int custId,int accNum,int avalBal){   //initializing members
		accountNum = accNum;
		customerId = custId;
		availableBal = avalBal;
		
	}
	public void display(){												// displaying information
		
		System.out.println(" customerId is " + customerId + "\n" + " accountNumber is " + accountNum + " \n "+"AvailableBalance Before Deposit " + availableBal);
	}
	
	public void deposit(int amount){								   // deposit
		
		depositAmount = amount;
		System.out.println("enter deposited amount: " + depositAmount);
		availableBal = availableBal + depositAmount ;
		System.out.println("Balance after deposit: " + availableBal);
			
	}
	
	public void withdraw(int amount){								// withdrawl
		
		withdrawAmount = amount;
		System.out.println("available balance before withdrawl: " + availableBal);
		System.out.println("enter withdrawl amount: " + withdrawAmount);
		availableBal = availableBal - withdrawAmount ;
		System.out.println("balance after withdrawl: " + availableBal);
	}
	
	
	

}
