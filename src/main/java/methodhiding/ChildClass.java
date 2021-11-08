package methodhiding;

public class ChildClass extends BaseClass{

    public static void display(){
        System.out.println("Child static Display");
    }

    public void print(){
        System.out.println("Child print");
    }

}
