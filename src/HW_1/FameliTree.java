package HW_1;

public abstract class FameliTree {
    String furstName;
    String lastName;
    Integer idPerson;

    public abstract void familyMen();

    public void mom (FamilyWomen familyWomen){
        familyWomen.familyWomen();
    }


    public void printInfo() {
        System.out.println(printString());
    }

    public String apper() {
        return null;
    }

    public String printString() {
        return apper() + "Fameli{" +
                "furstName='" + furstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idPerson=" + idPerson +
                '}';
    }

}
