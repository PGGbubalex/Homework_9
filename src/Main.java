import java.util.Random;

public class Main {

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        System.out.println("Задание 1");

        int[] arr = generateRandomArray();
        int amount = 0;

        for (int i = 0; i < arr.length; i++) {
            amount = amount + arr[i];
        }
        System.out.printf("Сумма трат за месяц сосатвила %d рублей.\n", amount);

        System.out.println();
    }

    public static void task2() {

        System.out.println("Задание 2");

        int[] arr = generateRandomArray();

        int maxWaste = 0;
        int minWaste = 200_000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minWaste) {
                minWaste = arr[i];
            }
            if (arr[i] > maxWaste) {
                maxWaste = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.\n", minWaste, maxWaste);
        System.out.println();
    }

    public static void task3() {

        System.out.println("Задание 3");

        int[] arr = generateRandomArray();
        double averageSpent = 0;

        for (int i = 0; i < arr.length; i++) {
            averageSpent = averageSpent + arr[i];
        }
        averageSpent = averageSpent / arr.length;

        System.out.printf("Средняя сумма трат за месяц сосатвила %.2f рублей.\n", averageSpent);
        System.out.println();
    }

    public static void task4() {

        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


