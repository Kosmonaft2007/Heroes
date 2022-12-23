package ru.Lesson3.tast2;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumTask idFactor; // ссылка интерфейса
        idFactor = (n, d) -> (n % d) == 0;

        if (idFactor.task(10, 2)) {
            System.out.println("2 являемя делителем 10");
        }
        if (idFactor.task(10, 3)) {
            System.out.println("3 являемя делителем 10");
        }

        NumTask newFactor = (n, m) -> (n < m);
        if (newFactor.task(2, 10)) {
            System.out.println("2 меньше 10");

        }
        NumTask absFactir = (n, m) -> (n < 0 ? - n : n) == (m < 0 ? - m : m);

        if (absFactir.task(4, -4)) {
            System.out.println(" Абсалютная величины 4 (-4)");
        }
        if (absFactir.task(5, -5)) {
            System.out.println(" Абсалютная величины 5 (-5)");
        }
    }
}
