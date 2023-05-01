package com.testBank;

import static com.bank.BankAccount.organisation;

import java.util.Scanner;

import com.BankEnum.AcType;
import com.bank.BankAccount;

public class TesterWithMenu {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Welcome to "+organisation);
			
			System.out.println("we open following type of bank accounts:");
			for(AcType at:AcType.values())
			   System.out.println(at);	
			System.out.println("enter Bank account list size");
			
			BankAccount[] actList=new BankAccount[sc.nextInt()];
			int track=0;
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.open account 2.open locker for alrdy existing act");
				System.out.println("3.get details of specific act (given:actid)");
				System.out.println("4.get locker detaills");
				System.out.println("5.get details of all accounts(actid,actType,names,email");
			    System.out.println("6.delete account 7.exit");
				System.out.println("enter choice:");
			try {
				switch(sc.nextInt())
				{
				case 1:    //open account---only when no duplication
					break;
				case 2:    //open locker for alrdy existing act
					break;
				case 3:    //details of account for specific actid
					break;
				case 4:    //get locker details of specific actid
					break;
				case 5:    //get list of all account details(actid,act type,name,email)
					break;
				case 6:    //delete account
					break;
				case 7:    //exit
					exit=true;
					break;
				default:
				    System.out.println("invalid input");
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		}

	}


}
