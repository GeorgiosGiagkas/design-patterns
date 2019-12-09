import dragonmonster.BabyDragon;
import dragonmonster.Dragon;
import dragonmonster.FrostDragon;
import dragonmonster.RubyDragon;
/*This is an example of Strategy Design Pattern!
        *Stragegy pattern defines a family of algorithms(ex set of behaviors) encapsulates each and makes them
        interchangable. It allows algorithm to change indepentend of clients that use it.



        Design principles that are used:
        -Encapsulate what varies
        -Favor composition over inheritance
        -Program to an interface(supertype) not implementations.


        In the example:
        Strategy Pattern is used to separate the behavior(fly,attack) from the Dragon class.
        Concrete classes implement the behavior interface(encapsulate what varies) and are used as instance variables
        (favor composetion over inheritance) in the abstract class Dragon.

        */
public class StrategyPattern {
    public static void main(String args[]){
        Dragon dragon = new RubyDragon();

        dragon.display();
        dragon.fly();
        dragon.attack();

        Dragon dragon2 = new FrostDragon();

        dragon2.display();
        dragon2.fly();
        dragon2.attack();


        Dragon dragon3 = new BabyDragon();

        dragon3.display();
        dragon3.fly();
        dragon3.attack();

    }
}
