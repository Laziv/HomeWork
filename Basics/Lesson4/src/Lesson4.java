import java.util.Scanner;

public class Lesson4 {
    public static void main(String agrs[]) {
        //1
        for (int i = 1; i <= 55; i += 2) {
            System.out.println(i);
        }
        //2
        for (int j = 90; j >= 0; j -= 5) {
            System.out.println(j);
        }
        //3
        System.out.println("Введіть число для перевірки парне чи непарне");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Число " + n + " є парним");
        } else {
            System.out.println("Число " + n + " є непарним");
        }
        //4
        System.out.println("Переверіка найблищого числа до 10 із двох чисел \n Введіть перше число");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число");
        double num2 = scanner.nextDouble();
        if (Math.abs(num1 - 10) == Math.abs(num2 - 10)) {
            System.out.println("Числа однакові");
        } else if (Math.abs(num1 - 10) < Math.abs(num2 - 10)) {
            System.out.println("Переше число (" + num1 + ") є ближчем до 10");
        } else {
            System.out.println("Друге число (" + num2 + ") є ближчем до 10");
        }
        //5
        int min = 2147483647;
        int max = -2147483647;
        int[] arrayNumbers = new int[]{5, 45, 78, 654, 52, 64, 51, 5, 62, 98, 65, 45, 12, 7, 9, 2, 96};
        for (int с = 0; с < arrayNumbers.length; с++) {
            int number = arrayNumbers[с];
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }

        if (arrayNumbers.length > 0) {
            System.out.println("Минімальне число в масиві " + min);
            System.out.println("Максимальне число в масиві " + max);
        } else {
            System.out.println("Масив пустий");
        }


    }
}
