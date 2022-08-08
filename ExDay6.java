package ExDay6;

public class ExDay6 {
    public static void main(String[] args) {
        //Ex1
        Circle circle1=new Circle(4,"white");
        System.out.println(circle1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());
        Cylinder cylinder1=new Cylinder(circle1.getRadius(),4, circle1.getColor());
        System.out.println(cylinder1);
        System.out.println(cylinder1.getVolume());
        System.out.println("---------------------------------");

        //Ex2
        // Test constructor and toString()
        AccountEx2 a1 = new AccountEx2("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        AccountEx2 a2 = new AccountEx2("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("--------------------------------------");


        //Ex3
        CircleEx3 circleEx3=new CircleEx3(4);
        System.out.println(circleEx3);
        System.out.println(circleEx3.getArea());
        System.out.println(circleEx3.getPerimete());
        ResizableCircle resizableCircle=new ResizableCircle(circleEx3.radius);
        System.out.println(resizableCircle);
        resizableCircle.resize(60);
        System.out.println(resizableCircle.radius);
        System.out.println("--------------------------------------");
        //Ex4
        MovablePoint movablePoint=new MovablePoint(2,4,6,8);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        System.out.println("--------------------------------------");
//Ex5
        CustomerEx5 customerEx5=new CustomerEx5(123,"shahad",30);
        System.out.println(customerEx5);
        AccountEx5 accountEx5=new AccountEx5(126,customerEx5,3899.5877);
        System.out.println(accountEx5);
        System.out.println(accountEx5.deposit(0));
        System.out.println(accountEx5.withdraw(4000));
        System.out.println("--------------------------------------");
        //Ex6
        CustomerEx6 customerEx6=new CustomerEx6(123,"shahad",50);
        System.out.println(customerEx6);
        InvoiceEx6 invoiceEx6=new InvoiceEx6(134,customerEx6,66);
        System.out.println(invoiceEx6);
        System.out.println(invoiceEx6.AmountAfterDiscount());
        System.out.println("--------------------------------------");
        //Ex7

        CircleEx7 circleEx7=new CircleEx7(4,"pink",true);
        System.out.println(circleEx7);
        System.out.println(circleEx7.getArea());
        System.out.println(circleEx7.getPerimeter());
        Rectangle rectangle=new Rectangle(4,4,"blue",true);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square=new Square(4,"white",true);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println("--------------------------------------");
    }
}
