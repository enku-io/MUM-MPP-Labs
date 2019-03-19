import java.util.stream.Stream;

public class prob1 {
    public static void main(String[] args) {
        System.out.println(Stream.of("Bill","Thomas","Merry")
                .reduce("",(s,t)->(new StringBuilder(s)).append(t+" , ").toString()));
    }
}
