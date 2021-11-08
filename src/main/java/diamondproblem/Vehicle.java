package diamondproblem;

public interface Vehicle {

    void wheel();
    void mirror();

    static void turnOnAlarm(){
        System.out.println("Turn On alarm");
    }

    static void turnOfAlarm(){
        System.out.println("Turn of alarm");
    }
}
