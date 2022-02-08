package stack;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        Stack<Integer> ins = new Stack<>();
        ins.push(1);
        ins.push(2);
        ins.push(3);
        ins.push(4);
        ins.add(8);

        ins.pop();

        System.out.println(ins);

    }
}
