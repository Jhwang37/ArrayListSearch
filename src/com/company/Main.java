package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(86);
        numbers.add(87);
        numbers.add(28);
        numbers.add(21);
        System.out.println(numbers);
        System.out.println("Value to find: ");
        int find = scan.nextInt();

        if(numbers.contains(find)){
            System.out.println(find + " is in the Array List");
        }
    }
}
