package Prob3;

public interface FlyBehavior{
    default void fly(){
        System.out.println("\tcannot fly");
    }
}