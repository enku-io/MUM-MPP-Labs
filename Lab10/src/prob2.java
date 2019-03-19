import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class prob2 {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
        return list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(secondSmallest(Arrays.asList("Bob", "Riddle", "Shane", "Quenonez", "Quarter", "Jack")));
        System.out.println(secondSmallest(Arrays.asList(123,112,45,123,4566,88,9,23,455,6,9,888,75,4,4564,45)));
        System.out.println(secondSmallest(Arrays.asList(
                        LocalDate.of(2021,1,1),
                        LocalDate.of(2025, 9,19),
                        LocalDate.of(2019, 3,19))));
    }
}
