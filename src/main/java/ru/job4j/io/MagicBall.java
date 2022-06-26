package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(4);
        switch (answer) {
            case 1 -> System.out.println("да");
            case 2 -> System.out.println("нет");
            case 3 -> System.out.println("может быть");
            default -> {
            }
        }
    }
}
