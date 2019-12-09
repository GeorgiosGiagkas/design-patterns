package dragonmonster;

import attack.IceBreathing;
import flyable.SlowFlight;

public class FrostDragon extends Dragon {
    public FrostDragon() {
        super.breathAttack = new IceBreathing();
        super.flyBehavior = new SlowFlight();
    }

    @Override
    public void display() {
        System.out.println("This is a frost dragon!");
    }
}
