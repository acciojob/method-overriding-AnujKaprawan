package com.driver;
import java.util.Scanner;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B objB = new B();

        // Task 3: Call method meth of class A with an object of class B
        String resultFromA = objB.meth(); // This will call the overridden method in class B
        System.out.println("Result from class A's method: " + resultFromA);

        // Task 5: Call the overridden method from an object of class B
        String overriddenResult = objB.meth();
        System.out.println("Overridden method result from class B: " + overriddenResult);

        scanner.close();
    }
}
