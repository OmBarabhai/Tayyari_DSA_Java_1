package OOP;

class ComplexNumber{

    double x;
    double y;

    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }

    void print(){
        if(y >= 0)
            System.out.println(x + " + " + y + "i");
        else
            System.out.println(x + " - " + (-y) + "i");
    }

    void add(ComplexNumber z){
        x += z.x;
        y += z.y;
    }

    void multiply(ComplexNumber z){

        double real = x*z.x - y*z.y;
        double imag = x*z.y + y*z.x;

        x = real;
        y = imag;
    }

    void divide(ComplexNumber c){

        double denominator = c.x*c.x + c.y*c.y;

        double real = (x*c.x + y*c.y)/denominator;
        double imag = (y*c.x - x*c.y)/denominator;

        x = real;
        y = imag;
    }
}

public class ComplexNumberClass {

    public static void main(String[] args) {

        ComplexNumber z1 = new ComplexNumber(2,4);
        ComplexNumber z2 = new ComplexNumber(7,-9);

        z1.print();

        z1.add(z2);
        z1.print();

        z1.multiply(z2);
        z1.print();

        z1.divide(z2);
        z1.print();
    }
}