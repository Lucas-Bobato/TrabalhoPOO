public class EquacaoSegundoGrau {

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public EquacaoSegundoGrau(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean calcular(){
        double delta = b*b - (4 * c *a);

        if (delta < 0 ){
            System.out.println("Delta negativo");
            return false;
        }
        double raizDelta = Math.sqrt(delta); // Math.sqrt é Raiz Quadrada.
        double denominador = 2 * a;

        x1 = (-b + raizDelta) / denominador;
        x2 = (-b - raizDelta) / denominador;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        return true;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
