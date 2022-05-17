package constructorloading;

public class ConstructorOverloading {

    //Can we call constructor from another constructor: Yes, Using this Keyword
    //Can We OverLad constructor : Yes
    //Can we have same class name in method also? : Yes we can create method same as class name. But we have follow coding standard.


    public ConstructorOverloading(){

        //this("indhu");
    }
    public ConstructorOverloading(int a, int b){
        //this();
    }

   // public ConstructorOverloading(String name){
     //   this(1, 2);
    //}

    public static void main(String[] args) {
        new ConstructorOverloading(1, 2);
    }
}
