package HW_1;

public class Men extends FameliTree {

    public Men(String furstName, String lastName, Integer idPerson) {
        this.furstName = furstName;
        this.lastName = lastName;
        this.idPerson = idPerson;
    }

    public String apper() {
        return "Hi  ";
    }

    @Override
    public void familyMen() {
        System.out.println("по мужской линии");
    }
}
