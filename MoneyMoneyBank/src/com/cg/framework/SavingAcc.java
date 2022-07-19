package com.cg.framework;

    public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=100;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}


	public void withdraw(float accBal)
	{
       System.out.println("Remaining balance after withdraw :"+accBal);
}

    @Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
    public boolean isSalaried() 
    {
    	return isSalaried;
    	
    }
     public void setSalaried(boolean isSalaried)
     {
    	 this.isSalaried = isSalaried;
     }
     public static float getMinBal()
     {
    	 return MINBAL;
     }
}