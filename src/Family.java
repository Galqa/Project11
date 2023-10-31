/* Програма визначає, яка сім'я (прізвище) живе у місті:
Приклад введення:
· Маріуполь(назва міста змінена із особистих переконань)
· Іванови
· Київ
· Петрови
· Дніпро
· Абрамовичі
Приклад введення:
· Дніпро
Приклад виведення:
· Абрамовичі
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Family {
    public static void main(String[] args) {
        Map<String, String> cityFamilyMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть  назву міста та  прізвище сім'ї, яка в ньому живе:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введіть назву міста:");
            String city = scanner.nextLine();
            System.out.println("Введіть прізвище сім'ї:");
            String family = scanner.nextLine();
            cityFamilyMap.put(city, family);
        }

        System.out.println("Введіть назву міста, щоб дізнатися, яка сім'я в ньому живе:");
        String inputCity = scanner.nextLine();

        if (cityFamilyMap.containsKey(inputCity)) {
            System.out.println(inputCity + " - " + cityFamilyMap.get(inputCity));
        } else {
            System.out.println("Немає інформації про сім'ю, яка живе в " + inputCity);
        }
    }
}














