package flyable;

public class FastFlight implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("A fast flyer!");
    }
}
