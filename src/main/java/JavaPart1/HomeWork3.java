package JavaPart1;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0};
        binaryNumSwitcher(array1);
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[100];
        fillArray(array2);
        System.out.println(Arrays.toString(array2));
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        numbersLessThanSixMultiplyByTwo(array3);
        System.out.println(Arrays.toString(array3));
        int[][] array4 = new int[5][5];
        fillDiagonalsOfTwoDimensionalArrayWithOnes(array4);
        for (int[] element : array4) {
            System.out.println(Arrays.toString(element));
        }
        int[] array5 = arrayCreator(10, 5);
        System.out.println(Arrays.toString(array5));
        int[] array6 = randomArrayCreator(10);
        System.out.println(Arrays.toString(array6));
        System.out.println(maxNumOfArray(array6));
        System.out.println(minNumOfArray(array6));
        int[] array7 = {1, 11, 5, 3, 4};
        System.out.println(checkBalance(array7));
        System.out.println(Arrays.toString(arrayShift(new int[]{3, 5, 1, 3}, -2)));
    }

    public static int[] binaryNumSwitcher(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        } return arr;
    }

    public static int[] fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        } return arr;
    }
    public static int[] numbersLessThanSixMultiplyByTwo(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        } return arr;
    }
    public static int[][] fillDiagonalsOfTwoDimensionalArrayWithOnes(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j || i + j == arr.length - 1){
                    arr[i][j] = 1;
                }
            }
        } return arr;
    }
    public static int[] arrayCreator(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        } return arr;
    }
    public static int[] randomArrayCreator(int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.ceil(Math.random()*100);
        } return arr;
    }

    public static int maxNumOfArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        } return max;
    }
    public static int minNumOfArray(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        } return min;
    }
    public static boolean checkBalance(int[] arr){
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        if (sum % 2 == 1){
            return false;
        }
        int half = sum / 2;
        int testSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (testSum < half){
                testSum += arr[i];
            } else if (testSum == half) {
                return true;
            }
        } return false;
    }
    public static int[] arrayShift(int[] arr, int shiftNum){ //I stopped here
       int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if(i + shiftNum >= arr.length){
                arr1[i + shiftNum - arr.length] = arr[i];
            }else if(i + shiftNum < 0) {
                arr1[i + shiftNum + arr.length] = arr[i];
            }else {
                arr1[i + shiftNum] = arr[i];
            }

        } return arr1;

    }



}

