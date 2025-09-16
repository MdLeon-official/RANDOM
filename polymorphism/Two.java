// SuperClass
class SuperClass {

    protected int data1; // protected so subclass can access it

    // Constructor
    public SuperClass(int data1) {
        this.data1 = data1;
    }

    // Setter for data1
    public void setData1(int data1) {
        this.data1 = data1;
    }

    // Getter for data1
    public int getData1() {
        return data1;
    }
}

// SubClass
class SubClass extends SuperClass {

    private int data2;

    // Constructor to set data1 and data2
    public SubClass(int data1, int data2) {
        super(data1); // call superclass constructor
        this.data2 = data2;
    }

    // Setter for data2
    public void setData2(int data2) {
        this.data2 = data2;
    }

    // Getter for data2
    public int getData2() {
        return data2;
    }

    // Method to check condition
    public String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition True!";
        } else {
            return "Condition False!";
        }
    }
}

// Test class with main method
public class Two {

    public static void main(String[] args) {
        // Create object with data1 = 10 and data2 = 15
        SubClass obj = new SubClass(10, 15);

        System.out.println("Data1: " + obj.getData1());
        System.out.println("Data2: " + obj.getData2());
        System.out.println(obj.checkCondition());

        // Change values
        obj.setData1(5);
        obj.setData2(20);

        System.out.println("Data1: " + obj.getData1());
        System.out.println("Data2: " + obj.getData2());
        System.out.println(obj.checkCondition());
    }
}
