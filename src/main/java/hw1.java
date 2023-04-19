import java.util.Arrays;

public class hw1 {
    public static void main(String[] args) {
        int[] myArr1 = {1,2,3,4,5};
        int[] myArr2 = {1,2,3,4,5,};

        // System.out.println(div(6, 0));
        //System.out.println(getValue(myArr1, 7));
        printarr(divarr(myArr1, myArr2));
        printarr(difarr(myArr1, myArr2));
    }

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static float div(int a, int b){
        if(b == 0){
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    public static int getValue(int[] arr, int index){
        if(index >= arr.length || index < 0){
            throw new ArrayIndexOutOfBoundsException("Не допустимый индекс");
        }
        return arr[index];
    }

    public static void printarr(int[] arr){
        if(arr == null){
            throw new NullPointerException("Массив пустой");
        }
        System.out.println(Arrays.toString(arr));
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен разности элементов
    // двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
    // как-то оповестить пользователя.
    public static int[] difarr(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("длины массивов не равны");
        }
        int[] res = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
    // возвращающий новый массив, каждый элемент которого равен частному элементов двух
    // входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
    // оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
    // пользователь может увидеть - RuntimeException, т.е. ваше.
    public static int[] divarr(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("длины массивов не равны");
        }
        int[] res = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            if(arr2[i] ==0){
                throw new RuntimeException("Деление на ноль");
            }
            res[i] = arr1[i] / arr2[i];
        }
        return res;
    }

}
