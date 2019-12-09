package attack;

public class NoAttack implements BreathAttack {
    @Override
    public void breathAttack() {
        System.out.println("Cannot attack!");
    }
}
