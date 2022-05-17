package recursionDemo;

public class RecursionDemo {
    public static void main(String[] args) throws Exception{
        RecursionDemo recursionDemo = new RecursionDemo();
        System.out.println(recursionDemo.sum(10));

        //throw new Exception("");
    }

    public int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    //Checked Exception
    //Unchecked Exception

}


