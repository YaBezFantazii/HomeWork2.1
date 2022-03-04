package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//////////  Задачи из 4 лекции 2 подтемы. ///////////////////////////////////////////////////////////////////
        System.out.println("//////////////////////////////////Задачи из 4 лекции 2 подтемы.//////////////////////////");
        // Выполняем создание 4 котов, присваеваем им имя и фамилию и вызовом статичного метода addNewCat()
        // увеличиваем общее кол-во котов
        Cat cat1 = new Cat();
        cat1.setName("Муська", "Петров");
        Cat.addNewCat();
        Cat cat2 = new Cat();
        cat2.setName("Томас", "Иванов");
        Cat.addNewCat();
        Cat cat3 = new Cat();
        cat3.setName("Чижик", "Грачев");
        Cat.addNewCat();
        Cat cat4 = new Cat();
        cat4.setName("Лунтик", "Грачев");
        Cat.addNewCat();

        // Вводим общее кол-во котов с консоли (задача 3). Может не совпадать с реальным кол-во котов
        // (объектов), я не стал делать условия проверки, в задаче этого требования нет.
        System.out.println("Введите общее кол-во котов:");
        Cat.SetCatsCount2(console.nextInt());

        System.out.println("Все имена/фамилии котов:");
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
        System.out.println(cat3.getName());
        System.out.println(cat4.getName());
        System.out.println("Кол-во котов подсчитанных методом внутри класса Cat:");
        System.out.println(Cat.GetCatsCount1());
        System.out.println("Кол-во котов введеных пользователем самостоятельно:");
        System.out.println(Cat.GetCatsCount2());
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////  Задачи из 4 лекции 6 подтемы. ///////////////////////////////////////////////////////////////////
        System.out.println("//////////////////////////////////Задачи из 4 лекции 6 подтемы.//////////////////////////");

        // Первые 3 задачи из 6 я немного изменил (не меняя их сути) чтобы сократить кол-во кода
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
        console.nextLine();
        System.out.println("Введите имя первого человека");
        String Man1 = console.nextLine();
        System.out.println("Введите имя второго человека");
        String Man2 = console.nextLine();
        System.out.println("Введите возраст человека");
        int age = console.nextInt();

        //Задача 4
        if (Man1.equals(Man2)) {
            System.out.println("Имена одинаковы");
        } else if (Man1.length()==Man2.length()) {
            System.out.println("Имена одинаковой длинны");
        } else {
            System.out.println("Имена различны");
        }

        //Задачи 5 и 6
        if (age<18) {
            System.out.println("Подрасти еще");
        } else if (age>20){
            System.out.println("И 18-ти достаточно");
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////  Задачи из 4 лекции 10 подтемы. ///////////////////////////////////////////////////////////////////
        System.out.println("//////////////////////////////////Задачи из 4 лекции 10 подтемы./////////////////////////");
        // 1 задание
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        // 2 задание
        System.out.println();
        while (i-1>=1){
            System.out.print(i-1+" ");
            i--;
        }
        System.out.println();
        // 3 задание
        console.nextLine();
        System.out.println("Введите строку");
        String text = console.nextLine();
        System.out.println("Введите число");
        i = console.nextInt();
        while (i>0){
            System.out.println(text);
            i--;
        }
        // Задание 4 я не стал делать, так как оно упрощеное 5 задание
        // Задание 5
        System.out.println("\nТаблица умножения");
        int j=1;
        while (i<10){
            while (j<=10){
                System.out.print(j*(i+1)+" ");
                j++;
            }
            System.out.println();
            j=1;
            i++;
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////  Задачи из 4 лекции 13 подтемы. ///////////////////////////////////////////////////////////////////
        System.out.println("\n//////////////////////////////////Задачи из 4 лекции 13 подтемы./////////////////////\n");
        // Задание 1
        for (int g=2;g<=100;g=g+2){
            System.out.print(g+" ");
        }
        // Задание 2
        System.out.println("\nВведите число строк");
        int Number1 = console.nextInt();
        System.out.println("Введите число столбцов");
        int Number2 = console.nextInt();
        for (int g=0;g<Number1;g++){
            for (int y=0;y<Number2;y++){
                System.out.print('8');
            }
            System.out.println();
        }
        // Задание 3
        System.out.println();
        for (int g=1;g<=10;g++){
            for (int y=1;y<=g;y++){
                System.out.print("8");
            }
            System.out.println();
        }
        // Задание 4
        System.out.println();
        for (int g=0;g<10;g++){
            System.out.print("8");
        }
        System.out.println("\n");
        for (int g=0;g<10;g++){
            System.out.println("8");
        }
        // Задание 5
        console.nextLine();
        System.out.println("Введите имя:");
        String Name = console.nextLine();
        for (int g=0;g<10;g++) {
            System.out.println(Name+" любит меня.");
        }
    }
}