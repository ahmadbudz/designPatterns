package proxy;

public  class RealBankAccount implements BankAccount{
	
	private double balance;
	private String name;
	private String id;
	
	
    public RealBankAccount(double balance, String name, String id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

	@Override
	public double checkBalance() {
		return this.balance;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getID() {
		return this.id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
