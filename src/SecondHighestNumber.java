import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    public static int getSecondHighestNumber(int[] numbers) {
        int n1 = Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;

        for(int i : numbers) {
            if(i > n1) {
                n2 = n1;
                n1 = i;
            } else if((i > n2) && (i!=n1)) {
                n2 = i;
            }
        }
        return n2;
    }

    public static Integer getSecondHighestNumWithStreams(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Distinct Second highest number."));
    }
}
