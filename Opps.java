
// Q1. OOP — Encapsulation

// Create a BankAccount class with:

// Private fields: accountHolder (String), balance (double)
// Constructor to set both
// Getter and setter for both (balance setter should reject negative values)
// A deposit(double amount) method

public class Opps {
    public static class BankAccount{
            private String accountHolder;
            private double balance;
            
            

            void setAccountHolder(String accountHolder ){
                    this.accountHolder = accountHolder;
                }
            void setBalance(double balance){
                if(balance>0){
                this.balance=balance;
                }
            }

            String getAccountHolder(){
                return accountHolder;
            }
            double getBalance(){
                return balance;
            }
            BankAccount(){
                setAccountHolder("Kashish");
                setBalance(2500);
                getAccountHolder();
                getBalance();
            }
            double deposit (int money){
                   balance = balance + money;
                   return balance ;
            }
        }
    public static void main(String args[]){
          BankAccount b1 = new BankAccount();
          b1.deposit(5000);
         System.out.println(b1.getAccountHolder());
        System.out.println(b1.getBalance());
    }
}
