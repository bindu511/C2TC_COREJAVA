package com.cg.client;

import com.cg.bankapplication.MMBankFactory;
import com.cg.bankapplication.MMCurrentAcc;
import com.cg.bankapplication.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public  class client {
	
	public static void main(String args[]){
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(39736,"SAVING",40000,true);
		CurrentAcc ca=new MMCurrentAcc(39736,"Saving",50000,5000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getCreditLimit());

}
}
