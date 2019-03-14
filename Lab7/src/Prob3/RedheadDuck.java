package Prob3;

public class RedheadDuck extends Duck {


  /*  public RedheadDuck(){
        super(BehaviorFactory.getQuackBehavior(BehaviorFactory.QUACK), 
        BehaviorFactory.getFlyBehavior(BehaviorFactory.FLY_WITH_WINGS));
    } */

    public void display(){
        System.out.println("\tdisplaying");
    }

    @Override
    public void fly(){
        System.out.println("\tfly with wings");
    }

    @Override
    public void quack(){
        System.out.println("\tquacking");
    }
}