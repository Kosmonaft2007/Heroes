package ru.heroes;

public class Phone {
    String number;
    String model;
    Integer weight;

//    this(); - вызов контруктора внутри класса
    public Phone(String number, String model, int weight) {
//        this.number = number;
//        this.model = model;
        // аналог 9 и 10 строчки
        this(number,model); // вызов конструктоа внутри конструктора
        this.weight = weight;
    }
    // overloading - перегрузка метода, когда создаем два конструктора
    // Методы (экземпляра, без слова static)
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';

    }

    // функция экземпляра
    //  phone1.receiveCall("Ales");
    public void receiveCall(String name) {
        System.out.println("Звонит кто то " + name);
    }
    public void receiveCall(String name, String number) {

        System.out.println("Звонит " + name + " номер " + number);
    }


    public static void main(String[] args) {
        //    new Phone; - вызов контруктора снаружи класса
        Phone phone1 = new Phone("1", "aaa", 10 ); //  первый конструктор
        Phone phone2 = new Phone("2", "bbb"); //  второй конструктор с двумя параметрами
        Phone phone3 = new Phone(); //  третий конструктор без параметров


        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Ales");
        phone2.receiveCall("Ales", "12345");
    }
}
