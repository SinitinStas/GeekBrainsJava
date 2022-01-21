package lesson6;

public class Dog extends Animal {
    @Override
    public void run(int distance) {
        if( distance > 500) {
            System.out.println("The dog ran only 500 meters");
        }else if(distance <= 0) {
            System.out.println("The dog stayed on the place");
        } else {
            System.out.println("The dog ran " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        if( distance > 10) {
            System.out.println("The dog swam only 10 meters");
        }else if(distance <= 0) {
            System.out.println("The dog stayed on the place");
        } else {
            System.out.println("The dog swam " + distance + " meters");
        }
    }
    public Dog() {
        dogCounter++;
    }
}
