import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("apple","carrot","orange"));
        System.out.println(countWords(input,'a','d',5));
    }
    public static long countWords(List<String> words, char c, char d, int len){
        return words.stream()
                .filter(s->s.indexOf(c) >= 0)
                .filter(s->s.indexOf(d) == -1)
                .filter(s->s.length() == len)
                .count();
    }
}
