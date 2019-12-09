package flyable;

public class NoFlight implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot Fly!");
    }
}
