interface Account
{
	void withdraw();
	void deposit();
}
abstract class saving implements Account
{
	public void withdraw() {
		System.out.println("withdraw");
	}
}
class current extends saving
{
	public void deposit()
	{
		System.out.println("deposit");
	}
}
public class Interface {

	public static void main(String[] args) {
	  Account a=new current();
	  a.withdraw();
	  a.deposit();
	}
}
