package InheritanceLesson.Doctor;

public class Doctor {

    public String name;
    public String turi;

    public void vazifasi(){
        System.out.println("Odamlarni davolash");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuri() {
        return turi;
    }

    public void setTuri(String turi) {
        this.turi = turi;
    }
}


