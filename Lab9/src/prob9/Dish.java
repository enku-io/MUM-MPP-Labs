package prob9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public static void main(String[] args) {
        System.out.println("Is there any Vegetarian meal available? " + (isVegeterianMealAvailable() ? "YES":"NO"));
        System.out.println("Is there any healthy menu have calories less than 1000? " + (isThereHealthyMenu() ? "YES":"NO"));
        System.out.println("Is there any unhealthy menu have calories greater than 1000? " + (isThereUnhealthyMenu()?"YES":"NO"));
        System.out.println("find and return the first item for the type of MEAT " + (findFirstMeatItem().isPresent()? findFirstMeatItem().get().getName() : "No Meat Item in Menu"));
        System.out.println("Total Calories = " + (calculateTotalCalories()));
        System.out.println("Total Calories using method reference = " + (calculateTotalCaloriesMethodReference()));

    }

    public static boolean isVegeterianMealAvailable(){
        return menu.stream().anyMatch(d->d.vegetarian);
    }
    public static boolean isThereHealthyMenu(){
        return menu.stream().anyMatch(d->d.calories<1000);
    }

    public static boolean isThereUnhealthyMenu(){
        return menu.stream().anyMatch(d->d.calories>1000);
    }

    public static Optional<Dish> findFirstMeatItem(){
        return menu.stream().filter(d->d.type==Type.MEAT).findFirst();
    }

    public static int calculateTotalCalories(){
        return menu.stream().map(d->d.calories).reduce(0,(t,d) -> d + t);
    }

    public static int calculateTotalCaloriesMethodReference(){
        return menu.stream().map(Dish::getCalories).reduce(0,(t,d) -> d + t);
    }

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
}