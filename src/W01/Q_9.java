package W01;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("+, -, *, / 중 원하는 작업 입력: ");
        String operation = sc.next();
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            System.out.printf("첫번째 숫자 입력: ");
            int a = sc.nextInt();
            System.out.printf("두번째 숫자 입력: ");
            int b = sc.nextInt();
            switch (operation){
                case "+" :
                    System.out.printf(a + " + " + b + " = " + a + b);
                    break;
                case "-" :
                    System.out.printf(a + " - " + b + " = " + (a - b));
                    break;
                case "*" :
                    System.out.printf(a + " * " + b + " = " + (a * b));
                    break;
                case "/" :
                    System.out.printf(a + " / " + b + " = " + (a / b));
                    break;
            }
        } else {
            System.out.printf("잘못 입력하였습니다.");
        }

    }
}
