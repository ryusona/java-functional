import java.util.Comparator;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class MyComparator implements Comparator<String> { // 메소드로 빼서 쓸때는 이렇게

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
