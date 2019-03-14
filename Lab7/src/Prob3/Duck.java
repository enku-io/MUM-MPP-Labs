package Prob3;

public abstract class Duck implements FlyBehavior,QuackBehavior{

   // private QuackBehavior quackBehavior;
   // private FlyBehavior flyBehavior;

   // public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
   //     this.flyBehavior = flyBehavior;
   //     this.quackBehavior = quackBehavior;
   // }

    public void swim(){
        System.out.println("\tswimming");
    }
    public abstract void display();

   /* public void quack(){
        if(quackBehavior != null) quackBehavior.quack();
    }

    public void fly(){
        if(flyBehavior != null) flyBehavior.fly();
    } */
}