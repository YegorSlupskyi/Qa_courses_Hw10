package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Map<Character, Integer> letterEntries = new HashMap<>();
        char[] splitSentence = sentence.toCharArray();

        for (char letter : splitSentence) {
            if (!Character.isLetter(letter)) {
                continue;
            }
            char upperLetter = Character.toUpperCase(letter);
            if (!letterEntries.containsKey(upperLetter)) {
                letterEntries.put(upperLetter, 1);
            } else {
                letterEntries.put(upperLetter, (letterEntries.get(upperLetter) + 1));
            }
        }
        System.out.println(letterEntries);
    }
}




