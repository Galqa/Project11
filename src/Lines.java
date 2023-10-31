/* Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
1. Створити перелік рядків.
2. Ввести рядки з клавіатури та додати їх до списку.
3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
4. Вивести рядки на екран, кожен з нового рядка.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести рядки (введіть 'end' для завершення):");
        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            list.add(input);
        }
        System.out.println("Введено наступні рядки:");
        for (String string : list) {
            System.out.println(string);

        }

    }
}

