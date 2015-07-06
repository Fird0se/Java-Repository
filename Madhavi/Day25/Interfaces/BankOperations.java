package package25b;

public class BankOperations implements BankWithdrawl, BankDeposit {
	
	int accountId;
	String custName;
	int availableBal;
	int depositAmount;
	int withdrawlAmount;
	
	public BankOperations(){
		
		
	}
	
	public BankOperations(int accountId,String custName,int availableBal){
		this.accountId = accountId;
		this.custName = custName;
		this.availableBal = availableBal;
		
	}

	@Override
	public void deposit(int amount) {
		depositAmount = amount;
		System.out.println("enter deposited amount: " + depositAmount);
		availableBal = availableBal + depositAmount ;
		System.out.println("Balance after deposit: " + availableBal);
		
		
	}

	@Override
	public void display() {
		
		System.out.println(" AccId: " + accountId + "\nCustName: " + custName + "\nAvailableBal: " +  availableBal );
		
	}

	@Override
	public void BalCheck() {
		
		System.out.println("Available Balance: " + availableBal);
		
	}

	@Override
	public void withdrawl(int amount) {
	withdrawlAmount = amount;
	System.out.println("enter withdrawlAmount amount: " + withdrawlAmount);
		if(amount > MINIMUM_BALANCE){
			System.out.println("InSufficient Balance");
		}
		else
		availableBal = availableBal - withdrawlAmount ;
		System.out.println("Balance after withdrawl: " + availableBal);
			
	}
		
}
	
	


