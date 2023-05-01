package com.validations;

import java.time.LocalDate;

import com.BankEnum.AcType;
import com.bank.BankAccount;
import com.bankActExceptions.DuplicateActException;

public class CustValidationRules {
	public static BankAccount validateForOpeningAct(String at, String name, String email, String doO, double balance,BankAccount[] custList) throws DuplicateActException 
	{
		AcType validType=AcType.valueOf(at);
		BankAccount b=new BankAccount(email,validType);
		if(DuplicateAct(b,custList))
		{
			LocalDate validDoO=LocalDate.parse(doO);
			b=new BankAccount(validType,name,email,validDoO,balance);
		}
		return b;
	}

	public static boolean DuplicateAct(BankAccount b,BankAccount[] custList) throws DuplicateActException
	{
		for(BankAccount act:custList)
		{
			if(act!=null)
				if(b.equals(act))
					throw new DuplicateActException("this account already exist!!");
		}
			
		return true;
	}
}
