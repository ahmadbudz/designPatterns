package proxy;

public class ProxyBankAccount implements BankAccount {
	private RealBankAccount realBankAccount;
	private double balance;
	private String name;
	private String id;
	 
    public ProxyBankAccount(double balance, String name, String id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

	@Override
	public double checkBalance() {
		if (realBankAccount == null) {
			realBankAccount = new RealBankAccount(balance,name,id);
		}
		return realBankAccount.checkBalance();
	}

	@Override
	public String getName() {
		if (realBankAccount == null) {
			realBankAccount = new RealBankAccount(balance,name,id);
		}
		return realBankAccount.getName();
	}

	@Override
	public String getID() {
		if (realBankAccount == null) {
			realBankAccount = new RealBankAccount(balance,name,id);
		}
		return realBankAccount.getID();
	}

}
