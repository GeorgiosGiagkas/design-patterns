package dragonmonster;

import attack.BreathAttack;
import flyable.FlyBehavior;

public abstract class Dragon {

    protected FlyBehavior flyBehavior;
    protected BreathAttack breathAttack;

    public void fly(){
        flyBehavior.fly();
    }
    public void attack(){
        breathAttack.breathAttack();
    }

    public abstract void display();
}
