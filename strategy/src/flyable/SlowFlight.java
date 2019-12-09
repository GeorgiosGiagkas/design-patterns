package flyable;

public class SlowFlight implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("A slow flyer!");
    }
}
