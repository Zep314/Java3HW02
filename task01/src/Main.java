import java.util.Scanner;

/*
Задание:
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Корректное рациональное число: %s%n", ((Float)myGetFloat()).toString());
    }

    public static float myGetFloat() {  // Метод для проверки корректности ввода рационального числа
        boolean exit = false;
        float fNumber = 0;
        Scanner scan = new Scanner(System.in);
        while (!exit) {
            System.out.print("Введите рациональное число: ");
            String input = scan.nextLine();
            try {
                fNumber = Float.parseFloat(input);
                exit = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат для рационального числа. Повторите ввод!");
            }
        }
        return fNumber;
    }
}

/* Вывод программы:
Введите рациональное число: й1ц
Неверный формат для рационального числа. Повторите ввод!
Введите рациональное число: -12.w2
Неверный формат для рационального числа. Повторите ввод!
Введите рациональное число:
Неверный формат для рационального числа. Повторите ввод!
Введите рациональное число: -15.15
Корректное рациональное число: -15.15
 */