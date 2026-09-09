import java.util.Scanner;

public class Task1 {

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public boolean isDivisor(int a, int b) {
        return a != 0 && b != 0 && (a % b == 0 || b % a == 0);
    }

    public int lastNumSum(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }

    public void run(Scanner scanner) {
        System.out.print("1.3 Символ: ");
        System.out.println(charToNum(readChar(scanner)));

        System.out.print("1.4 Число: ");
        System.out.println(isPositive(readInt(scanner)));

        System.out.print("1.6 Символ: ");
        System.out.println(isUpperCase(readChar(scanner)));

        System.out.print("1.8 Числа A и B: ");
        System.out.println(isDivisor(readInt(scanner), readInt(scanner)));

        System.out.println("1.10 Введите 5 чисел:");
        int res = readInt(scanner);
        for (int i = 0; i < 4; i++) {
            res = lastNumSum(res, readInt(scanner));
        }
        System.out.println("Результат: " + res);
    }

    private int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    private char readChar(Scanner scanner) {
        return scanner.next().trim().charAt(0);
    }
}