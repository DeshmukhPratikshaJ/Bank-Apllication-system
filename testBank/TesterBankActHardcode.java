package com.testBank;
import static com.bank.BankAccount.*;
<<<<<<< HEAD

import java.time.LocalDate;

import com.BankEnum.AcType;
=======
>>>>>>> 8a88dc9109f96e3ef3f8257219408e32e3a29104
import com.bank.*;
public class TesterBankActHardcode {

	public static void main(String[] args) {
		System.out.println("Welcome to "+organisation);
		
		System.out.println("we open following type of bank accounts:");
		for(AcType at:AcType.values())
		{
		   System.out.println(at);	
		}
		
<<<<<<< HEAD
		BankAccount a=new BankAccount(AcType.valueOf("saving"), "sunny", "s@gm",LocalDate.of(2020,02,02), 10000);
		BankAccount b=new BankAccount(AcType.valueOf("current"), "honey", "s@gm", LocalDate.of(202,02,02), 10000);
=======
		BankAccount a=new BankAccount(AcType.valueOf("saving"), "sunny", "s@gm", new Date(2,2,2020), 10000);
		BankAccount b=new BankAccount(AcType.valueOf("current"), "honey", "s@gm", new Date(2,2,2020), 10000);
>>>>>>> 8a88dc9109f96e3ef3f8257219408e32e3a29104
	   
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
