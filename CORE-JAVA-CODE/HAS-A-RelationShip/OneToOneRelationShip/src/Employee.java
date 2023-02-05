public class Employee {
  Integer eId;
  String eName;
  String eAddress;
  
  Account accountt;
    
    public Employee(Integer eId, String eName, String eAddress, Account accountt) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.eAddress = eAddress;
	this.accountt = accountt;
}
	public  void display()
    {
    	System.out.println("Employee Detail");
    	System.out.println("Employee id::"+eId);
    	System.out.println("Employee name::"+eName);
    	System.out.println("Employee address::"+eAddress);
    	System.out.println("Bank detail");
    	System.out.println("Account no::"+accountt.accNo);
    	System.out.println("Account name::"+accountt.accName);
    	System.out.println("Account type::"+accountt.accType);	
    }           
}