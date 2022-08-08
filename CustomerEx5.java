package ExDay6;

public class CustomerEx5 {
    private int Id;
    private String Name ;
    private char Gender;

    public CustomerEx5(int id, String name, int discount) {
        this.Id = id;
        this.Name = name;
        discount=discount;

    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public char getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return
                 Name + "(" + Id +")";
    }
}
