/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Lambdal01 { // 교재 2권 794p 참고 람다부분
    public static void main(String args[ ]) { // furfunction 뜻 : 입력값이 같으면 출력값이 일정하다.

        int i = Interface101.howMamyChar("Hello Wolrd");
        System.out.println(i);
    }

    int howManyChar(String s) {
        return s.length();
    }
    // 같은의미 s -> s.length();

    boolean isEven(int a) {
        return a % 2 == 0;
    }
    // 같은 의미...? a -> a % 2 == 0;  하나일경우 ()생략가능

    int max(int a, int b) {
        return a > b ? a: b;
    }
    // 같은 의미  (a, b) ->  a > b ? a : b;
}
