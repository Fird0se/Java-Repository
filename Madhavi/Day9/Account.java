
public class Account {
	int accountNum;
	int customerId;
	int availableBal;
	int depositAmount;
	int withdrawAmount;
	
	public void initializeMembers(int custId,int accNum,int avalBal){			// initializing information
		accountNum = accNum;
		customerId = custId;
		availableBal = avalBal;
		
	}
	
	public void display(){													// displaying information
		
		System.out.println(" customerId is " + customerId + "\n" + " accountNumber is " + accountNum + " \n "+"AvailableBalance is " + availableBal);
	}
	
	

}
