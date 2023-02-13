package seminar1;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество чисел: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        System.out.printf("факториал: %d\n", factorial(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int factorial(int a) {
     if (a == 1) {
            return 1; }
        return (a * (a-1));
    }
    }
    
