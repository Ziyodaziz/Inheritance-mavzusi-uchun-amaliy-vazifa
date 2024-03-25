package InheritanceLesson.Electronika;

public class Loudspeaker extends Sounds{

    private void narx() {
        System.out.println("Narxi: 50$");
    }

    public static void main(String[] args) {
        Loudspeaker loudspeaker = new Loudspeaker();
        loudspeaker.setTuri("Karnay");

        loudspeaker.setModel("Stereo");
        loudspeaker.setQuvvat("Karnay quvvat oladi");

        loudspeaker.narx();

        System.out.println("Turi: " + loudspeaker.getTuri());
        System.out.println("Modeli: " + loudspeaker.getModel());
        System.out.println(loudspeaker.getQuvvat());
    }
}
