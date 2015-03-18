

class networtherror extends Exception{
	networtherror(String s){
		super(s);
	}	
}

class 







public class bank {
	
	int checkings=0;
	int savings=0;
	int debt=0;
	int net_worth=0;
	
	bank(int checkings, int savings, int debt){
		this.checkings=checkings;
		this.savings=savings;
		this.debt=debt;	
		net_worth=checkings+savings+debt;
	}
	
	bank(){
		checkings=0;
		savings=0;
		debt=0;
		net_worth=0;
	}
	
	public void net_worth_inc(int plus){
		net_worth=net_worth+plus;	
	}
	
	public void net_worth_dec(int minus) throws networtherror{
		if (net_worth-minus<0){throw new networtherror("Net Worth Error");}
		else{net_worth=net_worth-minus;}
	}
	
	public void net_worth_dec_checker(int minus){
		try{
			net_worth_dec(minus);
		}
		catch(networtherror error){
			System.out.println("we have found net worht error");
			
		}
		
		
		
		
		
	}
	
	public static void main(String args[]){
		bank test= new bank();
		test.net_worth_dec_checker(10);
		
		
	}
	
	
	
	
	
	
	
	
}