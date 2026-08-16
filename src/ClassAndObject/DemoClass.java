package ClassAndObject;


class Display {
    String name;

    public void display(String name) {
        this.name = name;
        System.out.println("Welcome to ABC " + name);
    }

    public void add(int a, int b) {
        System.out.println(a + b);

    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void mod(int a, int b) {
        System.out.println(a % b);

    }
}

public class DemoClass {
    public static void main(String[] args) {
        Display d = new Display();
        d.mod(12,3);
    }


}
