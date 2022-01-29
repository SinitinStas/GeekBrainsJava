package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if(plate.getFood() > appetite){
            plate.decreaseFood(appetite);
            satiety = true;
        }else {
           // plate.setFood(0);
            satiety = false;
        }

    }
}