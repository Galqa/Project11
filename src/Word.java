/* Використовуючи колекцію, подвоїти слово:
1. Введіть із клавіатури 5 слів до списку рядків.
2. Метод doubleValues повинен подвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ввести слово " + (i + 1) + ":");
            words.add(scanner.nextLine());
        }
        List<String> doubledWords = doubleValues(words);
        for (String word : doubledWords) {
            System.out.println(word);
        }
    }

    public static List<String> doubleValues(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            result.add(word);
            result.add(word);
        }
        return result;
    }
}
