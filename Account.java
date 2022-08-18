public class Account
{
	private long accountnumber;
	private String  Name;
	private String Email;
	private float Amount;
	 public long getaccountnumber(){
		 return accountnumber;
	 }
	 public void setaccountnumber(long accountnumber){
		 this.accountnumber=accountnumber;
	 }
	 public String getName(){
		 return Name;
	 }
	 public void setName(String Name){
		 this.Name=Name;
	 }
	 public String getEmail(){
		 return Email;
	 }
	 public void setEmail(String Email){
		 this.Email=Email;
		
	 }
	 public float getAmount(){
		 return Amount;
	 }
	 public void setAmount(float Amount){
		 this.Amount=Amount;
	 }
	public static void main(String args[]){
		Account acc=new Account();
		acc.setaccountnumber(234567778l);
	    acc.setName("tanuja");
		acc.setEmail("tanujab754@gmail.com");
		acc.setAmount(23000f);
		System.out.println("Accountnumber."+acc.getaccountnumber());
		System.out.println("account name:"+acc.getName());
		System.out.println("account holder email();"+acc.getEmail());
		System.out.println("amount in acc:"+acc.getAmount());
	}
}
				