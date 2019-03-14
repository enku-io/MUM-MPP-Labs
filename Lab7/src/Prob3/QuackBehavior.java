package Prob3;

public interface QuackBehavior{
    default void quack(){System.out.println("\tcannot quack");};
}