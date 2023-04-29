package com.bank;

public class BankAccount {
	public static String organisation;
	public static int totalCustomers;
	private int actid;
	public static int actIDcounter;
	private AcType at;
	private String name;
	private String email;
	private Date doO;
	private double balance;
	private Locker locker;
	
	static {
		organisation="AXIS BANK";
		totalCustomers=0;
		actIDcounter=1000;
	}

	public BankAccount(AcType at, String name, String email, Date doO, double balance) {
		
		this.at = at;
		this.name = name;
		this.email = email;
		this.doO = doO;
		this.balance = balance;
	    actIDcounter++;
		this.actid=actIDcounter;
		totalCustomers++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getTotalCustomers() {
		return totalCustomers;
	}

	public int getActid() {
		return actid;
	}

	public AcType getAt() {
		return at;
	}

	public Date getDoO() {
		return doO;
	}

	public double getBalance() {
		return balance;
	}
	
	private Locker getLocker() {	
		return locker;		
	}

	@Override
	public String toString() {
		return "BankAccount deatils: actid:" + actid +" type:"+ at + "name:" + name + " email:" + email + " opening date:=" + doO
				+ " balance=" + balance;
	}
	public void withdraw(double amt)
	{
		balance=balance-amt;
		System.out.println("Rs."+amt+" withdrawn from account "+ actid+" new balance:Rs."+balance);
	}
	public void deposit(double amt)
	{
		balance=balance+amt;
		System.out.println("Rs."+amt+" deposited in account "+ actid+" new balance:Rs."+balance);
	}
	
	public void transfer(BankAccount receiver,double amt)
	{
		receiver.balance+= amt;
		this.balance-=amt;
		System.out.println("money transferred successfully");
		System.out.println("your current balance is Rs."+balance);
	}
	public void assignLocker(int duration) {
		locker=new Locker(duration);
		System.out.println(getLocker());
		System.out.println("locker charges are Rs."+(locker.charges*duration));
		withdraw((locker.charges*duration));
	}
	
	private class Locker{
		private int lockerid=100;
		private int duration;
		private double charges=1000;
		
		private Locker(int duration) {
			this.duration=duration;
			this.lockerid=++lockerid;
		}
		@Override
		public String toString() {
			return "lockerID:"+lockerid+" duration(months):"+duration;
		}
	}
	
	
	
	

}
