import java.util.Scanner;

public class Services  {
    Scanner sc=new Scanner(System.in);
    public void operation(){
        System.out.println("Hansi fiqur hesablamasi isteyirsiniz?");
        int geledeyer=sc.nextInt();
        if(geledeyer==1){
            System.out.println("Kvadratin terefini daxil edin");
            int teref=sc.nextInt();

            Square obj1=new Square(teref);
           double result=   obj1.calculate();
            System.out.println(result);
        }
        else if (geledeyer==2){
            System.out.println("Ucbucagin oturacagini daxil edin");
            int oturacaq=sc.nextInt();
            System.out.println("Ucbucagin hundurluyunu daxil edin");
            int hundurluk= sc.nextInt();
            Triangle triangle =new Triangle(hundurluk,oturacaq);
            double result= triangle.calculate();
            System.out.println(result);
        }
        else if (geledeyer==2){
            System.out.println("Dairenin radiusunu qeyd edin");
            int radius=sc.nextInt();
            Circle circle=new Circle(radius);
            double result=circle.calculate();
            System.out.println(result);
        }
        else if (geledeyer==2){
            System.out.println("Trapesiyanin birinci oturacagini daxil edin");
            double oturacaq1= sc.nextDouble();
            System.out.println("Trapesiyanin ikinci oturacagini daxil edin");
            double oturacaq2=sc.nextDouble();
            System.out.println("Trapesiyanin hundurluyunu daxil edin");
            double hundurluk=sc.nextDouble();
            Trapezium trapesiya=new Trapezium(oturacaq1,oturacaq2,hundurluk);
            double result=trapesiya.calculate();
            System.out.println(result);

    }


}}
