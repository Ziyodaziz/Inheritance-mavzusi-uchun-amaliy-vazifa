package InheritanceLesson.Electronika;

public class PC extends Computers{

    private void narx() {
        System.out.println("Narxi: 1300$");
    }

    public static void main(String[] args) {
        PC pc = new PC();
        pc.setTuri("Uy kompyuteri");
        pc.setModel("Lenovo");

        pc.setQuvvat("Kompyuter quvvat olmaydi");

        pc.narx();

        System.out.println("Turi: " + pc.getTuri());
        System.out.println("Modeli: " + pc.getModel());
        System.out.println(pc.getQuvvat());
    }
}
