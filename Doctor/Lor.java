package InheritanceLesson.Doctor;

public class Lor extends Doctor{

    private void ish(){
        System.out.println("Quloq, burun, tomoq kasalliklar doktori.");
    }

    public static void main(String[] args) {
        Lor lor = new Lor();
        lor.vazifasi();
        lor.ish();
        lor.setName("Azizbek Azizov");
        lor.setTuri("Quloq shifokori");

        System.out.println("Doktor ism familyasi: " + lor.getName());
        System.out.println("Turi: " + lor.getTuri());
    }
}
