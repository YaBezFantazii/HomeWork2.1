package Theme2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //Задачи из 4 лекции 2 подтемы.

        Scanner console = new Scanner(System.in);

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
    }
}
