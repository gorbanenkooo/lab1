import java.util.Scanner;

public class Task3 {

    public String reverseListNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x; i >= 0; i--) sb.append(i).append(" ");
        return sb.toString().trim();
    }

    public String chet(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) sb.append(i);
        return sb.toString();
    }

    public boolean equalNum(int x) {
        x = Math.abs(x);
        int lastDigit = x % 10;
        for (x /= 10; x > 0; x /= 10) {
            if (x % 10 != lastDigit) return false;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("*".repeat(i));
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "*".repeat(i));
        }
    }

    public void run(Scanner scanner) {
        System.out.print("3.2 X: ");
        System.out.println(reverseListNums(readInt(scanner)));

        System.out.print("3.3 X: ");
        System.out.println(chet(readInt(scanner)));

        System.out.print("3.6 Число: ");
        System.out.println(equalNum(readInt(scanner)));

        System.out.print("3.8 Высота: ");
        leftTriangle(readInt(scanner));

        System.out.print("3.9 Высота: ");
        rightTriangle(readInt(scanner));
    }

    private int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }
}