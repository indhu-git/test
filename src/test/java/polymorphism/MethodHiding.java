package polymorphism;

class MethodHiding {

    /*
    *  Mandatory to know about method overriding
    * Method overriding means subclass had defined an instance method with the same signature and return type as the
    instance method in the superclass. In such a case, method of the superclass is overridden (replaced) by the subclass.
    * Static methods
    *
    * Static methods are bonded during compile time using types of reference variables not object. We know that static methods are
    accessed by using the class name rather than an object. Note that the static method can be overloaded, but cannot be
    overridden in Java.
    *
    *
    * Method hiding can be defined as, "if a subclass defines a static method with the same signature as a static method in the super
    *  class, in such a case, the method in the subclass hides the one in the superclass." The mechanism is known as method hiding.
    * It happens because static methods are resolved at compile time.
    * */
}
class Demo
{
    public static void method1()
    {
        System.out.println("Method-1 of the Demo class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the Demo class is executed.");
    }
}
//child class
 class Sample extends Demo
{
    public static void method1()
    {
        System.out.println("Method-1 of the Sample class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the Sample class is executed.");
    }
    public static void main(String args[])
    {
        Demo d1 = new Demo();
//d2 is reference variable of class Demo that points to object of class Sample
        Demo d2 = new Sample();
//method calling with reference (method hiding)
        d1.method1();
        d2.method1();
//method calling with object (method overriding)
        d1.method2();
        d2.method2();
    }
}