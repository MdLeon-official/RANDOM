class Shape {

    void show() {
        System.out.println("This is Shape class show() method");
    }

    void getInfo() {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape {
@Override
    void show() {
        System.out.println("This is Circle class show() method");
    }
}

class Rectangle extends Shape {
@Override
    void show() {
        System.out.println("This is Rectangle class show() method");
    }
}

public class One {

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Calling show() method:");
        s1.show();
        s2.show();

        System.out.println("\nCalling getInfo() method:");
        s1.getInfo();
        s2.getInfo();
    }
}
