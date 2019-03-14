package Prob3;

public class MallardDuck extends Duck {
    
    /*public MallardDuck(){
        super(BehaviorFactory.getQuackBehavior(BehaviorFactory.QUACK), 
        BehaviorFactory.getFlyBehavior(BehaviorFactory.FLY_WITH_WINGS));
    }*/

    @Override
    public void display(){
        System.out.println("\tdisplay");
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