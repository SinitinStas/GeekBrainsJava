package lesson1;

import java.sql.SQLOutput;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(){
        int a = 10, b = -10, sum = a + b;
        if (sum < 0){
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    static void printColor(){
        int value = 0;
        if (value <= 0){
            System.out.println("Красный");
        } else if (0 < value && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    static void compareNumbers(){
        int a = 10, b = -10;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
