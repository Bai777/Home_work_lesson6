package Zoo;

public abstract class Animal {
    public static final String NAME = "Animal";
    public static int callerCounter;

    public Animal() {
        callerCounter++;
        Main.printCallerCounter(callerCounter, NAME);
    }

    protected void run(int length){}
    protected void swim(int length){}
}
