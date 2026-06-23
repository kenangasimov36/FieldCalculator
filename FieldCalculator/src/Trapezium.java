public class Trapezium implements Figure {
    private double oturacaq1;
    private double oturacaq2;
    private double hundurluk;

    public Trapezium(double a,double b,double h){
        this.oturacaq1=a;
        this.oturacaq2=b;
        this.hundurluk=h;
    }

    @Override
    public double calculate() {
        return (oturacaq2+oturacaq1)/2*hundurluk;
    }
}
