package methodhiding;

public class MethodHidingExample {
    public static void main(String[] args) {
        BaseClass childClass = new ChildClass();
        childClass.print();
        childClass.display();
    }

    //Method Over hiding will happen if we try to override static method.
    //If a derived class defines a static method with the same signature as a static method in the base class,
    // the method in the derived class is hidden by the method in the base class.
    //We can declare static methods with the same signature in the subclass, but it is not considered overriding as
    // there won’t be any run-time polymorphism. Hence the answer is ‘No’.
}
