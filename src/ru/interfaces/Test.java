package ru.interfaces;

public class Test {
    public static void main(String[] args) {
        //тип переменной соотвествует классу
        Animal animal_1 = new Animal(1);
        Person person_1 = new Person("Bob");
        animal_1.sleep();
        person_1.sayHello();
        // ВЫВОД интерфейса №1.0
        animal_1.showInfo();// вызов интерфейса
        person_1.showInfo();// не выводит ??????
        // ВЫВОД интерфейса №1.1
        outputInfo(animal_1);
        outputInfo(person_1);


        // -------------
        // ВЫВОД интерфейса №2
        //тип пересенной НЕ совпадает с классом, они оба реализуют интерфейс Info
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        // ВЫВОД интерфейса №2.0
        info1.showInfo();
        info2.showInfo();
        // ВЫВОД интерфейса №2.1
        outputInfo(info1); // реализован метод outputInfo, см ниже и можно без обьявление объекта строка 6 и 7
        outputInfo(info2);
    }

    public static void outputInfo(Info info) {
        info.showInfo();

    }
}
