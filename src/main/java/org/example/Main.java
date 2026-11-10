package org.example;

import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Chkhorotsku";
        int vowelCount = 0;
        for (int i =0; i < text.length(); i++) {
            char vowel = text.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
                vowelCount++;
        }
            System.out.println("ხმოვნების რაოდენობა: " + vowelCount);

        int length = text.length();

            System.out.println("სტრინგის სიგრძე: " + length);

        if (length % 2 == 0) {
            System.out.println("ლუწი");
        }
            else {
            System.out.println("კენტი");

            }
        }
    }