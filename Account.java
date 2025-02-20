/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 67070252
 */
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance,String name){
        this.setBalance(balance);
        this.setName(name);
    }
    
    public void deposit(double a){
        double temp = this.getBalance();
        if (a > 0){
            this.setBalance(temp+a);
            System.out.println(a+" baht is deposited to "+this.getName()+".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(double a){
        double temp = this.getBalance();
        if(a<0){
            System.out.println("Input number must be a positive integer.");
        }
        else if(temp-a <0){
            System.out.println("Not enough money!");
        }
        else{
            this.setBalance(temp-a);
            System.out.println(a+" baht is withdrawn from "+this.getName()+".");
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setBalance(double  balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void showAccount(){
        System.out.println(this.getName()+" account has "+this.getBalance()+" baht.");
    }
}