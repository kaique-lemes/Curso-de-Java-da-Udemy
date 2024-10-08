package POO.Classes;

public class Triangulo {

    private double a;
    private double b;
    private double c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getData() {
        System.out.println("\n A: " + a + "\n B: " + b + "\n C: " + c);
    }

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }


}
