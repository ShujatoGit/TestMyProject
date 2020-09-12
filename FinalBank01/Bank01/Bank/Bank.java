import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Bank{
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Date date1 = new Date();
		DateFormat dateformat =new SimpleDateFormat("YYYY-MM-SSSS");
		
		
		  String j = dateformat.format(date1);
		
		Date date2 = new Date();
		DateFormat dateformat1=new SimpleDateFormat("dd/MM/YYYY");
		
		
		  String f = dateformat1.format(date2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Account a1;

		
		System.out.printf("Enter NAME : ");
		String n1=in.nextLine();
		System.out.printf("Enter ID : "+j);
		String i1=in.nextLine();
		System.out.printf("Enter DOB :"+f);
		System.out.println();
		System.out.printf("Enter Nominee :");
		String no1=in.nextLine();
		System.out.printf("Enter Balance :");
		double b1=in.nextDouble();
	    System.out.println();
		
		
		System.out.println("For DebitAccount enter 1 ");
		System.out.println("For CreditAccount enter 2 ");
		System.out.println("For Saving enter 3 ");
		
		int k=in.nextInt();
		
		switch(k){
			
			case 1 :
				
		a1=new DebitAccount(n1,j,f,no1,b1);
		System.out.printf("Enter deposit for Debit class amount(deposit):");
		double n=in.nextDouble();
		boolean x = a1.deposit(n);
		
		System.out.printf("Enter Withdraw for Debit class amount(withdraw) :");
		double m=in.nextDouble();
		boolean y= a1.withdraw(m);
		
		a1.printAccount();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		break;
		
		
		
		
		case 2 :
	  
		a1=new Credit(n1,j,f,no1,b1);
		System.out.printf("Enter deposit for Credit class amount(deposit):");
		double o=in.nextDouble();
		boolean c = a1.deposit(o);
		System.out.printf("Enter Withdraw for Credit class amount(Wuthdraw):");
		double p=in.nextDouble();
		boolean d= a1.withdraw(p);
		a1.printAccount();
		System.out.println(c);
		System.out.println(d);
		System.out.println();
			break;
			
		case 3 : 
		
		a1=new Saving(n1,j,f,no1,b1);
		System.out.printf("Enter deposit for Saving class amount(deposit):");
		double q=in.nextDouble();
		System.out.printf("Enter Withdraw for Saving class amount(Withdraw):");
		
		double r=in.nextDouble();
		
		a1.printAccount();
		boolean s = a1.deposit(q);
		boolean v= a1.withdraw(r);
		System.out.println(s);
		System.out.println(v);
		System.out.println();
		break;
		}
	}
	
}