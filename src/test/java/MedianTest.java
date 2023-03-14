import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MedianTest {
    private static Comparator<Integer> INTEGER_COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    };

    public static int med(int a, int b, int c) {

        List<Integer> numbers = Arrays.asList(a, b, c);
        numbers.sort(INTEGER_COMPARATOR);
        System.out.println("В массиве: " + String.format("%s %s %s", a, b, c) + ", cреднее число: " + numbers.get(1));
       return numbers.get(1);
    }

    @Test
    public void shouldSeeMed(){
        assertThat("", med(1,2,3), is(2));
        assertThat("", med(2,4,3), is(3));
        assertThat("", med(17,0,28), is(17));
        assertThat("", med(-3,-1,-2), is(-2));
    }
}
