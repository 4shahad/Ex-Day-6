package ExDay6;

public class AccountEx2 {
    private String Id;
    private String Name ;
    private  int Balance= 0 ;

    public AccountEx2(String id, String name) {
        this.Id = id;
        this.Name = name;
    }

    public AccountEx2(String id, String name, int balance) {
        this.Id = id;
        this.Name = name;
        this.Balance = balance;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                ']';
    }

    public int credit(int amount){
        int theNewBalance= amount+ getBalance();
        Balance  = theNewBalance;
        return Balance;
    }
    public int debit(int amount){
        if (amount<=Balance){
            int theNewBalance =getBalance()-amount;
            Balance  = theNewBalance;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return Balance; }
    public int transferTo (AccountEx2 onother,int amount){
        if (amount<=Balance){
            Balance=Balance-amount;
            onother.Balance=amount;


        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return onother.Balance; }


}
