package haimin.ye.michael.impl;

public class GetTransactionAPI {
    
    private long accountNumber;
    
    public GetTransactionAPI(){
        this.accountNumber=0L;
    }
    
    public GetTransactionAPI(long accountNumber){
     
        this.accountNumber=accountNumber;
    }
    
    
    public String getResponse(){
        System.out.println("account_number="+accountNumber);
        
        //Get addressInfo from DB
        
        //get FinanceInfo from DB

        //Get BankInfo from DB
        
        //Get CreditCardInfo from DB
        
        
        
        
        return null;
    }

}
