import java.util.Scanner;

public class Task2 {

    public int abs(int x) {
        return Math.abs(x);
    }

    public String makeDecision(int x, int y) {
        if (x > y) return x + " > " + y;
        if (x < y) return x + " < " + y;
        return x + " == " + y;
    }

    public int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public String day(int x) {
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }

    public void run(Scanner scanner) {
        System.out.print("2.1 Число: ");
        System.out.println(abs(readInt(scanner)));

        System.out.print("2.4 Числа X и Y: ");
        System.out.println(makeDecision(readInt(scanner), readInt(scanner)));

        System.out.print("2.5 Числа X, Y, Z: ");
        System.out.println(max3(readInt(scanner), readInt(scanner), readInt(scanner)));

        System.out.print("2.7 Числа X и Y: ");
        System.out.println(sum2(readInt(scanner), readInt(scanner)));

        System.out.print("2.9 День: ");
        System.out.println(day(readInt(scanner)));
    }

    private int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }
}