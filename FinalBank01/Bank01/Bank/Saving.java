public class Saving extends Account{
	
	Saving(){
		
	}
	
	Saving(String name,String id,String dob,String nominee,double balance){
		super(name,id,dob,nominee,balance);
	}
	
	boolean deposit(double amount){
		
		return true;
	}
	
	boolean withdraw(double amount){
		
		if(balance>=amount){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	
	
}