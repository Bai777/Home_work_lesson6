package Zoo;

public class Dog extends Animal{
    public static final String NAME = "Butch_dog";
    public static int callerCounter;

    public Dog() {
        callerCounter++;
       Main.printCallerCounter(callerCounter, NAME);
    }

    @Override
    protected void run(int length) {
        super.run(length);
        if (length <= 500)
            System.out.printf("%s пробежал: %d м.\n", NAME, length);
        else System.out.printf("%s не может столько бежать, он домашний ленивый пёсель)\n", NAME);
    }

    @Override
    protected void swim(int length) {
        super.swim(length);
        if (length <= 10)
            System.out.printf("%s проплыл: %d м.\n", NAME, length);
        else System.out.printf("%s утонул т.к. дистанция слишком велика:(\n", NAME);
    }
}
