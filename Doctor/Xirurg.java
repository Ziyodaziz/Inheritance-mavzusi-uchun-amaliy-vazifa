package InheritanceLesson.Doctor;

public class Xirurg extends Doctor{

    private void ish(){
        System.out.println("Jaroxatlarni davolaydi.");
    }

    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg();
        xirurg.vazifasi();
        xirurg.ish();
        xirurg.setName("Ahmad Alijonov");
        xirurg.setTuri("Jarrox");

        System.out.println("Doktor ism familyasi: " + xirurg.getName());
        System.out.println("Turi: " + xirurg.getTuri());
    }
}
