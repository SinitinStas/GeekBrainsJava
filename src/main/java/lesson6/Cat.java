package lesson6;

public class Cat extends Animal{

    @Override
    public void run(int distance) {
        if( distance > 200) {
            System.out.println("The cat ran only 200 meters");
        }else if(distance <= 0) {
            System.out.println("The cat stayed on the place");
        } else {
            System.out.println("The cat ran " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("The cat can't swim");
    }

    public Cat() {
        catCounter++;
    }
}
