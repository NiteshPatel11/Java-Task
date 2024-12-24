public class Const {
    String name;
    int age;

    // Parameterized Constructor
    public Const(String name, int age) {
        // Initializing fields with passed arguments
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
       Const c = new Const("John", 25);
        c.displayInfo();  // Output: Name: John, Age: 25

        Const c1= new Const("Alice", 30);
        c1.displayInfo();  // Output: Name: Alice, Age: 30
    }
}
