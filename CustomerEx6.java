package ExDay6;

public class CustomerEx6 {
    private int Id;
    private String Name;
    private int Discount;

    public CustomerEx6(int id, String name, int discount) {
        this.Id = id;
        this.Name = name;
        this.Discount = discount;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    @Override
    public String toString() {
        return
                '"'+ Name +  "(" + Id +")" +
                 Discount +"%" +
                '"';
    }
}
