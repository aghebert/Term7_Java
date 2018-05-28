import java.util.*;

 class Account {
	 
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
public Account() {
	dateCreated = new java.util.Date();;
}
	
	public Account(int idInput, double balanceInput) {
		this();
		this.id = idInput;
		this.balance = balanceInput;
}
	
	
public int getID() {
	return id;
}

public void setID(int id)
{
  this.id = id;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance)
{
  this.balance = balance;
}

public double getAnnualInterestRate(double annualInterestRate) {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate)
{
  this.annualInterestRate = annualInterestRate;
}
 
 
 }
