/*
Задание:
Если необходимо, исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/

public class Main {
    public static void main(String[] args) {
        try {
//            int d = 0;
            int d = 2;  // d - будет знаменателем, потому не должно быть равно 0
            int[] Array = new int[6];  // Array - не был объявлен - объявляем
                                       // По-хорошему - его надо бы проинициализировать, ну да ладно...
//            double catchedRes1 = intArray[8] / d; // Ошибки в синтаксисе и обращении за предел массива
            double catchedRes1 = Array [4] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {  // Добавляем обработку искючения выхода за границу
                                                      // массива
            System.out.println("Catching exception: " + e);
        } catch (Throwable e) {  // на всчкий случай добавим, чтобы ловило все исключения
            System.out.println("Catching exception: " + e);
        }
    }
}

/* Вывод программы:
catchedRes1 = 0.0
 */