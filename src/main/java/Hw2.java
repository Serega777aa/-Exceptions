import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        System.out.println(inputFloat());
        input();

        // Если необходимо, исправьте данный код
        int[] intArray = null;
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }

        //Дан следующий код, исправьте его там, где требуется
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
    // приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float inputFloat() {
        while (true) {
            try {
                System.out.println("Введите дробное число");
                Scanner sc = new Scanner(System.in);
                float num = sc.nextFloat();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не дробное число");
            }
        }
    }

    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void input() {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if (num.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}


