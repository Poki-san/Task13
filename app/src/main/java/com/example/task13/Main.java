package com.example.task13;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        HashSet<String> one = new HashSet<>();
        one.add("gray");
        one.add("brown");
        one.add("yellow");
        one.add("red");
        one.add("blue");

        HashSet<String> two = new HashSet<>();
        two.add("red");
        two.add("green");
        two.add("brown");
        two.add("purple");
        two.add("blue");
        two.add("gray");

        HashSet<Integer> numbers = new HashSet<>();
        Random rnd = new Random();
        numbers.add(rnd.nextInt(100)+1);
        numbers.add(rnd.nextInt(100)+1);
        numbers.add(rnd.nextInt(100)+1);
        numbers.add(rnd.nextInt(100)+1);
        numbers.add(rnd.nextInt(100)+1);
        numbers.add(rnd.nextInt(100)+1);

        System.out.println("Задание 1");
        System.out.println(arrayFromArray(one, two)+"\n");

        System.out.println("Задание 2");
        for (Integer x:numbers) {
            int n = x % 2;
            if (x > 15 && n==0) {
                System.out.println("Правильное число: " + x);
            } else {
                System.out.println("Деление на 2: " + ((double)x)/2);
            }
        }
    }

    static<T> HashSet<T> arrayFromArray(HashSet<T> one, HashSet<T> two){
        final HashSet<T> result = new HashSet<>();
        if (one.size() > two.size()) {
            for (T x:two) {
                if (one.contains(x)) {
                    result.add(x);
                }
            }
        } else {
            for (T x:one) {
                if (two.contains(x)) {
                    result.add(x);
                }
            }
        }

        return result;
    }
}