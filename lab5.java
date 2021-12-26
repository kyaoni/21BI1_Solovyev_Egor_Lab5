import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class lab5 {
    public static void main(String args[]) {
        int x = 0;
        int per = 0;
        float sum = 0;

        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Задайте число элементов коллекции: ");
            x = console.nextInt();
            System.out.println("Задайте элементы коллекции: ");
            ArrayList<Float> Alist = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                Alist.add(i, console.nextFloat());;
            }
            System.out.println("Введите число K. Элемент под этим номером заменится на среднее арифметическое первых K исходных элементов коллекции. Примечание: нумерация начинается с нуля.");
            per = console.nextInt();
            console.close();
            System.out.print("Оригинальное состояние коллекции: ");
            System.out.println(Alist);
            System.out.println();
            for (int i = 0; i < per; i++) {
                sum = sum + Alist.get(i);
            }
            sum = sum / (per);
            LinkedList<Float> Alistredo = new LinkedList<>();
            Alistredo.addAll(Alist);
            if ((per <= x) & (per > 0)) {
                Alistredo.set(per, sum);
                System.out.print("Итоговое состояние коллекции: ");
                System.out.println(Alistredo);
            } else {
                System.out.println("Элемент находится за границами коллекции либо вы пытались заменить первый элемент");
            }
        } catch (InputMismatchException e) {
            System.out.println("Перезапустите программу и введите другие значения");
        }
    }
}