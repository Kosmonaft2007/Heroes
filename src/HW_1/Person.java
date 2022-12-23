package HW_1;

public class Person {
    String name;
    int agePerson;

    public Person(String name, int agePerson) {
        this.name = name;
        this.agePerson = agePerson;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person vlad = new Person();
        vlad.name = "Vlad";
        vlad.agePerson = 23;

        System.out.println(vlad);
        System.out.println(Integer.toHexString(vlad.hashCode()));

        Person some = new Person("Some", 5);
        System.out.println(some);
        some.setName("newSomeName");
        System.out.println(some);
    }
}
