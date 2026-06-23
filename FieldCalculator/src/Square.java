
public class Square implements Figure{
    public double teref;

    public Square (double a){
        this.teref=a;
    }


    @Override
    public double calculate() {
       return teref*teref;
    }
}
