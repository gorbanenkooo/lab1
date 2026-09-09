import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

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

    public void run(Scanner scanner) {
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

    private int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }
}