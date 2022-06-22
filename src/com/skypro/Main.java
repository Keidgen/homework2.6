package com.skypro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1){
                System.out.print(num + " ");
            }
        }

        System.out.println("");
        // Задание 2
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsWithoutDouble = new ArrayList<>();
        for (Integer integer : nums2) {
            if (!numsWithoutDouble.contains(integer) && integer%2==0) {
                numsWithoutDouble.add(integer);
            }
        }
        Collections.sort(numsWithoutDouble);
        System.out.println(numsWithoutDouble.toString());

        // Задание 3
        List<String> listWords = new ArrayList<>(List.of("Гарри", "Поттер", "Гарри", "Каспаров", "Том", "Реддл", "Том", "Круз"));
        Set<String> setWords = new HashSet<>(listWords);
        System.out.println(setWords);

        // Задание 4
        List<String> listTexts = new ArrayList<>(List.of("Тест1", "Тест1", "Тест2", "Тест3", "Тест2", "Тест4", "Тест4", "Тест5"));
        HashSet<String> distinct = new HashSet<>(listTexts);
        int count = 0;

        for (String str: distinct) {
            if (listTexts.contains(str)) {
                listTexts.remove(str);
                count++;
                if (listTexts.contains(str)) {
                    count = count + 1;
                } else count--;
            }
        }
        System.out.println("Количество повторяющихся элементов = " + count);
    }
}