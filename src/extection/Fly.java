package extection;

public class Fly {
    protected void finalize() {

        System.out.println("  your paqs has been set ");
    }

    public static void main(String[] args) {
        Fly obj = new Fly();
        obj=null;
        System.gc();

        System.out.println("Main method completed.");
    }
}
