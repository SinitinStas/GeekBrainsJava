package Lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik1", 5);
        cats[1] = new Cat("Barsik2", 10);
        cats[2] = new Cat("Barsik3", 15);
        cats[3] = new Cat("Barsik4", 7);
        cats[4] = new Cat("Barsik5", 8);
        Plate plate = new Plate(100);

        for (Cat cat:cats) {
            cat.eat(plate);
        }
        for (Cat cat:cats) {
            System.out.println(cat.isSatiety());
        }

        plate.addFood(10);
        plate.info();





    }
}