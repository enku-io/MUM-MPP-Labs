import java.util.stream.IntStream;

public class prob4 {
    public static void main(String[] args) {
        printSquares(4);
    }
    public static void printSquares(int num){
        IntStream.iterate(1,n->n+1)
                .map(n->n*n)
                .limit(num)
                .forEach((n)->System.out.println(n));
    }
}
