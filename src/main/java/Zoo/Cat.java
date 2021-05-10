package Zoo;

public class Cat extends Animal{
    public static final String NAME = "Tom_cat";
    public static int callerCounter;
    public Cat() {
        callerCounter++;
        Main.printCallerCounter(callerCounter, NAME);
    }

    @Override
    protected void run(int length) {
        super.run(length);
        String result = length > 200 ? NAME + "не может столько пробежать)" : NAME + " пробежал: " + length + " м.";
        System.out.println(result);
    }

    @Override
    protected void swim(int length) {
        super.swim(length);
        System.out.printf("%s утонул, т.к. не научился плавать!(\n", NAME);
    }
}
