package threadlocal;

public class ThreadLocal {
    /*
    * ThreadLocal class provides thread-local variables. It enables you to create variables that can only be read and write by
    *  the same thread. If two threads are executing the same code and that code has a reference to a ThreadLocal variable
    * then the two threads can't see the local variable of each other.
    *
    * */

    private ThreadLocal threadLocal = new ThreadLocal();
    String s = new String();

}
