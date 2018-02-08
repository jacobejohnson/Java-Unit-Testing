//Jacob Johnson
//jejohnson8@dmacc.edu
package model;
//moneyMarket class that sets values for deposit, rate, and years
public class moneyMarket {
	
	private double deposit;
	private double rate;
	private int years;
	
	public moneyMarket() {
		
	}
	
	public moneyMarket(double d, double r, int y) {
		setDeposit(d);
		setRate(r);
		setYears(y);
	}
	
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	//performs calculation for total balance of the money market account
	public double totalBalance() {
		double totalBalance = 0;
		for (int i = 1; i <= years; i++) {
			deposit += (deposit*rate);
		}
		totalBalance = deposit;
		return totalBalance;
	}
	
	

}
