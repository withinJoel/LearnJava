// Basic Java Program
public class basic {
    
    // A static method
    public static void printMessage(String message) { //Use Void if there is no return statement.
        System.out.println(message);
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Basic data types
        int number = 10;
        double decimal = 5.5;
        char character = 'A';
        boolean flag = true;
        String text = "Hello, Java!";
        
        // Printing basic data types
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + flag);
        System.out.println("String: " + text);

        // Control structures
        // If-else statement
        if (number > 5) {
            System.out.println("Number is greater than 5.");
        } else {
            System.out.println("Number is 5 or less.");
        }

        // For loop
        System.out.print("For loop: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        System.out.print("While loop: ");
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Do-while loop
        System.out.print("Do-while loop: ");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
        System.out.println();

        // Object-oriented programming
        // Creating an object of the Person class
        Person person = new Person("John", 30);
        person.displayInfo();

        // Exception handling
        try {
            int result = number / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Basic I/O
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        // Calling a static method
        printMessage("This is a static method call.");

        // Closing the scanner
        scanner.close();
    }
}

// A simple Person class to demonstrate OOP concepts
class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
