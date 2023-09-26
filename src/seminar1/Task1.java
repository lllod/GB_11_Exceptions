//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//Метод divisionByZero - Деление на 0
//Метод numberFormatException - Ошибка преобразования строки в число
//Важно: они не должны принимать никаких аргументов

package seminar1;

class Task1 {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

    }

    public static void divisionByZero() {
        System.out.println(1 / 0);

    }

    public static void numberFormatException() {
        int num = Integer.parseInt("a123");
        System.out.println(num);

    }
}


