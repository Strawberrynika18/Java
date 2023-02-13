package seminar1;
/* Вывести все простые числа от 1 до 1000 */

/* сделала, что можно ввести до какого числа будут выводится простые числа */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  диапозон до 1000: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> n = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                n.add(i);
            }
        }
        System.out.println("Простые числа: " + n);
    }
}