package polymorphism;

public class Overriding {
    /**
     * It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method
      is resolved at Runtime. This type of polymorphism is achieved by Method Overriding. Method overriding,
      on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.
      That base function is said to be overridden.
     *
     * Here in this program, When an object of child class is created, then the method inside the child class is called.
      This is because The method in the parent class is overridden by the child class. Since The method is overridden,
      This method has more priority than the parent method inside the child class. So, the body inside the child class is executed.
     * */
}
class Parent {

    // Method of parent class
    void Print()
    {

        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {

    // Method
    void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends Parent {

    // Method
    void Print()
    {

        // Print statement
        System.out.println("subclass2");
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}