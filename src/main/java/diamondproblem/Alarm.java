package diamondproblem;

public interface Alarm {

    default void turnOnAlarm(){
        System.out.println("Turn On alarm");
    }

    default void turnOfAlarm(){
        System.out.println("Turn of alarm");
    }
}
