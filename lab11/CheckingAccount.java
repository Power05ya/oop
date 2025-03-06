/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author 67070252
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        this(0.0,"",0.0);
    }
    
    public CheckingAccount(double balance, String name,double credit) {
        super(balance, name);
        this.setCredit(credit);
    }
    
    public void setCredit(double credit){
        this.credit = credit;
    }
    
    public double getCredit(){
        return this.credit;
    }
    
    @Override
    public void withdraw(double amount)throws WithdrawException{
        double temp = this.getBalance();
        if (amount <= 0){
            System.out.println("Input number must be a positive integer.");
            return;
        }
        double different = temp-amount;
        if (different >= 0){
            this.setBalance(different);
            System.out.println(amount+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else if(different+this.getCredit() >= 0){
            this.setBalance(0);
            this.setCredit(different+this.getCredit());
            System.out.println(amount+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else{
            throw new WithdrawException("Account "+this.getName()+" has not enough money!");
            //System.out.println("Not enough money!");
        }
    }

    public void withdraw(String amount) throws WithdrawException{
        double con = Double.parseDouble(amount); // __type__.prase__type__(Standard)
        double temp = this.getBalance();
        if (con <= 0){
            System.out.println("Input number must be a positive integer.");
            return;
        }
        double different = temp-con;
        if (different >= 0){ // money por
            this.setBalance(different);
            System.out.println(amount+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else if(different+this.getCredit() >= 0){ // money + credit por
            this.setBalance(0);
            this.setCredit(different+this.getCredit());
            System.out.println(amount+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else{
            throw new WithdrawException("Account "+this.getName()+" has not enough money!");
            //System.out.println("Not enough money!");
        }
    }
    
    @Override
    public String toString(){
        return "The "+this.getName()+" account has "+this.getBalance()+" baht and "+this.getCredit()+" credits.";
    }
}
