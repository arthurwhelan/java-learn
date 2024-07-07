package com.walking.lesson7_methods_varargs_overloading_method_recursion.task1;

// Написать программу, которая объединяет любое количество строк, объединяя их через пробел.
// Реализацию конкатенации строк вынести в отдельный метод.

public class StringConcatenation {
    public static void main(String[] args) {
        String concatenatedString = mergeStrings("Lorem", "ipsum", "dolor", "sit", "amet");

        System.out.println(concatenatedString);
    }

    static String mergeStrings(String ...strings) {
       String mergedStrings = "";

       for (int i = 0; i < strings.length; i++) {
           mergedStrings += strings[i] == strings[strings.length - 1] ? strings[i] : strings[i] + " ";
       }

       return mergedStrings;
    }
}
