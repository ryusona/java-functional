/**
 * Created by danawacomputer on 2017-04-19.
 */
public interface Interface101 { // java8에서 말하는 인터페이스에 대한 이야기

    // 모든 변수는 public이고 statci이다. final - 재할당이 되지 않는 상수 개념
    // public static final
    int A_NUMBER = 5;

    // 모든 메소드는 public 이고 abstract 이다.
    // public abstract
    int max(int a, int b);
    default int min(int a, int b) {return  a;} // 인터페이스에 새로운 메소드 추가할 때 사용

    // 자바8에서 새로운 메소드인 default메소드 등장 인터페이스에 새로운 메소드 추가할 때 사용
    default boolean isEven(int a) {
        return a % 2 == 0;
    }

    // 자바8에서는 스태틱 메소드도 지원
    public static int howMamyChar(String s){
        return s.length();
    }
}

// 원래 interface를 implement 를 하기위해선 모든 메소드를 구현해 주었어야 했는데,
