package ExDay6;

import java.text.DecimalFormat;

public class AccountEx5 {
    private int Id;
    private CustomerEx5 Customer ;
    private double Balance = 0.0;

    public AccountEx5(int id, CustomerEx5 customer, double balance) {
       Id = id;
        Customer = customer;
        this.Balance = balance;
    }

    public AccountEx5(int id, CustomerEx5 customer) {
        this.Id = id;
        this.Customer = customer;
    }

    public int getId() {
        return Id;
    }

    public CustomerEx5 getCustomer() {
        return Customer;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public void CustomerName(){
        Customer.getName();
    }
    public AccountEx5 deposit(double amount){
        this.Balance= Balance+amount;

   return this ; }
public AccountEx5 withdraw(double amount){
        if (Balance>=amount){
          this.Balance=Balance-amount;
        }else {
            System.out.println("amount withdrawn exceeds the current balance ");
        }
return this;}

    @Override
    public String toString() {
        final DecimalFormat df = new DecimalFormat("0.00");
        return "'" +Customer.getName()+"("+
               Customer.getId() + ")"  +
                ", Balance=" + df.format(getBalance()) ;
    }
}
