package ExDay6;

public class InvoiceEx6 {
    private int Id;
    private CustomerEx6 Customer;
    private double amount;

    public InvoiceEx6(int id, CustomerEx6 customer, double amount) {
        Id = id;
        Customer = customer ;
        this.amount = amount;
    }

    public int getId() {
        return Id;
    }

    public CustomerEx6 getCustomer() {
        return Customer;
    }

    public void setCustomer(CustomerEx6 customer) {
        Customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        int CustomerID=Customer.getId();
   return CustomerID; }
    public String getCustomerName(){
        String CustomerName=Customer.getName();
        return CustomerName; }
    public int getCustomerDiscount(){
        int CustomerDiscount=Customer.getDiscount();
        return CustomerDiscount; }
    public double AmountAfterDiscount(){
        int CustomerDiscount=Customer.getDiscount();
        amount = amount * ((double) CustomerDiscount / 100);
        return amount; }

    @Override
    public String toString() {
        return "InvoiceEx6{" +
                "Id=" + Id +
                ", Customer=" + Customer.getName() +
                "("+Customer.getId()+")"+"("+Customer.getDiscount()+"%"+")"+
                ", amount=" + amount +
                '}';
    }
}
