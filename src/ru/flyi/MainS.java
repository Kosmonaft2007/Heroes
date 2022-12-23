package ru.flyi;

public class MainS {
    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boeing373 boeing373 = new Boeing373();

        Test test= new Test();
        test.foo(mi8);
        test.foo(boeing373);

        test.fooo(mi8);
//        test.fooo(boeing373);
    }
}
