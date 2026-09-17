import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main lab = new Main();

        while (true) {
            System.out.println("1 - Задание 1 (3, 4, 6, 8, 10)");
            System.out.println("2 - Задание 2 (1, 4, 5, 7, 9)");
            System.out.println("3 - Задание 3 (2, 3, 6, 8, 9)");
            System.out.println("4 - Задание 4 (1, 2, 4, 7, 10)");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");

            int choice = readInt(scanner);
            if (choice == 0) break;

            switch (choice) {
                case 1 -> lab.runTask1(scanner);
                case 2 -> lab.runTask2(scanner);
                case 3 -> lab.runTask3(scanner);
                case 4 -> lab.runTask4(scanner);
                default -> System.out.println("Некорректный ввод.");
            }
        }
        scanner.close();
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    private static char readChar(Scanner scanner) {
        return scanner.next().charAt(0);
    }

    // --- ЗАДАНИЕ 1 ---

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

    private void runTask1(Scanner scanner) {
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

    // --- ЗАДАНИЕ 2 ---

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

    private void runTask2(Scanner scanner) {
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

    // --- ЗАДАНИЕ 3 ---

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

    private void runTask3(Scanner scanner) {
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

    // --- ЗАДАНИЕ 4 ---

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int countPositive(int[] arr) {
        int count = 0;
        for (int val : arr) {
            if (val > 0) count++;
        }
        return count;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, res, 0, pos);
        System.arraycopy(ins, 0, res, pos, ins.length);
        System.arraycopy(arr, pos, res, pos + ins.length, arr.length - pos);
        return res;
    }

    public int[] deleteNegative(int[] arr) {
        return Arrays.stream(arr).filter(v -> v >= 0).toArray();
    }

    private void runTask4(Scanner scanner) {
        int[] arr = {1, -2, 3, 4, 2, -2, 5};
        System.out.println("Массив: " + Arrays.toString(arr));

        System.out.print("4.1 Найти X: ");
        System.out.println(findFirst(arr, readInt(scanner)));

        System.out.print("4.2 Найти X (с конца): ");
        System.out.println(findLast(arr, readInt(scanner)));

        System.out.println("4.4 Положительных: " + countPositive(arr));

        System.out.println("4.7 Вставка: " + Arrays.toString(add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 2)));

        System.out.println("4.10 Без отрицательных: " + Arrays.toString(deleteNegative(arr)));
    }
}