public class Circle implements Figure {
    private double radius;
    private static final double P=3.14;

    public Circle(double r){
        this.radius=r;


    }

    @Override
    public double calculate() {
        return P*radius*radius;
    }
}
