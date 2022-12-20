import java.util.Scanner;

/*
Задание:
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        String result = "";
        while (!exit) {
            try {
                result = myGetNotEmptyString();
                exit = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Нельзя вводить пустые строки! Повторите ввод!");
            }
        }
        System.out.printf("Введена строка: %s%n", result);
    }

    public static String myGetNotEmptyString() {  // Метод для проверки ввода непустой строки
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String input = scan.nextLine();
        if (input.length()<1) {
            throw new IllegalArgumentException("String is empty");  // Бросаем Exception
        }
        return input;
    }
}

/* Вывод программы:
Введите непустую строку:
Нельзя вводить пустые строки! Повторите ввод!
Введите непустую строку:
Нельзя вводить пустые строки! Повторите ввод!
Введите непустую строку: фыва
Введена строка: фыва

 */