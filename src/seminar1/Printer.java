package seminar1;

import java.util.Arrays;

//public class Printer {
//    public static void main(String[] args) {
////        Task1 ans = new Task1();
//        try {
//            Task1.arrayOutOfBoundsException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        }
//
//        try {
//            Task1.divisionByZero();
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        }
//
//        try {
//            Task1.numberFormatException();
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число");
//        }
//    }
//}

//public class Printer{
//    public static void main(String[] args) {
//        int[] a = {};
//        int[] b = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = new int[]{4, 5, 6};
//            b = new int[]{1, 2, 3};
//        }
//        else{
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        Task2 ans = new Task2();
//        String itresume_res = Arrays.toString(ans.subArrays(a, b));
//        System.out.println(itresume_res);
//    }
//}

public class Printer{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Task3 ans = new Task3();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}