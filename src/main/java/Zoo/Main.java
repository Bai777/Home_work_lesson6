package Zoo;

public class Main {
    public static void main(String[] args) {

        Cat catMurzik = new Cat();
        catMurzik.run(100);
        catMurzik.swim(10);

        Dog dogZuchka = new Dog();
        dogZuchka.run(600);
        dogZuchka.swim(10);

//        Animal[] animals = {
//                new Cat(),
//                new Dog()
//        };
//
//        for (Animal animal :
//                animals) {
//            if (animal instanceof Cat)((Cat) animal).run(100);
//            //if (animal instanceof Cat)((Cat) animal).swim(0);
//            if (animal instanceof Dog)((Dog) animal).run(450);
//            if (animal instanceof Dog)((Dog) animal).swim(9);
//        }


    }
    public static void printCallerCounter(int callerCounter, String NAME){
        System.out.printf("Создано: %d, %s\n", callerCounter, NAME);
    }
}
