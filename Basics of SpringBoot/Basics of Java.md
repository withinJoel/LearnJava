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

* `int`: Integer (e.g., int num = 10;)
* `double`: Floating-point number (e.g., double price = 19.99;)
* `char`: Single character (e.g., char letter = 'A';)
* `boolean`: True or false (e.g., boolean isJavaFun = true;)

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

## 5. Control Flow Statements