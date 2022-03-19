package W02;
// 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
/*
X X X 8 ==> 1,000개 ( X X X 는 세자리이므로 0 0 0 ~ 9 9 9 까지 천개)

X X 8 X ==> 1,000개

X 8 X X ==> 1,000개

8 X X X ==> 1,000개

인데... 코드로 어떻게 표현을 하느냐...

 */

public class Q_5 {
    public static void main(String[] args) {
        int sum = 0;
        int e = 8;
        for (int i = 0; i <= 10000; i++) {
            if ((i / 10^(1 - 1)) % 10 == e) {
                sum++;
            }
            if ((i / 10^(2 - 1)) % 10 == e) {
                sum++;
            }
            if ((i / 10^(3 - 1)) % 10 == e) {
                sum++;
            }
            if ((i / 10^(4 - 1)) % 10 == e) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
