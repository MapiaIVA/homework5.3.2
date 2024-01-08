import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 10;
        }
        int sum = 0;
        boolean foundNegative = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {

                foundNegative = true;
            } else if (foundNegative) {
                sum += array[i];
            }
        }
        // Выводим массив на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Сумма элементов после первого отрицательного элемента: " + sum);

    }
}