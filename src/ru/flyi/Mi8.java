package ru.flyi;

// публичный - клас МИ8 - наследуем от Helicopter - реализуем интерфейс VerticalTakeoff
public class Mi8 extends Helicopter implements VerticalTakeoff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");

    }

    @Override
    public void varticalTakeoff() {
        System.out.println("Helicopter Mi8 vertical - вертолет МИ8 вертикальный");
    }
}
