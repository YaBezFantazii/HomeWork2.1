package com.company;

class Cat {
    private String FullName;

    // В задачах указано 2 разных способа ввода/получения общего кол-во котов, поэтому 2 переменные
    // catsCount1 - число котов которое подсчитывается внутри класса (+1 кот при создании нового объекта)
    private static int catsCount1 = 0;
    // catsCount2 - число котов которое указывается пользователем вводом с консоли
    private static int catsCount2 = 0;

    // Сеттер для присовения коту полного имени ( имя + фамилия )
    public void setName(String FirstName, String SecondName) {
        this.FullName = FirstName + " " + SecondName;
    }

    // Геттер для получения имя кота
    public String getName() {
        return this.FullName;
    }

    // Увеличиваем общее кол-во котов на 1 (catsCount1)
    public static void addNewCat()
    {
        catsCount1 = catsCount1 + 1;
    }

    // Геттер на получение общего числа котов (catsCount1)
    public static int GetCatsCount1 (){
        return catsCount1;
    }

    // Сеттер на присвоение переменной catsCount2
    // значения общего кол-ва котов, которое вводится пользователем (catsCount2)
    public static void SetCatsCount2(int catsCount)
    {
        catsCount2 = catsCount;
    }

    // Геттер для получения значения общего кол-во котов (catsCount2)
    public static int GetCatsCount2()
    {
        return catsCount2;
    }


}
