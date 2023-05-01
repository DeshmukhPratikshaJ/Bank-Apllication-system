package com.bank;

import java.time.LocalDate;

import com.BankEnum.AcType;

public class BankAccount {
	public static String organisation;
	public static int totalCustomers;
	private int actid;
	public static int actIDcounter;
	private AcType at;
	private String name;
	private String email;
	private LocalDate doO;
	private double balance;
	private Locker locker;
	
	static {
		organisation="AXIS BANK";
		totalCustomers=0;
		actIDcounter=1000;
	}

	public BankAccount(AcType at, String name, String email, LocalDate doO, double balance) {
		
		this.at = at;
		this.name = name;
		this.email = email;
		this.doO = doO;
		this.balance = balance;
	    actIDcounter++;
		this.actid=actIDcounter;
		totalCustomers++;
	}
	
//	//primary key=actid+acType----------so overloaded constructor using composite key
//public BankAccount(int actid,AcType at) {
//	this.at = at;
//		this.actid=actid;
//	}
	
//----------unique email----so it is primary key-- overloaded ctor--
	public BankAccount(String email,AcType at)
	{
		this.email=email;
		this.at=at;
	}
	
	//----------------------override toString----------------------
	@Override
	public String toString() {
		return "BankAccount deatils: actid:" + actid +" type:"+ at + "name:" + name + " email:" + email + " opening date:=" + doO
				+ " balance=" + balance;
	}
	
	//---------------------overrride equals for checking unique email and actType--------------

	@Override
	public boolean equals(Object anotherBankAct)
	{
		if(anotherBankAct instanceof BankAccount )
		{
		 BankAccount b=(BankAccount)anotherBankAct;
		return (this.getEmail()).equals(b.getEmail())&& (this.at).equals(b.getAt());	
		}
		
		else
		return false;
	}
	//-------------------getter and setters---------------------------
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

	public LocalDate getDoO() {
		return doO;
	}

	public double getBalance() {
		return balance;
	}
	
	private Locker getLocker() {	
		return locker;		
	}

//-----------------withdraw,deposit and transfer------------
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
	
//---------------assignLocker--------------------------
	public void assignLocker(int duration) {
		locker=new Locker(duration);
		System.out.println(getLocker());
		System.out.println("locker charges are Rs."+(locker.charges*duration));
		withdraw((locker.charges*duration));
	}
	
	
	//-------------------------inner LOCKER class---------------------
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
