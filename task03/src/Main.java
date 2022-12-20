import java.io.FileNotFoundException;

/*
Задание:
Дан следующий код, исправьте его там, где требуется:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
//            abc[3] = 9;  // Введем корректное значение индекса
            abc[1] = 9;

//        } catch (Throwable ex) {  // Этот catch должен быть последним
//            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {  // Этот catch был первым
            System.out.println("Что-то пошло не так...");
        }
    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
      public static void printSum(Integer a, Integer b) {  // Бросать FileNotFoundException не нужно
                                                           // с файлами не работаем в этом методе
        System.out.println(a + b);
    }
}

/* Вывод программы:
30
257
 */