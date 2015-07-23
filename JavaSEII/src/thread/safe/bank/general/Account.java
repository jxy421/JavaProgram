package thread.safe.bank.general;
public class Account { 
	
   private String accountNo; 
   private Double balance; 
   
   public Account(String accountNo, Double balance) { 
      this.accountNo = accountNo; 
      this.balance = balance; 
   } 
   
   public String getAccountNo() { 
      return accountNo; 
   } 
   public void setAccountNo(String accountNo) { 
      this.accountNo = accountNo; 
   } 
   
   public Double getBalance() { 
      return balance; 
   } 
   public void setBalance(Double balance) { 
      this.balance = balance; 
   } 
   
   @Override 
   public boolean equals(Object obj) { 
      if(obj!=null&&obj.getClass()==Account.class){ 
         Account target=(Account)obj; 
         return target.getAccountNo().equals(accountNo); 
      } 
      return false; 
   } 
   @Override 
   public int hashCode() { 
      return accountNo.hashCode(); 
   } 
} 
