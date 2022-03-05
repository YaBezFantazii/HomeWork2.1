package Theme10;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        // Задачи из 4 лекции 10 подтемы.
        Scanner console = new Scanner(System.in);

        // 1 задание
        System.out.println("///1 задание///");
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }

        // 2 задание
        System.out.println("\n///2 задание///");
        while (i-1>=1){
            System.out.print(i-1+" ");
            i--;
        }
        System.out.println();

        // 3 задание
        System.out.println("///3 задание///");
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
        System.out.println("///Задание 4 я не стал делать, так как оно упрощеное 5 задание///");
        System.out.println("///Задание 5///");
        System.out.println("Таблица умножения");
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
    }
}
