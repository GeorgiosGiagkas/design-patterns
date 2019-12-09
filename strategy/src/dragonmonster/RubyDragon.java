package dragonmonster;

import attack.FireBreathing;
import flyable.FastFlight;

public class RubyDragon extends Dragon {

    public RubyDragon() {
        super.breathAttack = new FireBreathing();
        super.flyBehavior = new FastFlight();
    }

    @Override
    public void display() {
        System.out.println("This is a ruby dragon!");
    }
}
