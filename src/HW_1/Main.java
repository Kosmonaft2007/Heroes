package HW_1;

public class Main {

    public static void main(String[] args) {
        Men ivanov = new Men("Petr", "Ivanov", 1);
        ivanov.familyMen();
        ivanov.printInfo();


        Women petrovaa = new Women("Petr", "Ivanov", 1);
        petrovaa.familyWomen();
        petrovaa.printInfo();


        Person person = new Person();


    }
}
