public class Triangle implements Figure {
    private double hundurluk;
    private double oturacaq;

    public Triangle(double a, double b){
        this.hundurluk=a;
        this.oturacaq=b;

    }


    @Override
    public double calculate() {
        return hundurluk*oturacaq/2;
    }
}
