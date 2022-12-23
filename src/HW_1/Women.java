package HW_1;

public class Women extends Fameli implements FamilyWomen {

    public Women(String furstName, String lastName, Integer idPerson) {
        this.furstName = furstName;
        this.lastName = lastName;
        this.idPerson = idPerson;

    }

    public String apper() {
        return "SHI  ";
    }
    public void familyWomen(){
        System.out.println("по женской линии");
    }
}
