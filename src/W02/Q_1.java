package W02;

/*
답은 343400 이라는데... 모두들 171700 나온다고 하십니다... 답은 171700 인걸로...
 */

public class Q_1 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        for (int num = 1; num <= 100; num++){
            sum += num;
            // System.out.println(sum + "  sum <-> num  " + num);
            total += sum;
            // System.out.println(num + "'s total: " + total);
            // System.out.println();
        }
        System.out.println("합은: " + total);
    }
}
