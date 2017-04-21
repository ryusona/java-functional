import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Sample { // String 값으로 저장된 숫자들을 int형으로 변환 후 숫자 크기대로 sorting 하는

    public static void main(String args[]) {

        List<String> list = Arrays.asList("100", "200", "10000"
                                                , "250", "300", "500", "1000", "5000", "150");

        System.out.println("정렬 전 값은 : " + list);

//        Comparator c = new Comparator<String>() { // MyComparator 라는 클래스 대신 사용// 익명 커페레터 라고도함
//            public int compare(String o1, String o2) {
//                int aa = Integer.parseInt(o1);
//                int bb = Integer.parseInt(o2);
//
//                return aa - bb; // 양수가 나오면 앞의값값크고 음수가 나오면 뒤에값이 크고?
//            }
//        };
//        Collections.sort(list, c); // 첫번째는 정렬할 값(list), 두번째는 정렬시킬 방법(c)

        Collections.sort(list, (o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));
                                            // 람다함수 사용하면 위의 주석처리된 부분을 한줄로 요약할수있음

        System.out.println("정렬 후 값은 : " + list);

    }
}
