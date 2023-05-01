package com.testBank;
import static com.bank.BankAccount.*;

import java.time.LocalDate;

import com.BankEnum.AcType;
import com.bank.*;
public class TesterBankActHardcode {

	public static void main(String[] args) {
		System.out.println("Welcome to "+organisation);
		
		System.out.println("we open following type of bank accounts:");
		for(AcType at:AcType.values())
		{
		   System.out.println(at);	
		}
		
		BankAccount a=new BankAccount(AcType.valueOf("saving"), "sunny", "s@gm",LocalDate.of(2020,02,02), 10000);
		BankAccount b=new BankAccount(AcType.valueOf("current"), "honey", "s@gm", LocalDate.of(202,02,02), 10000);
	   
		 System.out.println(a);
		    System.out.println(b);
		    //assign and details of locker for b
		    System.out.println("locker deatils of b:");
		    b.assignLocker(3);
	    b.deposit(2000);
	    System.out.println("balance of b:Rs"+b.getBalance());
	    a.transfer(b, 2000);
	    System.out.println("balance of a:Rs"+a.getBalance());
	    System.out.println("balance of b:Rs"+b.getBalance());;
	    
	}

}
