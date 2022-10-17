import animal.Animal;
import animal.Eagle;
import animal.Shark;
import animal.Turtle;
import jdk.dynalink.linker.support.TypeUtilities;

import java.util.PropertyResourceBundle;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {new Shark(), new Turtle(), new Eagle()};
        for(Animal animal : animals){
            if (animal.getClass().getName().equals("animal.Shark")){
                ((Shark)animal).attack();
            }else if (animal.getClass().getName().equals("animal.Turtle")){
                ((Turtle)animal).swim();
            } else if (animal.getClass().getName().equals("animal.Eagle")) {
                ((Eagle)animal).fly();
            }
        }
        System.out.println();

        Animal [] animals1 = {new Shark(), new Turtle(), new Eagle()};
        for(Animal animal : animals1){
            if (animal instanceof Shark){
                ((Shark)animal).attack();
            }else if(animal instanceof Turtle){
                ((Turtle)animal).swim();
            }else if(animal instanceof Eagle){
                ((Eagle)animal).fly();
            }
        }
        Shark []sharks = {new Shark()};
        Turtle [] turtles ={new Turtle()};
        Eagle [] eagles = {new Eagle()};

    }
}