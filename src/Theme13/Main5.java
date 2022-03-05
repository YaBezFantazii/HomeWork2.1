package Theme13;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        //  Задачи из 4 лекции 13 подтемы.
        Scanner console = new Scanner(System.in);

        // Задание 1
        System.out.println("///Задание 1///");
        for (int g=2;g<=100;g=g+2){
            System.out.print(g+" ");
        }

        // Задание 2
        System.out.println("\n///Задание 2///");
        System.out.println("Введите число строк");
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
        System.out.println("\n///Задание 3///");
        for (int g=1;g<=10;g++){
            for (int y=1;y<=g;y++){
                System.out.print("8");
            }
            System.out.println();
        }
        // Задание 4
        System.out.println("\n///Задание 4///");
        for (int g=0;g<10;g++){
            System.out.print("8");
        }
        System.out.println("\n");
        for (int g=0;g<10;g++){
            System.out.println("8");
        }
        // Задание 5
        System.out.println("///Задание 5///");
        console.nextLine();
        System.out.println("Введите имя:");
        String Name = console.nextLine();
        for (int g=0;g<10;g++) {
            System.out.println(Name+" любит меня.");
        }
    }
}
