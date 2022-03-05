package Theme6;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

    //  Задачи из 4 лекции 6 подтемы.

    // Первые 3 задачи из 6 я немного изменил (не меняя их сути) чтобы сократить кол-во кода
        System.out.println("//Первые 3 задачи из 6 я немного изменил (не меняя их сути) чтобы сократить кол-во кода//");
    Scanner console = new Scanner(System.in);
    int[] Number = new int[4];
        System.out.println("Введите первое число:");
    Number[0] = console.nextInt();
        System.out.println("Введите второе число:");
    Number[1] = console.nextInt();
        System.out.println("Введите третье число:");
    Number[2] = console.nextInt();
        System.out.println("Введите четвертое число:");
    Number[3] = console.nextInt();

    // Метод сортировки пузырьком
    boolean needIteration = true;
        while (needIteration) {
        int swap;
        needIteration = false;
        for (int i = 1; i < Number.length; i++) {
            if (Number[i] > Number[i - 1]) {
                swap = Number[i];
                Number[i] = Number[i-1];
                Number[i-1] = swap;
                needIteration = true;
            }
        }
    }
        System.out.println("Последнее число в массиве самое маленькое (задача 1), первое - самое большое (задача 2)," +
                " и происходит сортировка по убыванию (задача 3)");
        System.out.println(Arrays.toString(Number));

    //Ввод данных для задач 4,5 и 6
        System.out.println("Ввод данных для задач 4,5,6 :");
        console.nextLine();
        System.out.println("Введите имя первого человека");
    String Man1 = console.nextLine();
        System.out.println("Введите имя второго человека");
    String Man2 = console.nextLine();
        System.out.println("Введите возраст человека");
    int age = console.nextInt();

    //Задача 4
        System.out.println("///Задача 4///");
        if (Man1.equals(Man2)) {
        System.out.println("Имена одинаковы");
    } else if (Man1.length()==Man2.length()) {
        System.out.println("Имена одинаковой длинны");
    } else {
        System.out.println("Имена различны");
    }

    //Задачи 5 и 6
        System.out.println("///Задача 5 и 6///");
        if (age<18) {
        System.out.println("Подрасти еще");
    } else if (age>20){
        System.out.println("И 18-ти достаточно");
    } else {
        System.out.println("От 18 до 20");
        }
}
}
