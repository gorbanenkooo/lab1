import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        while (true) {
            System.out.println("1 - Задание 1");
            System.out.println("2 - Задание 2");
            System.out.println("3 - Задание 3");
            System.out.println("4 - Задание 4");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");

            int choice = readInt(scanner);
            if (choice == 0) break;

            switch (choice) {
                case 1 -> task1.run(scanner);
                case 2 -> task2.run(scanner);
                case 3 -> task3.run(scanner);
                case 4 -> task4.run(scanner);
                default -> System.out.println("Некорректный ввод.");
            }
        }
        scanner.close();
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }
}