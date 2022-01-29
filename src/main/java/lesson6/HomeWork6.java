package lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Animal cat2 = new Cat();
        Dog dog1 = new Dog();
        System.out.println("there are " + Animal.dogCounter + " dogs.");
        System.out.println("there are " + Animal.catCounter + " cats.");
        cat1.run(100);
        cat2.swim(10);
        dog1.run(600);
        dog1.swim(5);

    }
}
