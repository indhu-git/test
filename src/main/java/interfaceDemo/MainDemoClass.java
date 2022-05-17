package interfaceDemo;

public class MainDemoClass implements InterfaceDemo, InterfaceDemo1{

    public void show(){
        InterfaceDemo.super.show();
        InterfaceDemo1.super.show();

    }
}
