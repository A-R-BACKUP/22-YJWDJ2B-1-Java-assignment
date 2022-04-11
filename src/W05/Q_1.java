package W05;

class MyDate{
    int year;
    int month;
    int day;
    String monthly;
    String print1(){
        return (year +"."+month +"."+ day);
    }
    String print2(){
        return (monthly +" "+ day +","+ year);
    }
}

public class Q_1 {
    public static void main(String[] args) {
        MyDate p = new MyDate();
        p.year =2012;
        p.month = 7;
        p.monthly = "July";
        p.day = 12;
        System.out.println(p.print1());
        System.out.print(p.print2());
    }
}