package AccessModefile;

public class Account_{
	  private String ano;
	    private String name;
	    private int balance;
	    


		 Account_(String ano, String name, int balance) {
	        this.ano = ano;
	        this.name = name;
	        this.balance = balance;
	    }
	    
	    public String getAno() { return ano; }
	    public void setAno(String ano) { this.ano = ano; }
	    public String getname() { return name; }
	    public void setOwner(String owner) { this.name = name; }
	    public int getBalance() { return balance; }
	    public void setBalance(int balance) { this.balance = balance; }
	    public void depositBalance(int balance) { this.balance = this.balance + balance; }
	    public void withdrawBalance(int balance) { this.balance = this.balance - balance; }

		public String getOwner() {
			return null;
		}
}
