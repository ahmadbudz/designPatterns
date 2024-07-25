package proxy;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new ProxyBankAccount(2000,"ahmad","123hhmb");
		 
		System.out.println("my balance is: " + account.checkBalance());
		System.out.println("my account name is: " + account.getName());
		System.out.println("my account id is: " + account.getID());
	}

}
