import java.util.stream.Stream;

public class prob5 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Apple","Orrange","Banana","Apple Pie");
        streamSection(stringStream,1,2).forEach(System.out::println);
    }
    static Stream<String> streamSection(Stream<String> stream, int m, int n){
        return stream.skip(m).limit(n);
    }
}
