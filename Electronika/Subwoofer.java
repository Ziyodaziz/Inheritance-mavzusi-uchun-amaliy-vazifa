package InheritanceLesson.Electronika;

public class Subwoofer extends Sounds {

    private void narx() {
        System.out.println("Narxi: 10$");
    }

    public static void main(String[] args) {
        Subwoofer subwoofer = new Subwoofer();
        subwoofer.setTuri("Subwofer");

        subwoofer.setModel("EP-E019");
        subwoofer.setQuvvat("Subwofer quvvat olmaydi");

        subwoofer.narx();

        System.out.println("Turi: " + subwoofer.getTuri());
        System.out.println("Modeli: " + subwoofer.getModel());
        System.out.println(subwoofer.getQuvvat());

    }
}
