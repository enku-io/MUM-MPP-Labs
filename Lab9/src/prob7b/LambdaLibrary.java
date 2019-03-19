package prob7b;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary<S,R> {
    static Function<List<Employee>,List<Employee>> filterEmpList = (list)-> list.stream()
                .filter(e -> e.salary > 100000)
                .filter(e -> e.lastName.charAt(0) > 77)
                .sorted((e1, e2) -> e1.lastName.compareTo(e2.lastName))
                .collect(Collectors.toList());

}
