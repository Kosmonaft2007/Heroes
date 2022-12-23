package HW_1;

public class Fameli {
    String furstName;
    String lastName;
    int ageid;
    String cpuntry;
    String gender;
    Integer parent;
    Integer idPerson;

    public Fameli(String furstName, String lastName, Integer idPerson) {
        this.furstName = furstName;
        this.lastName = lastName;
        this.idPerson = idPerson;

    }

    //    public GeoTree() {
//        this.furstName = "";
//        this.lastName = "";
//        this.age = 0;
//        this.cpuntry = "";
//        this.gender = "";
//        this.parent = null;
//        this.idPerson = null;
//    }
    public Fameli() {

    }

//    public void greetings(String msg) {
//        System.out.println(msg);
//    }

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
                ", ageid=" + ageid +
                ", cpuntry='" + cpuntry + '\'' +
                ", gender='" + gender + '\'' +
                ", parent=" + parent +
                ", idPerson=" + idPerson +
                '}';
    }
}
