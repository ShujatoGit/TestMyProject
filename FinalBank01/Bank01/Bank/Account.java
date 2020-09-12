public abstract class Account{
	String name;
	String id;
	String dob;
	String nominee;
	double balance;

	Account(){
		
	};
	
	Account(String name,String id,String dob,String nominee,double balance){
		this.name=name;
		this.id=id;
		this.dob=dob;
		this.nominee=nominee;
		this.balance=balance;
	}
	
	
	abstract boolean  deposit(double amount);
	abstract boolean withdraw(double amount);
	
	void printAccount(){
		
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Dob :"+dob);
		System.out.println("Nominee :"+nominee);
		System.out.println("Balance :"+balance);
	}
	
	
	
}