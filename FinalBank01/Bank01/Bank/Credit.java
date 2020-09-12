public class Credit extends DebitAccount{
	
	Credit(){
		
	}
	
	Credit(String name,String id,String dob,String nominee,double balance){
		super(name,id,dob,nominee,balance);
	}
	
	boolean deposit(double amount){
		
		if(balance+amount>=-100000){
			return true;
		}
		else{
			return false;
		}
		
		
	}
	
	boolean withdraw(double amount){
		
		if(balance-amount<=20000){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	
	
}