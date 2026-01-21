package application;

import entities.Client;

public class HashEqualsProgram {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "maria@email.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        //  typically derives an integer from the object's memory address
        //  p.s. when you override the equals() method in a custom class to define
        //  logical equality (e.g., two Person objects are equal if they have the same name and ID),
        //  you must also override hashCode() to maintain the contract.
        System.out.println(c1.equals(c2));
        // compares the content/value of objects.
        System.out.println(c1 == c2);
        // compares memory addresses
        // returns "false" because "new" always creates a new object
        System.out.println(s1 == s2);
        // returns "true" because of String Pool
        // String literals are stored in a special area of memory
        // Java reuses the same String objects to save memory
    }
}
