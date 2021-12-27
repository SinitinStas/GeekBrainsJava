package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sumVerification(4, 12));
        ifNumIsPositive(30);
        System.out.println(ifNumIsNegative(-4));
        printString("Hello", 3);
        System.out.println(ifYearIsLeap(30));
    }

    public static boolean sumVerification(int num1, int num2){
        int result = num1 + num2;
        if (10 <= result && result <= 20){
            return true;
        }else {
            return false;
        }
    }

    public static void ifNumIsPositive(int num){
        if (num >= 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }

    public static boolean ifNumIsNegative(int num){
        if (num >= 0){
            return false;
        }else {
            return true;
        }
    }

    public static void printString(String str, int num){
        if (num > 0){
            int count = 0;
            while (count < num){
                System.out.println(str);
                count++;
            }
        }else {
            System.out.println("error :(");
        }
    }

    public static boolean ifYearIsLeap(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }
}
