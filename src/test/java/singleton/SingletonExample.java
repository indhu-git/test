package singleton;

public class SingletonExample {
    /*
    * Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
    *
    * There are two forms of singleton design pattern

        Early Instantiation: creation of instance at load time.
        Lazy Instantiation: creation of instance when required.
    *
    * Saves memory because object is not created at each request. Only single instance is reused again and again.
    * To create the singleton class, we need to have static member of class, private constructor and static factory method.
    *
    * */
}
class A{
    private static A obj=new A();//Early, instance will be created at load time
    private A(){}

    public static A getA(){
        return obj;
    }

    public void doSomething(){
        System.out.println("Indhumathi");
    }

    public static void main(String[] args) {
        getA().doSomething();
    }
}


class A1{
    private static A1 obj;
    private A1(){}

    public static A1 getA1(){
        if (obj == null){
            synchronized(A1.class){
                if (obj == null){
                    obj = new A1();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        System.out.println("Indhumathi is lazy");
    }
    public static void main(String[] args) {
        getA1().doSomething();
    }
}