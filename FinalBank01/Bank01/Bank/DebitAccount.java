public class DebitAccount extends Account{
	
	DebitAccount(){
		
	}
	
	DebitAccount(String name,String id,String dob,String nominee,double balance){
		super(name,id,dob,nominee,balance);
	}
	
	boolean deposit(double amount){
		
	if(amount<=20000&&amount+balance<=100000){
				return true;
			}
		
	
	
	else{
			return false;
		}
		
	}
		boolean withdraw(double amount){
		
	      if(amount<=2000&&balance>=amount){
			 
					  return true;
			
			  
		  }
		  
		  
		else{
			return false;
		}
	}
	
	
	
}	