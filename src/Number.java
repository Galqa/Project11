import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* Мінімальне з N чисел (використовувати LinkedList):
1. Введіть із клавіатури число N.
2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
3. Знайти мінімальне число серед елементів списку – метод getMinimum.
 */


public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число N: ");
        int N = scanner.nextInt();

        List<Integer> list = getIntegerList(N);
        System.out.println("Мінімальне число: " + getMinimum(list));
    }

    public static List<Integer> getIntegerList(int N) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести " + N + " чисел:");
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

}
