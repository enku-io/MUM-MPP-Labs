package prob8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        transactions.stream()
                .filter(t->t.getYear() == 2011)
                .sorted((t1,t2) -> (new Integer(t1.getValue()).compareTo(new Integer(t2.getValue()))));

        
        // Query 2: What are all the unique cities where the traders work?
        transactions.stream()
                .map(t->t.getTrader().getCity())
                .collect(Collectors.toSet());

        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter(t->t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .sorted((t1,t2)->t1.getTrader().getName().compareTo(t2.getTrader().getName()));
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        transactions.stream()
                .map(t->t.getTrader().getName())
                .sorted((s1,s2)->s1.compareTo(s2))
                .reduce("",(s,t)->(new StringBuilder(s).append(" " + t).toString()));

        // Query 5: Are there any trader based in Milan?
        System.out.println( (transactions.stream().filter(t->t.getTrader().getCity().equalsIgnoreCase("milan")).count() > 0) ? "YES" : "NO");
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(t->t.getTrader().getCity().equalsIgnoreCase("milan"))
                .forEach(t->t.getTrader().setCity("Cambridge"));
        
        // Query 7: What's the highest value in all the transactions?
        transactions.stream()
                .sorted((t1,t2)->(new Integer(t1.getValue())).compareTo(new Integer(t2.getValue())))
                .limit(1);
    }
}
