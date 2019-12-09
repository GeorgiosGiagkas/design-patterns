package dragonmonster;

import attack.NoAttack;
import flyable.NoFlight;

public class BabyDragon extends Dragon {

    public BabyDragon() {
        super.breathAttack = new NoAttack();
        super.flyBehavior = new NoFlight();
    }

    @Override
    public void display() {
        System.out.println("This is a baby dragon!");
    }
}
