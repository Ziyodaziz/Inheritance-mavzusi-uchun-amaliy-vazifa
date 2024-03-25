package InheritanceLesson.Electronika;

public class Laptop extends Computers{

    private void narx(){
        System.out.println("Narxi: 900$");
    }



    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setTuri("Notebook");

        laptop.setModel("Asus");
        laptop.setQuvvat("Kompyuter quvvat oladi");

        laptop.narx();

        System.out.println("Turi: " + laptop.getTuri());
        System.out.println("Modeli: " + laptop.getModel());
        System.out.println(laptop.getQuvvat());

    }
}
