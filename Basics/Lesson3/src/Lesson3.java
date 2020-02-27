import java.util.Scanner;

public class Lesson3 {
    public static void main(String agrs[]) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть день тижня");
        String day = scanner.nextLine().toLowerCase();
        switch (day) {
            case "понеділок":
                System.out.println("На " + day + " заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            case "вівторок":
                System.out.println("На " + day + " заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            case "середа":
                System.out.println("На середу заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            case "четвер":
                System.out.println("На " + day + " заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            case "п'ятниця":
                System.out.println("На п'ятницю заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            case "субота":
                System.out.println("На суботу заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            case "неділя":
                System.out.println("На неділю заплановано \n 1) ... \n 2) ... \n 3) ...");
                break;
            default:
                System.out.println("Неправильно введено день тижня");
        }

        //2

        if (day.equals("понеділок")) {
            System.out.println("На " + day + " заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else if (day.equals("вівторок")) {
            System.out.println("На " + day + " заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else if (day.equals("середа")) {
            System.out.println("На середу заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else if (day.equals("четвер")) {
            System.out.println("На " + day + " заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else if (day.equals("п'ятниця")) {
            System.out.println("На п'ятницю заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else if (day.equals("субота")) {
            System.out.println("На суботу заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else if (day.equals("неділя")) {
            System.out.println("На неділю заплановано \n 1) ... \n 2) ... \n 3) ...");
        }
        else {
            System.out.println("Неправильно введено день тижня");
        }

        //3
        int number1 = Integer.parseInt(scanner.next());
        String operator = scanner.next();
        int number2 = Integer.parseInt(scanner.next());
        int sum = 0;
        switch (operator)
        {
            case "+":
                sum = number1 + number2;
                break;
            case "-":
                sum = number1 - number2;
                break;
            case "/":
                sum = number1 / number2;
                break;
            case "*":
                sum = number1 * number2;
                break;
            case "%":
                sum = number1 % number2;
                break;
            default:
                System.out.println("Недійсний оператор");
        }
        System.out.println(sum);
    }

}
