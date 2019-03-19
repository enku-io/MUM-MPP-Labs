import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class prob2 {
    public static void main(String[] args) {

        IntStream myIntStream = IntStream.of(12,1231,34,5,6,77,453,88,55,9,34,5,6,77);
        IntSummaryStatistics stats = myIntStream.collect(IntSummaryStatistics::new,
                IntSummaryStatistics::accept, // add the elements into DoubleSummaryStatistics
                IntSummaryStatistics::combine);
        System.out.println("MAX = " + stats.getMax() + " MIN = " + stats.getMin());

    }

}
