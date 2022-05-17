package polymorphism;

public class DiamondProblem {
    /*
    * https://www.javatpoint.com/what-is-diamond-problem-in-java
    *
    *
    *
    * */
}
class A
{
    public void display()
    {
        System.out.println("class A display() method called");
    }
}
class B extends A
{
    @Override
    public void display()
    {
        System.out.println("class B display() method called");
    }
}
class C extends A
{
    @Override
    public void display()
    {
        System.out.println("class C display() method called");
    }
}
//not supported in Java
//public class D extends B,C
//{
//    public static void main(String args[])
//    {
//        D d = new D();
////creates ambiguity which display() method to call
//        d.display();
//    }
//}

 /** Class B and class C inherits the class A. The display() method of class A is overridden by the class B and class C.
        Class D inherits the class B and class C (which is invalid in Java). Assume that we need to call the display() method by
        using the object of class D, in this scenario Java compiler does not know which display() method to call.
        Therefore, it creates ambiguity.
  *
  *     The solution to the diamond problem is default methods and interfaces. We can achieve multiple inheritance
  *     by using these two things.
  *
  */

 interface DemoInterface1
{
public default void display()
        {
        System.out.println("the display() method of DemoInterface1 invoked");
        }
        }
interface DemoInterface2
{
    public default void display()
    {
        System.out.println("the display() method of DemoInterface2 invoked");
    }
}
class DemoClass implements DemoInterface1, DemoInterface2
{
    public void display()
    {
        DemoInterface1.super.display();
        DemoInterface2.super.display();
    }
    public static void main(String args[])
    {
        DemoClass obj = new DemoClass();
        obj.display();
    }
}