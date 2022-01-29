package JavaPart1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class HomeWork3 {
    public static String readLine() {
        StringBuilder response = new StringBuilder();
        try {//from   www  .j av a 2  s  . c o m
            BufferedInputStream bin = new BufferedInputStream(System.in, 3000);
            int in = 0;
            char inChar;
            do {
                in = bin.read();
                inChar = (char) in;
                if (in != -1) {
                    response.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n'));
            bin.close();
            return response.toString();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] arguments) {
        String input = readLine();
        System.out.println(input);
    }



}

