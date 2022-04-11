package W05;


class ComplexNumber{
    int real;
    int imag;
    String print(){
        return (real + imag + "i");
    }
}

public class Q_2 {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber();
        cn.real = 10;
        cn.imag = 21;
        System.out.print(cn.print());
    }
}