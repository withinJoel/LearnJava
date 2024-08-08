# Java Basics: Quick Start Guide

This guide covers the fundamental concepts of Java programming with examples. Follow the steps to learn and understand the basics of Java.

## 1. Introduction to Java

Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is widely used for developing web applications, mobile applications, and enterprise software.

## 2. Setting Up Java Development Environment

### Install JDK

1. Download the latest JDK (Java Development Kit) from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK from [AdoptOpenJDK](https://adoptium.net/).
2. Follow the installation instructions specific to your operating system.

### Set Up IDE

1. Install an Integrated Development Environment (IDE) such as [IntelliJ IDEA](https://www.jetbrains.com/idea/download/), [Eclipse](https://www.eclipse.org/downloads/), or [NetBeans](https://netbeans.apache.org/download/index.html).
2. Configure the IDE to use the installed JDK.

## 3. Basic Java Syntax

### Hello World Program

Create a file named `HelloWorld.java`:

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

* Compile: `javac HelloWorld.java`
* Run: `java HelloWorld`

## 4. Variables and Data Types
* Java has eight primitive data types:

### Math
* `int`: Integer (e.g., int num = 10;)
* `long`: Long (e.g., long days = 1000;)
* `short`: Short (e.g., short num = 20;)
* `double`: Floating-point number (e.g., double price = 19.99;)
* `float`: Float (eg., float years = 11.0;)
* example program:
```
public class VariablesExample {
    public static void main(String[] args) {
        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isEmployed = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
    }
}
```

### Text
* `string`: String (eg., String name = "Joel";)
* `char`: Single character (e.g., char letter = 'A';)

### Boolean
* `boolean`: True or false (e.g., boolean isJavaFun = true;)

### Arrays
* One-Dimentional Arrays
* structure: type variable-name[]; example: `int month[];`
* example program: 
```
int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
System.out.println("April has " + month_days[3] + " days.");
```
### Arithmetic Operators
* `+` - Addition
* `-` - Subtraction
* `*` - Multiplication
* `/` - Division
* `%` - Modulus
* `++` - Increment
* `--` - Decrement

### Relational Operators
* `==` - Equal to
* `!=` - Not equal to
* `>` - Greater than
* `<` - Less than
* `>=` - Greater than or equal to
* `<=` - Less than or equal to

## 5. Control Flow Statements
## Conditional Statements
* If Statement
```
int number = 10;
if (number > 0) {
    System.out.println("Number is positive.");
}
```
* If-Else Statement
```
int number = -5;
if (number > 0) {
    System.out.println("Number is positive.");
} else {
    System.out.println("Number is non-positive.");
}
```
* Switch Statement
```
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```
## Loops
## For Loop
```
for (int i = 0; i < 5; i++) {
    System.out.println("i: " + i);
}
```
## While Loop
```
int i = 0;
while (i < 5) {
    System.out.println("i: " + i);
    i++;
}
```
## Do-While Loop
```
int i = 0;
do {
    System.out.println("i: " + i);
    i++;
} while (i < 5);
```

## Methods
```
public class MethodsExample {

    public static void main(String[] args) {
        greet();
        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }

    // Method to print a greeting message
    public static void greet() {
        System.out.println("Hello, welcome to Java programming!");
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
}
```
## Defining a class
```
public class Person {
    // Fields
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```
## Creating and using Objects
```
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("Alice", 30);

        // Calling the method to display information
        person.displayInfo();
    }
}
```
## Inheritance
* Basic Inheritance
```
// Parent class
public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
public class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```
* Using Inheritance
```
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Child class method
    }
}
```
## Exception Handling
* Try-Catch example
```
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
```
## Basic I/O
* Reading Input from the console
```
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```
* Writing Output to the Console
```
public class OutputExample {
    public static void main(String[] args) {
        System.out.println("This is a line of text.");
        System.out.printf("Formatted output: %d + %d = %d%n", 10, 20, 10 + 20);
    }
}
```
## In a nutshell
* class : class keyword is used to declare classes in Java
* public : It is an access specifier. Public means this function is visible to all.
* static : static is again a keyword used to make a function static. To execute a static function you do not have to create an Object of the class. The main() method here is called by JVM, without creating any object for class.
* void : It is the return type, meaning this function will not return anything.
* main : main() method is the most important method in a Java program. This is the method which is executed, hence all the logic must be inside the main() method. If a java class is not having a main() method, it causes compilation error.
* String[] args : This is used to signify that the user may opt to enter parameters to the Java Program at command line. We can use both String[] args or String args[]. Java compiler would accept both forms.
* System.out.println : This is used to print anything on the console like “printf” in C language.
