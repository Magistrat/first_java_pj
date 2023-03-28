import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        float num2 = scan.nextInt();

        System.out.print("Действие: ");

        String action = scan.nextLine();
        action = scan.nextLine();

        float res;
        switch (action) {
            case "+" -> res = num1 + num2;
            case "-" -> res = num1 - num2;
            case "*" -> res = num1 * num2;
            case "/" -> res = num1 / num2;
            default -> {
                System.out.println("Неверное действие" + action);
                res = 0;
            }
        }
        System.out.println(res);

    }
}