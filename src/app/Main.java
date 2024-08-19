package app;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double PI = 3.141592653589793;
    static int[] array = new int[]{5, 8, 7, 4};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d.\n\n", number, toSquare(number));

        System.out.print("2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + cylinderVolume(radius, height) + "\n");

        System.out.println("3. Масив чисел: " + Arrays.toString(array));
        System.out.printf("Сума всіх елементів масиву дорівнює %d.\n\n", sumOf(array));
        // Для очистки буфера, якщо не використати то наступний виклик nextLine() не працюватиме
        scanner.nextLine();

        System.out.print("4. Введіть рядок: ");
        String str = scanner.nextLine();
        System.out.printf("Рядок у зворотньому порядку: %s\n\n", reverse(str));

        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.printf("Результат %d^%d дорівнює %d.\n\n", a, b, exponentiate(a, b));

        System.out.print("6. Введіть ціле число n: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        repeat(n, text);
    }

    static int toSquare(int number) {
        return number * number;
    }

    static double cylinderVolume(double radius, double height) {
        return PI * radius * radius * height;
    }

    static int sumOf(int[] array) {
        int sum = 0;
        for (int number: array) {
            sum += number;
        }

        return sum;
    }

    static String reverse(String str) {
        String result = "";
        String[] chars = str.split("");
        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i];
        }

        return result;
    }

    static long exponentiate(int a, int b) {
        long result = 1;
        int i = 0;
        while (i < b) {
            result *= a;
            i++;
        }

        return result;
    }

    static void repeat(int n, String text) {
        int i = 0;
        while (i < n) {
            System.out.println(text);
            i++;
        }
    }
}
