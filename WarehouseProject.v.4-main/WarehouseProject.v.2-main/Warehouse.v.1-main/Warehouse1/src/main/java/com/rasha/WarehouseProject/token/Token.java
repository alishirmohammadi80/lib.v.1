package com.rasha.WarehouseProject.token;

import java.util.Random;

public class Token {
    public static String generatRandomToken(){
        StringBuilder stringBuilder=new StringBuilder();
        String chars ="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        int charsLength=chars.length();
        int numbersLength=numbers.length();
        for (int i=0;i<40;i++) {
            int charsIndex = new Random().nextInt(charsLength);
            int numbersIndex = new Random().nextInt(numbersLength);

            stringBuilder.append(chars.charAt(charsIndex));
            stringBuilder.append(numbers.charAt(numbersIndex));
        }
        return stringBuilder.toString();
    }
}
