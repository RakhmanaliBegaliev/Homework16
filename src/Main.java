import animal.Animal;
import animal.Eagle;
import animal.Shark;
import animal.Turtle;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();



        Animal [] animals = {shark, turtle, eagle};
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

         for (Animal animal : animals){
             if (animal instanceof Shark){
                 ((Shark)animal).attack();
             }else if (animal instanceof Turtle){
                 ((Turtle)animal).swim();
             }else if (animal instanceof Eagle){
                 ((Eagle)animal).fly();
             }
         }




    }
}