package Prob3;

public class BehaviorFactory{

    public static final String CANNOT_FLY = "cannot fly";
    public static final String FLY_WITH_WINGS = "fly with wings";
    public static final String QUACK = "quack";
    public static final String SQUEAK = "squeak";
    public static final String MUTE_QUACK = "mute quack";


    public static FlyBehavior getFlyBehavior(String type){
        switch(type){
            case CANNOT_FLY:
                return new CannotFly();
            case FLY_WITH_WINGS:
                return new FlyWithWings();
            default: return null;
        }
    }

    public static QuackBehavior getQuackBehavior(String type){
        switch(type){
            case QUACK:
                return new Quack();
            case SQUEAK:
                return new Squeak();
            case MUTE_QUACK:
                return new MuteQuack();
            default: return null;
        }
    }
}