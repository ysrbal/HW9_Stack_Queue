package com.yasar.Question1;

import java.util.Stack;

public class StackRunner {
    public static void main(String[] args) {
        System.out.println("Kelime palindrom mu? .... : " + isPalindrome("kek")); ;
    }

    public static boolean isPalindrome(String kelime) {

        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);
            characterStack.push(ch);
        }
        String tersKelime = "";
        while (!characterStack.isEmpty()) {
            tersKelime += characterStack.pop();
        }
        return (kelime.equalsIgnoreCase(tersKelime));
    }
}
