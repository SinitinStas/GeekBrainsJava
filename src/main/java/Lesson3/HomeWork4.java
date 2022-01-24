package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    //field
    public static char[][] map;
    // field size
    public static final int SIZE = 3;
     // dots for win1
    public static final int DOTS_TO_WIN = 3;
    // dots description
    public static final char DOTS_EMPTY = ' ';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static int resizer = SIZE - DOTS_TO_WIN;
    public static int robotLogicResizer = SIZE - 3;
    // initialise our map

    public static void mapInit(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOTS_EMPTY);
        }
    }
    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
            if(i>0 && i < map.length){
                System.out.print("|");
            }

        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
                if (j < map.length -1){
                    System.out.print("|");
                }
            }
            if(i< map.length-1){
                System.out.println();
                System.out.print(" ");
                for (int j = 0; j < map.length; j++) {
                    System.out.print("---");
                }
            }
            System.out.println();
        }
    }
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Insert valid coordinates");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }while (!isCellValid(x,y));
        map[y][x] = DOT_X;
    }

    public static int[] robotLogic(char dot, int cord1, int cord2){
        cord2 = RANDOM.nextInt(SIZE);
        cord1 = RANDOM.nextInt(SIZE);
        int[] arr = new int[2];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <= robotLogicResizer; j++) {
                if (map[i][j] == dot && map[i][j + 1] == dot || map[i][j + 1] == dot && map[i][j + 2] == dot) {
                    if (map[i][j] == DOTS_EMPTY) {
                        cord2 = i;
                        cord1 = j;
                    }
                    if (map[i][j + 2] == DOTS_EMPTY) {
                        cord2 = i;
                        cord1 = j + 2;
                    }
                }
                if (map[j][i] == dot && map[j + 1][i] == dot || map[j + 1][i] == dot && map[j + 2][i] == dot) {
                    if (map[j][i] == DOTS_EMPTY) {
                        cord2 = j;
                        cord1 = i;
                    }
                    if (map[j + 2][i] == DOTS_EMPTY) {
                        cord2 = j + 2;
                        cord1 = i;
                    }
                }
                    if (map[j][j] == dot && map[j + 1][j + 1] == dot || map[j + 1][j + 1] == dot && map[j + 2][j + 2] == dot) {
                        if (map[j][j] == DOTS_EMPTY) {
                            cord2 = j;
                            cord1 = j;
                        }
                        if (map[j + 2][j + 2] == DOTS_EMPTY) {
                            cord2 = j + 2;
                            cord1 = j + 2;
                        }
                    }
                    if (map[j][j + 2] == dot && map[j + 1][j + 1] == dot || map[j + 1][j + 1] == dot && map[j + 2][j] == dot) {
                        if (map[j][j + 2] == DOTS_EMPTY) {
                            cord2 = j;
                            cord1 = j + 2;
                        }
                        if (map[j + 2][j] == DOTS_EMPTY) {
                            cord2 = j + 2;
                            cord1 = j;
                        }
                    }
                }

            }

        arr[0] = cord2;
        arr[1] = cord1;
        return arr;
    }
    public static void robotTurn(){
        int x = -1 , y = -1;
        do {
           int[] arr = robotLogic(DOT_X, x, y);
          x = arr[1]; y = arr[0];
/*
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j <= robotLogicResizer; j++) {
                        if (map[i][j] == DOT_X && map[i][j + 1] == DOT_X || map[i][j + 1] == DOT_X && map[i][j + 2] == DOT_X) {
                            System.out.println("!");
                            if (map[i][j] == DOTS_EMPTY) {
                                System.out.println("!1");
                                y = i;
                                x = j;
                            }
                            if (map[i][j + 2] == DOTS_EMPTY) {
                                System.out.println("!2");
                                y = i;
                                x = j + 2;
                            }
                        }
                        if (map[j][i] == DOT_X && map[j + 1][i] == DOT_X || map[j + 1][i] == DOT_X && map[j + 2][i] == DOT_X) {
                            if (map[j][i] == DOTS_EMPTY) {
                                y = j;
                                x = i;
                            }
                            if (map[j + 2][i] == DOTS_EMPTY) {
                                y = j + 2;
                                x = i;
                            }
                            if (map[j][j] == DOT_X && map[j + 1][j + 1] == DOT_X || map[j + 1][j + 1] == DOT_X && map[j + 2][j + 2] == DOT_X) {
                                if (map[j][j] == DOTS_EMPTY) {
                                    y = j;
                                    x = j;
                                }
                                if (map[j + 2][j + 2] == DOTS_EMPTY) {
                                    y = j + 2;
                                    x = j + 2;
                                }
                            }
                            if (map[j][j + 2] == DOT_X && map[j + 1][j + 1] == DOT_X || map[j + 1][j + 1] == DOT_X && map[j + 2][j] == DOT_X) {
                                if (map[j][j + 2] == DOTS_EMPTY) {
                                    y = j;
                                    x = j + 2;
                                }
                                if (map[j + 2][j] == DOTS_EMPTY) {
                                    y = j + 2;
                                    x = j;
                                }
                            }
                        }

                    }
                }
*/

        }while (!isCellValid(x,y));
        System.out.println("Robot makes turn " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    // coordinate verification
    public static boolean isCellValid(int x, int y){
        if (x < 0 || x > SIZE || y < 0 || y > SIZE ){
            return false;
        }
        if (map[y][x] != DOTS_EMPTY){
            return false;
        }
        return true;
    }

    public static boolean checkWin(char symbol) {

        if(DOTS_TO_WIN == 3) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j <= resizer; j++) {
                    if (map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol) {
                        return true;
                    }
                    if (map[j][i] == symbol && map[j + 1][i] == symbol && map[j + 2][i] == symbol) {
                        return true;
                    }
                    if (map[j][j] == symbol && map[j + 1][j + 1] == symbol && map[j + 2][j + 2] == symbol) {
                        return true;
                    }
                    if (map[j][j + 2] == symbol && map[j + 1][j + 1] == symbol && map[j + 2][j] == symbol) {
                        return true;
                    }
                }

            }
        }
        if(DOTS_TO_WIN == 4) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j <= resizer; j++) {
                    if (map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol && map[i][j + 3] == symbol) {
                        return true;
                    }
                    if (map[j][i] == symbol && map[j + 1][i] == symbol && map[j + 2][i] == symbol && map[j + 3][i] == symbol) {
                        return true;
                    }
                    if (map[j][j] == symbol && map[j + 1][j + 1] == symbol && map[j + 2][j + 2] == symbol && map[j + 3][j + 3] == symbol) {
                        return true;
                    }
                    if (map[j][j + 3] == symbol && map[j + 1][j + 2] == symbol && map[j + 2][j + 1] == symbol && map[j + 3][j] == symbol) {
                        return true;
                    }
                }

            }
        }
        if(DOTS_TO_WIN == 5) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j <= resizer; j++) {
                    if (map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol && map[i][j + 3] == symbol && map[i][j + 4] == symbol) {
                        return true;
                    }
                    if (map[j][i] == symbol && map[j + 1][i] == symbol && map[j + 2][i] == symbol && map[j + 3][i] == symbol && map[j + 4][i] == symbol) {
                        return true;
                    }
                    if (map[j][j] == symbol && map[j + 1][j + 1] == symbol && map[j + 2][j + 2] == symbol && map[j + 3][j + 3] == symbol && map[j + 4][j + 4] == symbol) {
                        return true;
                    }
                    if (map[j][j + 4] == symbol && map[j + 1][j + 3] == symbol && map[j + 2][j + 2] == symbol && map[j + 3][j + 1] == symbol && map[j + 4][j] == symbol) {
                        return true;
                    }
                }

            }
        }

        return false;
    }
    public static boolean isMapFull(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOTS_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
    mapInit();
    printMap();
    while (true){
        humanTurn();
        printMap();
        if (checkWin(DOT_X)){
            System.out.println("You win!");
            break;
        }
        if (isMapFull()){
            System.out.println("It's draw");
        }
        robotTurn();
        printMap();
        if (checkWin(DOT_O)){
            System.out.println("Robot wins!");
            break;
        }
    }
        System.out.println("Game Over :)");
    }
}
